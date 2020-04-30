# Cookie/Token Approach for HttpSecurity rememberMe() Authentication


The purpose of this work was to understand 'remember me' HttpSecurity configuration with token based authentication.


 Environment!

  - Usual web development environment consisting of Ubuntu, Java, Gradle, PostgreSQL, Browsers and Postman
  


HOW TO RUN:
  - Create a psql db and add the creds to the application properties file
  - You are good to go ==> Boot run.
  - The users will be created on the go.
  - Application consists of only 3 urls - befor-login, login, after-login
  - Try the endpoint ```localhost:8080/before-login```, you will get a 200-OK response with some json
  - Try the ```localhost:8080/login``` endpoint in a browser, a login form will appear. The post can be done in the postman also.
  - Response will be ```X-Auth-Token``` (and ```remember-me``` cookie if checked).
  - Now check the endpoint ```localhost:8080/after-login``` with only x-auth-token in header and only cookie in request.


USERS(username/password):
  - admin/admin123
  - test/admin123