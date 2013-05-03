call mvn eclipse:eclipse -U
call mvn clean package -P dev -U -Dmaven.test.skip=true
cd xc-code-web 
call mvn jetty:run
@pause
