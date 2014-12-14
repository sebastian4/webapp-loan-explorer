webapp-loan-explorer
====================

Programming task
----------------
Using the Kiva loans API (http://build.kiva.org/api) retrieve the loan information for 100 random loans. 
Create a web application, which allows for exploration and or visualization of the repayment histories of these 100 individuals.

URLs
----

To use the project from the browser on development, the url is:

- http://localhost:8080/webapp-loan-explorer/

To see the rest service, here are some examples: format is rest/size/page_number

- http://localhost:8080/webapp-loan-explorer/rest/10/1
- http://localhost:8080/webapp-loan-explorer/rest/10/2

Development
-----------

- clone or download the git project from github
- import the maven project on eclipse or netbeans, use import maven projects.
- to run on development, a local tomcat should be setup on eclipse and right click on the project.
and click run on server, and select the tomcat server.
- to test unit tests right click on the unit tests and run as junit tests.
- to test on the browser go to the urls previously shown.
- to package the project use mvn package on eclipse, will generate a war file. 
- war file can be installed on a servlet container like tomcat or jboss, tested on tomcat.

Notes
-----

- I could just retrieve the data from kiva and save the static pages and use the static pages
- I wanted to retrieve the data from kiva when the page is first loaded
- The kiva rest server gives me a 403 forbidden after loading about 40 pages so I am only loading 40 instead of 100
- Let me know if this is ok, if not, i can first load the data to have it static, then work with that data

kiva rest api
-------------

http://build.kiva.org/api
http://api.kivaws.org/v1/loans/newest.json?per_page=100
http://api.kivaws.org/v1/loans/810881.json
