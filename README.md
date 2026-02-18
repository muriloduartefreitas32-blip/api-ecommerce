🛒 E-commerce API - Spring Boot

API RESTful desenvolvida com Spring Boot para gerenciamento de Produtos e Categorias, implementando relacionamento entre entidades (OneToMany / ManyToOne), arquitetura em camadas e boas práticas de desenvolvimento backend.

Projeto construído com foco em organização, escalabilidade e simulação de ambiente real de mercado.

🚀 Tecnologias e Ferramentas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

Hibernate

PostgreSQL

Gradle

Lombok

Git & GitHub

🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

Controller → Service → Repository → Database

🔹 Controller

Responsável pelos endpoints REST e comunicação HTTP.

🔹 Service

Camada de regras de negócio e validações.

🔹 Repository

Integração com banco de dados via Spring Data JPA.

🔹 Entities

Mapeamento ORM utilizando anotações JPA.

🔗 Modelagem e Relacionamentos

Implementação de relacionamento:

@OneToMany

@ManyToOne

Exemplo:

Uma Categoria pode ter vários Produtos

Um Produto pertence a uma única Categoria

Aplicando corretamente:

Mapeamento bidirecional

Uso de DTO para evitar recursividade

Separação entre entidade e camada de resposta

📦 Funcionalidades
Produtos

Criar produto

Listar todos

Buscar por ID

Atualizar

Deletar

Categorias

Criar categoria

Listar categorias

Remover categoria

🛡️ Boas Práticas Aplicadas

✔️ Separação de responsabilidades (SRP)
✔️ DTO Pattern (Request / Response)
✔️ Tratamento global de exceções (@RestControllerAdvice)
✔️ Uso de Optional para validação de existência
✔️ Injeção de dependência via construtor
✔️ Organização modular por pacotes
✔️ Versionamento com Git

⚙️ Como Executar
git clone https://github.com/seu-usuario/api-ecommerce.git
cd api-ecommerce
./gradlew bootRun


Aplicação roda em:

http://localhost:8080

📄 Exemplo de Requisição
{
  "nome": "Smartphone",
  "descricao": "Android 256GB",
  "preco": 2500.00,
  "categoriaId": 1
}

📈 Próximas Evoluções Planejadas

Implementação de autenticação JWT

Paginação e ordenação

Documentação com Swagger/OpenAPI

Dockerização

Deploy em nuvem
