# Academia-digital-JPA
Desafio de Projeto DIO - Aplicação Rest de uma Academia

## Mudanças feitas com base no repositório Original:
https://github.com/cami-la/academia-digital

- As datas estão no formato "yyyy-MM-dd";
- Cascade.Refresh no relacionamento das Entidades;
- Implementação de Delete e Update para as Entidades.

Conhecendo o Projeto Spring Data JPA na Prática
Sejam bem-vindos ao projeto de LAB Conhecendo o Projeto Spring Data JPA na Prática oferecida gratuitamente pela plataforma de cursos online Digital Innovation One .
🎯Objetivo do Projeto
Ao final deste projeto, o Devo conhecer os principais conceitos de mapeamento objeto relacional (ORM) usando o Spring Data JPA . Para isso, uma API RESTful será desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.

🛑Pré-requistos
Fundamentos do Spring Boot

Noções de SQL

🚦guia
Apresentação do Projeto Base
Configuração do banco de dados (SGBD PostgreSQL )
Aplicando como anotações
Execução do fluxo back-end: Controller - Serviço - Repositório
Validação - Hibernate Validator
Consultas Avançadas - Consulta Derivada - Consulta Nativa
🛠Tecnologias Utilizadas
IDE IntelliJ
Java 11
Especialista
web de primavera
Spring Data JPA
Driver PostgreSQL
Validador de hibernação
Lombok
Carteiro
Anotações de Mapeamento
@Entity Usado para especificar que uma classe anotada atualmente representa um tipo de entidade.

@Table Usada para especificar uma tabela principal da entidade atualmente anotada.

@Id Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

@GeneratedValue Especifica que o valor do identificador de entidade é gerado automaticamente.

@Column Usado para especificar o mapeamento entre um atributo de entidade básica e a coluna da tabela de banco de dados.

@JoinColumn Usada para especificar uma coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

@OneToMany Usada para especificar um relacionamento de banco de dados um-para-muitos.

@OneToOne Usado para especificar um relacionamento de banco de dados um-para-um.

@ManyToOne Usado para especificar um relacionamento de banco de dados muitos-para-um.

cascata Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

mappedBy Indica qual é o lado inverso ou não dominante da relação.

🔗Links Úteis
Spring Initializer
Propriedades comuns do aplicativo
Spring Data JPA - Documentação de referência
Implementação de Referência de Validação: Guia de Referência
🤝Contribuindo
Este repositório foi criado para fins de estudo, então contribua com ele. Se te ajudari de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identifique com o conteúdo, não deixe de compatibilizar.

Se possível:

⭐️estrela o projeto

🐛Encontrar e relatar problemas
