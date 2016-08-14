#!/bin/bash

curl -o nfldb.sql.zip http://burntsushi.net/stuff/nfldb/nfldb.sql.zip \
    && unzip nfldb.sql.zip \
    && PGPASSWORD=nfldb psql -h db -U nfldb < nfldb.sql \
    && python /usr/lib/python2.7/site-packages/nflgame/update_sched.py --rebuild --year 2015 --phase POST
    && nfldb-update


# insert into team (team_id, city, name) values ('LA', 'Los Angeles', 'Rams');
# update team set team_id = JAX where team_id = JAC
# change /usr/lib/python2.7/site-packages/nfldb/team.py JAX -> JAC, JAC -> JAX
