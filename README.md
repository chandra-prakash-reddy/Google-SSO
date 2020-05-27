# Google-SSO
single sign on for google authentication

# PreRequisites # 
   * Install Java8
      * installation  : https://www.oracle.com/technetwork/java/jdk8-downloads-2133151.html
      * documentation : https://docs.oracle.com/javase/8/docs/api
   * SpringBoot sources
      * documentaion : https://spring.io/docs
   * Maven
      * installation  : https://maven.apache.org/download.cgi
      * documentation : https://maven.apache.org/guides

# configuration #
   * open  ***src/main/resources/application.properties***
   * generate client_id and secret_id here ***https://console.developers.google.com/apis/dashboard***
   * provide property ***spring.security.oauth2.client.registration.google.client-id***
   * provide property ***spring.security.oauth2.client.registration.google.client-secret***

# Run #
   * move to project root directory
   * run ***mvn verify*** 
   * run ***java -jar target/*.jar --server.port=<port\>**
      * example: java -jar target/*.jar --server.port=7878
  
# Demo #
   * open ***http(s)://<host\>:<port\>***  in web browser
       * example http://localhost:7878
   * sign in page will be available for login
    
# References #
   * Google Develper Docs ***https://developers.google.com/identity/sign-in/web/sign-in#before_you_begin***
   * Spring Docs ***https://spring.io/guides/tutorials/spring-boot-oauth2/***
   
