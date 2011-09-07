Slamdunk
========
Slamdunk is a Java library for the Dribbble API (βeta). Currently this library is in development and will provide basic support activities on Dribbble. Slamdunk has minimal dependencies and is aimed to be easy to use.

Base URI
--------
All endpoints will use `http://api.dribbble.com/` as a prefix

SHOTS ENDPOINTS
---------------

- GET /shots/:id
- GET /shots/:id/rebounds
- GET /shots/:list
- GET /players/:id/shots
- GET /players/:id/shots/following
- GET /players/:id/shots/likes

PLAYERS ENDPOINTS
-----------------

- GET /players/:id
- GET /players/:id/followers
- GET /players/:id/following
- GET /players/:id/draftees

COMMENTS ENDPOINTS
------------------

- GET /shots/:id/comments

COPYRIGHT
---------
Copyright (c) 2011 Nitin Dhar. See LICENSE for details.