#!/bin/bash
set -e

echo 'Compilando e executando testes..'
mvn test
echo 'Sucesso!'

exec "$@"
