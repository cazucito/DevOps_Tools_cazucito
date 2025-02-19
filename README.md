# Clients API

A PoC of a CRUD (in memory) Clients API.

## DISCLAIMER

Don't use for a different purpose, its a Proof Of Concept.

## INFO

### ENDPOINTS

- http://{SERVER}:8888/clients
  - GET, POST and PUT
- http://localhost:8888/clients/{id-client}
  - GET
  - id-client: 1-26

### RUN

A simple way to run:

``` shell
./mvnw spring-boot:run
```

`Control + C` to stop.

## USE

### GET

#### clients/{id-client}

Request:

``` shell
curl http://localhost:8888/clients/1
```

Response:

``` json
{
    "idClient": 2,
    "name": "Beatriz",
    "surname": "Barrera"
}
```

#### clients

Request:

``` shell
curl http://localhost:8888/clients/
```

Response:

``` json
[
    {
        "idClient": 1,
        "name": "Alberto",
        "surname": "Alonso"
    },
    {
        "idClient": 2,
        "name": "Beatriz",
        "surname": "Barrera"
    },
    {
        "idClient": 3,
        "name": "Carlos",
        "surname": "Castañeda"
    },
    {
        "idClient": 4,
        "name": "Daniela",
        "surname": "Duarte"
    },
    {
        "idClient": 5,
        "name": "Eduardo",
        "surname": "Estrada"
    },
    {
        "idClient": 6,
        "name": "Fernanda",
        "surname": "Fuentes"
    },
    {
        "idClient": 7,
        "name": "Gerardo",
        "surname": "González"
    },
    {
        "idClient": 8,
        "name": "Héctor",
        "surname": "Herrera"
    },
    {
        "idClient": 9,
        "name": "Isabela",
        "surname": "Ibáñez"
    },
    {
        "idClient": 10,
        "name": "Jorge",
        "surname": "Jiménez"
    },
    {
        "idClient": 11,
        "name": "Karla",
        "surname": "Kuri"
    },
    {
        "idClient": 12,
        "name": "Luis",
        "surname": "López"
    },
    {
        "idClient": 13,
        "name": "Mariana",
        "surname": "Montes"
    },
    {
        "idClient": 14,
        "name": "Natalia",
        "surname": "Navarro"
    },
    {
        "idClient": 15,
        "name": "Octavio",
        "surname": "Ortega"
    },
    {
        "idClient": 16,
        "name": "Patricia",
        "surname": "Pérez"
    },
    {
        "idClient": 17,
        "name": "Querétaro",
        "surname": "Quintana"
    },
    {
        "idClient": 18,
        "name": "Ricardo",
        "surname": "Ramírez"
    },
    {
        "idClient": 19,
        "name": "Sofía",
        "surname": "Sánchez"
    },
    {
        "idClient": 20,
        "name": "Tomás",
        "surname": "Torres"
    },
    {
        "idClient": 21,
        "name": "Ulises",
        "surname": "Uribe"
    },
    {
        "idClient": 22,
        "name": "Valeria",
        "surname": "Vargas"
    },
    {
        "idClient": 23,
        "name": "Walter",
        "surname": "Wong"
    },
    {
        "idClient": 24,
        "name": "Ximena",
        "surname": "Xochimilco"
    },
    {
        "idClient": 25,
        "name": "Yahir",
        "surname": "Yáñez"
    },
    {
        "idClient": 26,
        "name": "Zulema",
        "surname": "Zamora"
    }
]
```

## METADATA

Version: 0.2.0
