package com.slamdunk.api;

import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.TestCase;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class HttpRequestTests {
    
    private HttpRequest http = new HttpRequest(); 
    
    @Test (groups={"ready"})
    public void testGet() throws MalformedURLException {
        String sampleJSON = "{\"post\":{\"date\":\"2011/09/04\",\"user\":\"sample\"},\"user\":{\"age\":10,\"name\":\"sample\"}}";
        URL url = getClass().getClassLoader().getResource("sample_data.json");
        JSONObject sampleData = http.get(url.toString() + "?", "");
        
        TestCase.assertEquals(sampleJSON, sampleData.toString());
    }
    
    @Test (groups={"ready"})
    public void testGetData() {
        String sampleJSON = "{\"post\":{\"date\":\"2011/09/04\",\"user\":\"sample\"},\"user\":{\"age\":10,\"name\":\"sample\"}}";
        URL url = getClass().getClassLoader().getResource("sample_data.json");
        JSONObject sampleData = http.getData(url.toString());
        
        TestCase.assertEquals(sampleJSON, sampleData.toString());
    }

}
