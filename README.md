# spring-cloud

# Gestion des Factures - Architecture Micro-Services

## Objectif
Développer une application basée sur une architecture micro-service permettant de gérer les factures contenant des produits et appartenant à un client.

## Description
Ce projet est une application de gestion de facturation, divisée en plusieurs micro-services :

1. **Customer-Service** : Gestion des informations des clients.
2. **Inventory-Service** : Gestion des produits en stock.
3. **Billing-Service** : Gestion des factures en relation avec les produits et les clients.
4. **Spring Cloud Gateway** : Point d'entrée unique pour l'ensemble des micro-services.
5. **Eureka Discovery** : Service de découverte pour l'enregistrement et la gestion des micro-services.

## Architecture
L'architecture micro-services est composée des éléments suivants :

- **Customer-Service** : Service gérant les informations des clients.
- **Inventory-Service** : Service gérant les produits disponibles.
- **Billing-Service** : Service gérant la facturation, reliant les clients aux produits.
- **Spring Cloud Gateway** : Gateway permettant de diriger les requêtes vers les micro-services appropriés.
- **Eureka Discovery Server** : Serveur Eureka permettant la découverte des services.

## Technologies Utilisées
- **Spring Boot**
- **Spring Cloud (Gateway, Eureka Discovery, OpenFeign)**
- **Java**
- **MySQL/H2 Database**
- **Angular** (Client Web)

## Prérequis
- Java 17+
- Maven 3.6+
- Node.js et npm pour l'interface Angular
- Base de données MySQL (ou H2 pour l'environnement de développement)
- IntelliJ IDEA ou tout autre IDE Java

## Configuration et Exécution
1. Cloner le dépôt Git :
   ```bash
   git clone https://github.com/medbel12/spring-cloud.git

# Vidéos de Référence
## Première partie : Customer-Service, Inventory-Service, Spring Cloud Gateway, Eureka Discovery
Vidéo 1 - YouTube

## Deuxième partie : Billing-Service avec OpenFeign Rest Client
Vidéo 2 - YouTube

## Troisième partie : Création d'un Client Angular
Vidéo 3 - YouTube
