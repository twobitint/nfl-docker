#!/bin/bash

if [ "$1" = 'install' ]; then
    until nc -z db 5432
    do
        sleep 1
    done
    sleep 1

    curl -o nfldb.sql.zip http://burntsushi.net/stuff/nfldb/nfldb.sql.zip \
        && unzip nfldb.sql.zip \
        && PGPASSWORD=nfldb psql -h db -U nfldb < nfldb.sql \
        && PGPASSWORD=nfldb psql -h db -U nfldb -c "INSERT INTO team (team_id, city, name) VALUES ('LA', 'Los Angeles', 'Rams')" \
        && PGPASSWORD=nfldb psql -h db -U nfldb -c "UPDATE team SET team_id = 'JAX' WHERE team_id = 'JAC'" \
        && sed -i "/JAC/    ['JAX', 'Jacksonville', 'Jaguars', 'Jacksonville Jaguars', 'JAC'],/" /usr/lib/python2.7/site-packages/nfldb/team.py \
        && python /usr/lib/python2.7/site-packages/nflgame/update_sched.py --rebuild --year 2015 --phase POST
        && nfldb-update
fi
