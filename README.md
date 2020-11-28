# Spring Eureka Server

The following application is created on spring boot and is being used as an eureka server, this application will be used to register all applications in the eureka cluster.

This eureka server is connected to an configuration server to get all configurations in order to start the application, if the configuration server is down the application is configured to don't start it.

# Features
As part of the configuration that I enable to this application is the restriction to only request the cluster information each hour this to don't spend the hours in the heroku instance where is the place that this application is running.