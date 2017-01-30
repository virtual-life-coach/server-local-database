# Course Project - Virtual Lifestyle Coach 

**Introduction to Service Design and Engineering | University of Trento**

**Server | Local Database**

**Student**: Gianvito Taneburgo (182569)

This file aims to provide a short documentation for the course project. Further details can be found in the report [here](https://github.com/virtual-life-coach/common/blob/master/report.pdf).
The original instructions can be found [here](https://docs.google.com/document/u/1/d/1kU66KOoprmdypDEE1W1bs1iQsX-Vf7_SXH7gAm5UYMU/edit?usp=sharing).

The project was developed individually.

Server URL: [https://vlc-server-local-database.herokuapp.com/](https://vlc-server-local-database.herokuapp.com/)

## Project structure

The project repository is made up of the following *files* and **folders**:
* **src/main**: application source code
    * **META-INF**: metadata directory
        * *persistence.xml*: JPA configuration file
    * **vlc**: Java source code
        * **common**: ref [common module](https://github.com/virtual-life-coach/common) 
        * **ldb**:
            * **dao**: layer accessing model objects
                * **transformer**: classes converting model objects from/to TOs
                * **updater**: transform model objects
                * *EntityDAO.java*: retrieves model objects by using the persistence layer
            * **model**: model objects (POJOs annotated to be persisted via JPA)
            * **persistence**: layer handling persistence via JPA
                * *PersistenceManager.java*: singleton that executes JPA operations on data
            * **soap**: SOAP layer for clients 
                * *LocalDatabase.java*: SOAP interface for client methods
                * *LocalDatabaseImpl.java*: implementation of the endpoint interface
                * *Publisher.java*: registers SOAP endpoint            
* **WebContent**: web application
    * **META-INF**: metadata directory
        * *persistence.xml*: JPA configuration file
        * *MANIFEST.MF*: manifest file
    * **WEB-INF**: server resources
        * **lib**: server dependencies
        * *web.xml*: Java EE deployment descriptor
    * *index.html*: home page
    * *loading_cube.gif*: home page content
* *build.xml*: Ant configuration file containing task definitions (see next paragraph)
* *ivy.xml*: Ivy configuration file containing server dependencies
* *Procfile*: Heroku task configuration file
* *README.md*: this file
* *system.properties*: Heroku JDK configuration file


## Project tasks

Some Ant tasks are defined inside *build.xml*. An overview of what each task does follows. Tasks' dependencies are in brackets:
* *download-ivy*: downloads Ivy jar from the Maven repository
* *install-ivy* (*download-ivy*): adds Ivy jar to the working directory
* *resolve* (*install-ivy*): downloads ivy dependencies for server
* *init* (*install-ivy*, *resolve*): initializes server workspace
* *clean*: initializes server workspace
* *install* (*clean*, *init*): compiles server code 
* *start*: register SOAP endpoint; it is executed by Heroku via Procfile
