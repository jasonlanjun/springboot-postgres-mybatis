# SpringBoot-PostgreSQL-Mybatis

Test cases

Select
Get
http://localhost:8080/db/select

Insert
POST
    {
        "name": "admin1",
        "email": "admin1@email.com",
        "age": 30
    }

http://localhost:8080/db/insert

Update
PUT
    {
        "name": "admin",
        "email": "jun.lan@email.com",
        "age": 31
    }
http://localhost:8080/db/update


Delete
DELETE
http://localhost:8080/db/delete/admin1
