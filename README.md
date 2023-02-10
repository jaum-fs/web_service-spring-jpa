
### WEB SERVICE COM SPRING BOOT

O projeto web service com spring boot é uma aplicação back-end realizada na intenção de por em práticas os conhecimentos adquiridos durante as aulas de Java.

Como é uma aplicação back-end os métodos de CRUD podem ser testados no [Postman](https://www.postman.com/).




### Ferramentas

 - IDE -> Spring Suite Tool
 - Linguagem -> Java
 - Framework -> Spring Boot
 - Banco de Dados -> H2 e PostgreSQL
 - Deploy -> Heroku


### Documentação da API

#### Retorna todos os usuários

```http
  GET /https://springbootwebservice.herokuapp.com/users
```

#### Retorna um usuário expecífico

```http
  GET /https://springbootwebservice.herokuapp.com/users/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Insere um usuário

```http
  POST /https://springbootwebservice.herokuapp.com/users/
```

#### Deleta um usuário a partir do id

```http
  DELETE /https://springbootwebservice.herokuapp.com/users/{id}
```

#### Atualiza um usuário a partir do id

```http
  PUT /https://springbootwebservice.herokuapp.com/users/{id}
```

### Observação

O erro no [link](https://springbootwebservice.herokuapp.com/) da api é normal, visto que não há um projeto front-end pra mesma

porém se usar /{request} ela funciona corretamente

