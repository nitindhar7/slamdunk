package com.slamdunk.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpRequest {
    
    /**
     * GET data from Dribbble using the request URI
     * with URL parameters
     * 
     * @param requestURI Dribbble URI requested
     * @param params Map of URL parameters and their values
     * @return JSONObject containing a response
     */
    public JSONObject get(String requestURI, String param) {
        return getData(requestURI.replace("?", param));
    }
    
    /**
     * Workhorse method that GETs data from a URL and
     * returns the result as a JSON object
     * 
     * @param requestURI The Dribbble endpoint requested
     * @return JSONObject containing the full Dribbble API response
     */
    protected JSONObject getData(String requestURI) {
        String jsonResult = "";
        
        JSONObject json = null;

        try {
            URL url = new URL(requestURI);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String responseLine;
            while ((responseLine = in.readLine()) != null) {
                jsonResult += responseLine;
            }

            in.close();
            
            json = new JSONObject(jsonResult);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid URL requested");
        } catch (IOException e) {
            throw new RuntimeException("Could not read from requested stream");
        } catch (JSONException e) {
            throw new RuntimeException("JSON could not be formed");
        }
        
        return json;
    }

}
