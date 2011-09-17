package com.slamdunk.api;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class SlamdunkAPIClient implements SlamdunkAPI {

    private static HttpRequest http;
    
    public SlamdunkAPIClient() {
        http = new HttpRequest();
    }
    
    public JSONObject shot(int id) {
        return http.get(Endpoint.getInstance().SHOTS_URI, Integer.toString(id));
    }

    public JSONObject shotRebounds(int id) {
        return http.get(Endpoint.getInstance().SHOTS_REBOUNDS_URI, Integer.toString(id));
    }

    public JSONObject shotsList(String listType) {
        return http.get(Endpoint.getInstance().SHOTS_LIST_URI, listType);
    }

    public JSONObject shotComments(int id) {
        return http.get(Endpoint.getInstance().SHOTS_COMMENTS_URI, Integer.toString(id));
    }

    public JSONObject player(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_URI, Integer.toString(id));
    }
    
    public JSONObject player(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_URI, username);
    }

    public JSONObject playerShots(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_URI, Integer.toString(id));
    }
    
    public JSONObject playerShots(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_URI, username);
    }

    public JSONObject playerFollowers(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_FOLLOWERS_URI, Integer.toString(id));
    }
    
    public JSONObject playerFollowers(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_FOLLOWERS_URI, username);
    }

    public JSONObject playerFollowing(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_FOLLOWING_URI, Integer.toString(id));
    }
    
    public JSONObject playerFollowing(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_FOLLOWING_URI, username);
    }

    public JSONObject playerShotsFollowing(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_FOLLOWING_URI, Integer.toString(id));
    }
    
    public JSONObject playerShotsFollowing(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_FOLLOWING_URI, username);
    }

    public JSONObject playerShotsLikes(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_LIKES_URI, Integer.toString(id));
    }
    
    public JSONObject playerShotsLikes(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_SHOTS_LIKES_URI, username);
    }

    public JSONObject playerDraftees(int id) {
        return http.get(Endpoint.getInstance().PLAYERS_DRAFTEES_URI, Integer.toString(id));
    }
    
    public JSONObject playerDraftees(String username) {
        return http.get(Endpoint.getInstance().PLAYERS_DRAFTEES_URI, username);
    }

    public Map<String, String> getEndpointsURIs() {
        Map<String,String> endpoints = new HashMap<String,String>();
        
        endpoints.put("shots/id", Endpoint.getInstance().SHOTS_URI);
        endpoints.put("shots/id/rebounds", Endpoint.getInstance().SHOTS_REBOUNDS_URI);
        endpoints.put("shots/list", Endpoint.getInstance().SHOTS_LIST_URI);
        endpoints.put("players/id/shots", Endpoint.getInstance().PLAYERS_SHOTS_URI);
        endpoints.put("players/id/shots/following", Endpoint.getInstance().PLAYERS_SHOTS_FOLLOWING_URI);
        endpoints.put("players/id/shots/likes", Endpoint.getInstance().PLAYERS_SHOTS_LIKES_URI);
        endpoints.put("players/id", Endpoint.getInstance().PLAYERS_URI);
        endpoints.put("players/id/followers", Endpoint.getInstance().PLAYERS_FOLLOWERS_URI);
        endpoints.put("players/id/following", Endpoint.getInstance().PLAYERS_FOLLOWING_URI);
        endpoints.put("players/id/draftees", Endpoint.getInstance().PLAYERS_DRAFTEES_URI);
        endpoints.put("shots/id/comments", Endpoint.getInstance().SHOTS_COMMENTS_URI);
        
        return endpoints;
    }

}
