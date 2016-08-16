FROM postgres:9.6

RUN curl -o nfldb.sql.zip http://burntsushi.net/stuff/nfldb/nfldb.sql.zip \
    && unzip nfldb.sql.zip \
    && psql -U nfldb < nfldb.sql \
    && psql -U nfldb -c "INSERT INTO team (team_id, city, name) VALUES ('LA', 'Los Angeles', 'Rams')" \
    && psql -U nfldb -c "UPDATE team SET team_id = 'JAX' WHERE team_id = 'JAC'"

CMD ["postgres"]
