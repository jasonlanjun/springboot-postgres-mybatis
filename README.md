# SpringBoot-PostgreSQL-Mybatis

Test cases

Select: http://localhost:8080/db/select
HTTP Get


Insert: http://localhost:8080/db/insert
HTTP POST
Body:
   {
        "name": "admin1",
        "email": "admin1@email.com",
        "age": 30
    }


Update: http://localhost:8080/db/update
HTTP PUT
Body:
    {
        "name": "admin",
        "email": "jun.lan@email.com",
        "age": 31
    }


Delete: http://localhost:8080/db/delete/admin1
HTTP DELETE

