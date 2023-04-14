# PagaTodo

###Versión Backend y FrontEnd

Backend : Spring Boot 2.7.10

FrontEnd : Angular 14.0.1


## Required software
BackEnd
- JDK 1.11
- Apache Maven 3.5.3
- H2

FrontEnd
- Node 16.17.0 en adelante
- npm 8.15.0 en adelante
- Angular CLI 14.2.2

## Repositories
- [BackEnd](https://github.com/LuisChica18/loginJWT-angular)
- [FrondEnd](https://github.com/LuisChica18/login-angular)

## Installation
The project can be run as a Spring-Boot application which requires the prior installation of MariaDB.

### Deployment

1. Instalación
```bash
$ cd <carpeta descargada de github>
$ mvn clean package install
```
4. Run
```bash
$ mvn spring-boot:run 
```

## Seguridad

### scripts Base de datos 

Los usuarios y roles son registrados de forma automática en la base de datos: `src/main/resources/data.sql`

Si desea gestionar un usuario en la aplicación es necesario registrarlo en este recurso.
### OAuth2.0 tokens

Se expone la sentencia para ejecutar el token

```bash
curl --location --request POST http://localhost:8081/oauth/token -H "Accept:application/json" -d "username=admin&password=123&grant_type=password"
```
También econtrará el archivo postman para importarlo  **postman/Login-Angular.postman_collection.json** podrá encontrar ejemplo del uso de los apis implementados.

Un ejemplo de uso sería
```bash
curl --location --request GET http://localhost:8081/api/v1/listar-usuarios -H "Authorization: Bearer saddsGFGFGKRTLRELRKERLFDFsdñkdsñeerwqeJEWEKN......"
```

## Autor
| [![](https://avatars.githubusercontent.com/u/12874292?s=40&v=4)](https://github.com/LuisChica18)|
|-|
| [@LuisChica18](https://github.com/LuisChica18)|
