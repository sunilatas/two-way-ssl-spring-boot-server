# two-way-ssl-spring-boot-server

# hello end point url : https://localhost:9002/two-way-ssl-server/api/v1/hello-server

# Ref : https://medium.com/@niral22/2-way-ssl-with-spring-boot-microservices-2c97c974e83

# Create Self Signed Server Cert: keytool -genkeypair -alias two-way-ssl-spring-boot-server -keyalg RSA -keysize 2048 -storetype JKS -keystore ssl-server.jks -validity 3650 -ext SAN=dns:localhost,ip:127.0.0.1