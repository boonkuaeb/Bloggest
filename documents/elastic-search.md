**Install Elasticsearch via docker container**

1. Pull Elasticsearch Images
    ```docker
    docker pull docker.elastic.co/elasticsearch/elasticsearch:6.5.1
    ```
2. Create elasticserch container
    ```docker
    docker run -d --name elasticsearch_bloggest -p 9200:9200 -p 9300:9300 -e "http.host=0.0.0.0" -e "transport.host=0.0.0.0" docker.elastic.co/elasticsearch/elasticsearch:6.5.1
    ```
3. Edit application.properties file
    ```properties
    spring.data.elasticsearch.cluster-nodes=localhost:9300
    spring.data.elasticsearch.cluster-name=docker-cluster
    ```
