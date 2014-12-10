webapp-loan-explorer
====================

Programming task
----------------
Using the Kiva loans API (http://build.kiva.org/api) retrieve the loan information for 100 random loans. 
Create a web application, which allows for exploration and or visualization of the repayment histories of these 100 individuals.

Description
-----------

This project shows ...

To use the project from the browser on development, the url is:

- http://localhost:8080/weather-info/

To see the rest service, here are some examples:

- http://localhost:8080/weather-info/rest/city/Baltimore,md
- http://localhost:8080/weather-info/rest/city/Orlando,fl

Development
-----------

- clone or download the git project from github
- import the maven project on eclipse, use import maven projects.
- should work on netbeans too, but has not been tested with this ide.
- to run on development, a local tomcat should be setup on eclipse and right click on the project.
and click run on server, and select the tomcat server.
- to test unit tests right click on the unit tests and run as junit tests.
- to test on the browser go to the urls previously shown.
- to package the project use mvn package on eclipse, will generate a war file. 
- war file can be installed on a servlet container like tomcat or jboss, tested on tomcat.

kiva rest api
-------------

http://build.kiva.org/api
http://api.kivaws.org/v1/loans/newest.json?per_page=100
http://api.kivaws.org/v1/loans/810881.json