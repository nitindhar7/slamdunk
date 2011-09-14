package com.slamdunk.api;

public class Endpoint {
	
    /**
     * All calls should be made using http://api.dribbble.com/
     * as the endpoint (e.g. calling players/:id would be
     * http://api.dribbble.com/players/:id).
     */
	public String BASE_URI = "http://api.dribbble.com/";

    /**
     * ENDPOINTS
     */
	public String SHOTS_URI = BASE_URI + "shots/?";
	public String SHOTS_REBOUNDS_URI = BASE_URI + "shots/?/rebounds";
	public String SHOTS_LIST_URI = BASE_URI + "shots/?";
	public String PLAYERS_SHOTS_URI = BASE_URI + "players/?/shots";
	public String PLAYERS_SHOTS_FOLLOWING_URI = BASE_URI + "players/?/shots/following";
	public String PLAYERS_SHOTS_LIKES_URI = BASE_URI + "players/?/shots/likes";
	public String PLAYERS_URI = BASE_URI + "players/?";
	public String PLAYERS_FOLLOWERS_URI = BASE_URI + "players/?/followers";
	public String PLAYERS_FOLLOWING_URI = BASE_URI + "players/?/following";
	public String PLAYERS_DRAFTEES_URI = BASE_URI + "players/?/draftees";
	public String SHOTS_COMMENTS_URI = BASE_URI + "shots/?/comments";
    
    /**
     * Singleton
     */
    private static Endpoint endpoint = new Endpoint();
    
    /**
     * Returns an instance of the endpoint singleton
     * @return endpoint
     */
    public static Endpoint getInstance() {
    	return endpoint;
    }

}
