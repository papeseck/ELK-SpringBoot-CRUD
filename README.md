# Mon Projet Spring Boot avec ELK

Ce projet est une application Spring Boot qui utilise Elasticsearch, Logstash et Kibana (ELK) pour la gestion des journaux. L'application implémente un CRUD de base et est conçue pour être exécutée dans un environnement Docker.

## Prérequis

Assurez-vous d'avoir les éléments suivants installés sur votre machine :

- Docker
- Maven (pour construire l'application Spring Boot)

## Configuration ELK avec Docker

1. Téléchargez l'image Elasticsearch :

    ```bash
    docker pull docker.elastic.co/elasticsearch/elasticsearch:7.17.9
    ```

2. Exécutez Elasticsearch en mode "single-node" :

    ```bash
    docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.17.9
    ```

## Construction et Exécution de l'Application Spring Boot

1. Clonez ce dépôt :

    ```bash
    git clone https://github.com/papeseck/ELK-SpringBoot-CRUD.git
    cd ELK-SpringBoot-CRUD
    ```

2. Construisez l'application avec Maven :

    ```bash
    mvn clean install
    ```

3. Construisez l'image Docker de l'application :

    ```bash
    docker build -t elk-springboot-crud .
    ```

4. Exécutez l'application avec Docker :

    ```bash
    docker run -p 8080:8080 --link elasticsearch -e "SPRING_PROFILES_ACTIVE=production" elk-springboot-crud
    ```

## Accès à l'application

L'application sera accessible à l'adresse : [http://localhost:8080](http://localhost:8080)

## Visualisation des Journaux dans Kibana

1. Téléchargez l'image Kibana :

    ```bash
    docker pull docker.elastic.co/kibana/kibana:7.17.9
    ```

2. Exécutez Kibana :

    ```bash
   docker run -p 5601:5601 --link serene_kepler docker.elastic.co/kibana/kibana:7.17.9
    ```

Accédez à l'interface Kibana à l'adresse : [http://localhost:5601](http://localhost:5601) pour visualiser et analyser les journaux.

