## Restaurant Manager (Spring Boot 3, Java 17)

APIs para gestão de usuários (CRUD), troca de senha e validação de login.

### Executar com Docker

```bash
docker compose up --build
```

Aplicação em `http://localhost:8080` e docs em `http://localhost:8080/swagger-ui.html`.

### Perfis
- dev: H2 em memória, console em `/h2-console`
- prod: H2 em arquivo em `/data/usersdb`



