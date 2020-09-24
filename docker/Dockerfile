FROM maven:slim

RUN mkdir /app
WORKDIR /app

# Executa script de inicialização
ENTRYPOINT [ "/app/docker/entrypoint.sh" ]
#CMD [ "mvn", "exec:java" ]