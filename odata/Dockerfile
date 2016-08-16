FROM centos:7

RUN yum update -y
RUN yum install -y \
    java-1.7.0-openjdk \
    java-1.7.0-openjdk-devel \
    git \
    which

# install maven
RUN curl -o mvn.tar.gz http://mirror.metrocast.net/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz \
    && tar xzvf mvn.tar.gz \
    && cp apache-maven-3.3.9/bin/mvn /usr/bin \
    && cp apache-maven-3.3.9/bin/mvnDebug /usr/bin \
    && cp apache-maven-3.3.9/bin/mvnyjp /usr/bin
ENV M2_HOME="/apache-maven-3.3.9"

# add source
RUN git clone https://github.com/shunjikonishi/odata-producer
COPY Team.java /odata-producer/src/main/java/jp/co/flect/odataproducer/entities
COPY Game.java /odata-producer/src/main/java/jp/co/flect/odataproducer/entities

# build source
RUN cd odata-producer \
    && mvn package

CMD ["/bin/sh", "-c", "cd /odata-producer && ./run.sh"]
