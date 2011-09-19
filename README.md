Slamdunk
========
Slamdunk is a Java library for the Dribbble API (βeta). This library will provide basic support activities on Dribbble. Slamdunk has minimal dependencies and is aimed to be easy to use.

Android
-------
Android platform to be tested soon!

Build & Use
-----------
Each API method in this library is heavily commented. The descriptions are taken directly from Dribbble. Please check the official [Dribbble API documentation](http://dribbble.com/api) for up to date API definitions and descriptions.
To begin, build Slamdunk and import it in your code.

    $ ant

    import com.slamdunk.api;

    SlamdunkAPI slamdunk = new SlamdunkAPIClient();

    // Shot stats
    slamdunk.shot(SHOT_ID);
    
    // Shot rebounds
    slamdunk.shotRebounds(SHOT_ID);
    
    // Player details by id OR username
    slamdunk.player(PLAYER_ID)
    slamdunk.player(USERNAME)

    // Players followers
    slamdunk.playerFollowers(PLAYER_ID);
    
    // Get shot comments
    slamdunk.shotComments(SHOT_ID)

Note that each library API endpoint returns a JSONObject. For more information on JSONObject visit [json.org/java](http://json.org/java/). The dependency json-java jar file is also included in the `lib` folder.
Also, at the moment the rate limit threshold is hard. It is up to the client application to ensure that it sticks close to the 60 calls/min limit.

Details for the rest of the available API endpoints are given inline.

Contribute
------------
Submit well documented code with unit tests and I will merge your changes in
as long as your code does not break the build. Here are some things that need
to be done:

- refactor and remove redundancy
- Return full json
- Create SlamdunkException
- Rate limit API methods
- all authenticated API calls 
- rename API methods to something simpler
- fix broken SlamdunkAPIClient endpoints/tests
- Helper method to get all endpoints as Map<String,String>
- Decouple/refactor code
- Add some tests using optional params
- rename properties in buildfile
- maybe cache stuff?
- "tobeFixed" tests

Slamdunk API Endpoints
----------------------
This library is built around the Slamdunk API version 2. At the moment there are 11 API endpoints available and each of them uses `http://api.dribbble.com/` as the base URI. Also at the moment, API calls are rate limited to 60
calls per minute, so keep that in mind when designing your applications.

Authors
-------

Our aim is to make Slamdunk integration into Java applications as easy as possible. We have tried our best to provide in-code documentation for each method.
Tests coming up soon! Until then please help us find bugs.

- Nitin Dhar

  - Forrst: https://forrst.com/people/nitindhar7
  - Site: http://coding-sense.blogspot.com
  - Twitter: @nitin_dhar

COPYRIGHT
---------
Copyright (c) 2011 Nitin Dhar. See LICENSE for details.