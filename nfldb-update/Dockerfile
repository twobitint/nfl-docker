FROM centos:7

RUN yum update -y
RUN yum install -y \
    unzip \
    postgresql-server \
    postgresql-devel \
    gcc \
    python-devel \
    nmap

RUN curl -o get-pip.py https://bootstrap.pypa.io/get-pip.py \
    && python get-pip.py \
    && pip2 install nfldb

RUN cp /usr/share/nfldb/config.ini.sample /usr/share/nfldb/config.ini \
    && sed -ie 's/YOUR PASSWORD/nfldb/g' /usr/share/nfldb/config.ini \
    && sed -ie 's/localhost/db/g' /usr/share/nfldb/config.ini

COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh
ENTRYPOINT ["/docker-entrypoint.sh"]

CMD ["install"]
