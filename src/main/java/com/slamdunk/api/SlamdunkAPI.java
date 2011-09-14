package com.slamdunk.api;

import java.util.Map;

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
	public JSONObject player(String username);
	
	/**
	 * Returns the most recent shots for the player specified by id
	 * 
	 * @param id id of player whose shots to return
	 * @return JSON response
	 */
	public JSONObject playerShots(int id);
	public JSONObject playerShots(String username);
	
	/**
	 * Returns the list of followers for a player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerFollowers(int id);
	public JSONObject playerFollowers(String username);
	
	/**
	 * Returns the list of players followed by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerFollowing(int id);
	public JSONObject playerFollowing(String username);
	
	/**
	 * Returns the most recent shots published by those the
	 * player specified by id is following
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerShotsFollowing(int id);
	public JSONObject playerShotsFollowing(String username);

	/**
	 * Returns shots liked by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerShotsLikes(int id);
	public JSONObject playerShotsLikes(String username);
	
	/**
	 * Returns the list of players drafted by the player specified by id
	 * 
	 * @param id player id
	 * @return JSON response
	 */
	public JSONObject playerDraftees(int id);
	public JSONObject playerDraftees(String username);
	
	/**
     * Returns a map containing the name of the endpoint and its URI
     * @return A map of endpoint name and uri
     */
    public Map<String,String> getEndpointsURIs();
	
}
