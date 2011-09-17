package com.slamdunk.api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.TestCase;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class SlamdunkAPIClientTests {
    
    private SlamdunkAPI slamdunk = new SlamdunkAPIClient();
    
    @Test (groups={"ready"})
    public void testShot() {
        JSONObject json = slamdunk.shot(21603);
        TestCase.assertEquals(true, json.has("id"));
        TestCase.assertEquals(true, json.has("title"));
        TestCase.assertEquals(true, json.has("url"));
        TestCase.assertEquals(true, json.has("short_url"));
        TestCase.assertEquals(true, json.has("image_url"));
        TestCase.assertEquals(true, json.has("image_teaser_url"));
        TestCase.assertEquals(true, json.has("width"));
        TestCase.assertEquals(true, json.has("height"));
        TestCase.assertEquals(true, json.has("views_count"));
        TestCase.assertEquals(true, json.has("likes_count"));
        TestCase.assertEquals(true, json.has("comments_count"));
        TestCase.assertEquals(true, json.has("rebounds_count"));
        TestCase.assertEquals(true, json.has("rebound_source_id"));
        TestCase.assertEquals(true, json.has("created_at"));
        TestCase.assertEquals(true, json.has("player"));
    }
    
    @Test (groups={"ready"})
    public void testShotRebounds() {
        JSONObject json = slamdunk.shotRebounds(43424);
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("shots"));
    }
    
    @Test (groups={"ready"})
    public void testShotsList() {
        JSONObject json = slamdunk.shotsList("everyone");
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("shots"));
    }
    
    @Test (groups={"ready"})
    public void testShotComments() {
        JSONObject json = slamdunk.shotComments(21603);
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("comments"));
    }
    
    @Test (groups={"ready"})
    public void testPlayer() {
        JSONObject json = slamdunk.player(1);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.player("simplebits");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("id"));
        TestCase.assertEquals(true, json.has("name"));
        TestCase.assertEquals(true, json.has("username"));
        TestCase.assertEquals(true, json.has("url"));
        TestCase.assertEquals(true, json.has("avatar_url"));
        TestCase.assertEquals(true, json.has("location"));
        TestCase.assertEquals(true, json.has("twitter_screen_name"));
        TestCase.assertEquals(true, json.has("drafted_by_player_id"));
        TestCase.assertEquals(true, json.has("shots_count"));
        TestCase.assertEquals(true, json.has("draftees_count"));
        TestCase.assertEquals(true, json.has("followers_count"));
        TestCase.assertEquals(true, json.has("following_count"));
        TestCase.assertEquals(true, json.has("comments_count"));
        TestCase.assertEquals(true, json.has("comments_received_count"));
        TestCase.assertEquals(true, json.has("likes_count"));
        TestCase.assertEquals(true, json.has("likes_received_count"));
        TestCase.assertEquals(true, json.has("rebounds_count"));
        TestCase.assertEquals(true, json.has("rebounds_received_count"));
        TestCase.assertEquals(true, json.has("created_at"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerShots() {
        JSONObject json = slamdunk.playerShots(1);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerShots("simplebits");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("shots"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerFollowers() {
        JSONObject json = slamdunk.playerFollowers(1);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerFollowers("simplebits");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("players"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerFollowing() {
        JSONObject json = slamdunk.playerFollowing(1);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerFollowing("simplebits");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("players"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerShotsFollowing() {
        JSONObject json = slamdunk.playerShotsFollowing(2);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerShotsFollowing("frogandcode");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("shots"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerShotsLikes() {
        JSONObject json = slamdunk.playerShotsLikes(2);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerShotsLikes("frogandcode");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("shots"));
    }
    
    @Test (groups={"ready"})
    public void testPlayerDraftees() {
        JSONObject json = slamdunk.playerDraftees(1);
        Iterator<?> it = json.keys();
        while(it.hasNext()) {
            JSONObject jsonByUsername = slamdunk.playerDraftees("simplebits");
            jsonByUsername.has((String) it.next());
        }
        TestCase.assertEquals(true, json.has("page"));
        TestCase.assertEquals(true, json.has("pages"));
        TestCase.assertEquals(true, json.has("per_page"));
        TestCase.assertEquals(true, json.has("total"));
        TestCase.assertEquals(true, json.has("players"));
    }
    
    @Test (groups={"ready"})
    public void testGetEndpointURIs() {
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
        TestCase.assertEquals(endpoints, slamdunk.getEndpointsURIs());
    }

}
