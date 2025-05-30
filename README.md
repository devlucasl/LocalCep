# 📍 Local CEP

**Local CEP** é uma aplicação desenvolvida em Java com Spring Boot que permite consultar informações de um CEP (Código de Endereçamento Postal) utilizando a API pública [ViaCEP](https://viacep.com.br/).

---

## 💡 Como funciona?

O usuário insere um CEP (apenas números), e a aplicação realiza uma requisição para a API ViaCEP. Com isso, são retornadas e exibidas as seguintes informações:

- CEP formatado
- Logradouro (rua)
- Bairro
- Cidade
- Estado (UF)

---

## 🔎 Validações e Comportamentos

- A aplicação **não permite** letras ou caracteres especiais — apenas números.
- O CEP inserido é automaticamente formatado para o padrão `XXXXX-XXX`.
- Caso o CEP seja inválido ou não encontrado, será exibida uma mensagem de erro informando a situação.

📸 *Exemplo de mensagem de erro (adicione aqui uma imagem ilustrativa)*

---

## 📋 Pré-requisitos

Certifique-se de ter os seguintes itens instalados para rodar o projeto:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Spring Boot CLI (opcional)](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-installing-spring-boot)

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Maven**
- **ViaCEP API**

---

## 🚀 Como executar o projeto

1. Clone este repositório:
 ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
````
2. Acesse a pasta do projeto:
```bash
cd local-cep
````
3. Compile o projeto com o Maven:
```bash
mvn clean install
````
4. Execute a aplicação:

```bash
mvn spring-boot:run
````

5. Acesse no navegador:
  ```bash
http://localhost:8080
````
![image](https://github.com/user-attachments/assets/eeb3c332-e3e4-40a6-9615-70503a340ff3)
###
![image](https://github.com/user-attachments/assets/6158c8dc-b5e9-4b13-8f57-cca22ce1b956)
###
![image](https://github.com/user-attachments/assets/80dff48d-ea82-49e7-b106-0fdffb2145de)


