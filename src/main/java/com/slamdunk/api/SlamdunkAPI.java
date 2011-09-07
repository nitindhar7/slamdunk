package com.slamdunk.api;

import org.json.JSONObject;

public interface SlamdunkAPI {
	
	/**
	 * API calls are limited to 60 per minute. Dribbble may
	 * change the limit so check the official docs at
	 * http://dribbble.com/api for the most up to date information.
	 * Exceeding the limit will result in "access denied" errors.
	 */
	public int RATE_LIMIT = 60;
	
	/**
	 * All calls should be made using http://api.dribbble.com/
	 */
	public String BASE_URI = "http://api.dribbble.com/";
	
	/**
	 * ENDPOINTS
	 */
	public String SHOTS_URI = "shots/?";
	public String SHOTS_REBOUNDS_URI = "shots/?/rebounds";
	public String SHOTS_LIST_URI = "shots/?";
	public String PLAYERS_SHOTS_URI = "players/?/shots";
	public String PLAYERS_SHOTS_FOLLOWING_URI = "players/?/shots/following";
	public String PLAYERS_SHOTS_LIKES_URI = "players/?/shots/likes";
	public String PLAYERS_URI = "players/?";
	public String PLAYERS_FOLLOWERS_URI = "players/?/followers";
	public String PLAYERS_FOLLOWING_URI = "players/?/following";
	public String PLAYERS_DRAFTEES_URI = "players/?/draftees";
	public String SHOTS_COMMENTS_URI = "shots/?/comments";
	
	/**
	 * Returns details for a shot specified by id
	 * 
	 * @param id shot id
	 * @return JSON response
	 */
	public JSONObject shot(int id);
	
	/**
	 * Returns the set of rebounds (shots in response to a shot)
	 * for the shot specified by id
	 * 
	 * @param id shot id
	 * @return JSON response
	 */
	public JSONObject shotRebounds(int id);
	
	/**
	 * Returns the specified list of shots where list has one of
	 * the following values: debuts, everyone, popular
	 * 
	 * @param listType type of shots to return in list
	 * @return JSON response
	 */
	public JSONObject shotsList(String listType);
	
	/**
	 * Returns the set of comments for the shot specified by id
	 * 
	 * @param id shot id
	 * @return JSON response
	 */
	public JSONObject shotComments(int id);
	
	/**
	 * Returns profile details for a player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject player(int id);
	
	/**
	 * Returns profile details for a player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject player(String username);
	
	/**
	 * Returns the most recent shots for the player specified by id
	 * 
	 * @param id id of player whose shots to return
	 * @return JSON response
	 */
	public JSONObject playerShots(int id);
	
	/**
	 * Returns the most recent shots for the player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerShots(String username);
	
	/**
	 * Returns the list of followers for a player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerFollowers(int id);
	
	/**
	 * Returns the list of followers for a player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerFollowers(String username);
	
	/**
	 * Returns the list of players followed by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerFollowing(int id);
	
	/**
	 * Returns the list of players followed by the player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerFollowing(String username);
	
	/**
	 * Returns the most recent shots published by those the
	 * player specified by id is following
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerShotsFollowing(int id);
	
	/**
	 * Returns the most recent shots published by those the
	 * player specified by username is following
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerShotsFollowing(String username);

	/**
	 * Returns shots liked by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerShotsLikes(int id);
	
	/**
	 * Returns shots liked by the player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerShotsLikes(String username);
	
	/**
	 * Returns the list of players drafted by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerDraftees(int id);
	
	/**
	 * Returns the list of players drafted by the player specified by username
	 * 
	 * @param username player username
	 * @return JSON response
	 */
	public JSONObject playerDraftees(String username);
	
	// TODO: helper method to return a list of all endpoints
	
}
