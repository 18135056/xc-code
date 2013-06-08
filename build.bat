call mvn clean
call mvn install 
cd xc-code-web 
call mvn jetty:run
@pause
