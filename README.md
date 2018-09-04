# SessionScope
@SessionScope Example
server.session.cookie.max-age= 10
server.session.timeout= 10 

by setting timeout to your project you can check that once you update the USER age in controller it will be unchanged for 
the time of 10 seconds for any number of request and after 10 seconds new bean will be created and value will be default again.
I just created this project(in office hours) to help so dont judge the code quality.
