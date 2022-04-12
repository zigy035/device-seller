#Spring Boot Device Seller

##Endpoints

###Sign Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 77

{
    "name": "admin",
    "username": "admin",
    "password": "admin"
}
````

###Sign In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 55

{
    "username": "admin",
    "password": "admin"
}
````

###Change Role

````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDk4NTE5Mzd9.gOaLqxglgquaGVbNZJPFJDdt1j7-QHwZXOHT4NHhybJPwriSIGMoHxnMkeIuwOsQLwy1ci6mpRk06QkF3rlA6w
````

###Save Device

````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ5ODUyMjQyfQ.w6iVIvmZV5n_iQadQn3BTySyAUh6D_GfeeWVqlmKNQHl2EvMapatUh9J-vXScNFf-m4bb45obwgZmehQsSN6vQ
Content-Type: application/json
Content-Length: 105

{
    "name": "device-2",
    "description": "desc-2",
    "price": 10,
    "deviceType": "LAPTOP"
}
````

###Get Devices

````
GET /api/device HTTP/1.1
Host: localhost:8080
````

###Delete Device

````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ5ODUyMjQyfQ.w6iVIvmZV5n_iQadQn3BTySyAUh6D_GfeeWVqlmKNQHl2EvMapatUh9J-vXScNFf-m4bb45obwgZmehQsSN6vQ
````

###Save Purchase

````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ5ODUyMjQyfQ.w6iVIvmZV5n_iQadQn3BTySyAUh6D_GfeeWVqlmKNQHl2EvMapatUh9J-vXScNFf-m4bb45obwgZmehQsSN6vQ
Content-Type: application/json
Content-Length: 84

{
    "userId": "2",
    "deviceId": "2",
    "price": 9,
    "color": "blue"
}
````

###Get Purchases for Auth User

````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ5ODUyMjQyfQ.w6iVIvmZV5n_iQadQn3BTySyAUh6D_GfeeWVqlmKNQHl2EvMapatUh9J-vXScNFf-m4bb45obwgZmehQsSN6vQ
````
