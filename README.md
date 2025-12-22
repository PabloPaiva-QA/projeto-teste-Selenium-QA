# Projeto Teste Selenium QA

Este repositório contém a automação desenvolvida para o desafio prático de testes automatizados utilizando **Selenium WebDriver com Java**, aplicando **BDD com Cucumber**.
O objetivo é demonstrar a criação de cenários reutilizáveis em um ambiente web, utilizando boas práticas de **Page Object Model**, **Hooks do Cucumber**, **reutilização de passos** e **integração contínua via GitHub Actions**, incluindo execução **cross-browser**.

---

## 📚 Sumário

* [🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [📁 Estrutura do Projeto](#-estrutura-do-projeto)
* [⚙️ Como instalar as dependências](#-como-instalar-as-dependências)
* [▶️ Como rodar os testes](#-como-rodar-os-testes)
* [🧪 Cenários Automatizados](#-cenários-automatizados)
  * [Login (`login.feature`)](#login-loginfeature)
* [🧩 Arquitetura e Boas Práticas](#-arquitetura-e-boas-práticas)
* [🔄 Integração Contínua (CI)](#-integração-contínua-ci)
* [Autor](#autor)

---

## 🛠️ Tecnologias Utilizadas

* Java 17  
* Maven  
* Selenium WebDriver  
* Cucumber (BDD)  
* JUnit 5  
* WebDriverManager  
* GitHub Actions (CI)

---

## 📁 Estrutura do Projeto
```
selenium-bdd-project/
├── .github/workflows/
│ └── ci.yml
├── src/
│ └── test/
│ ├── java/
│ │ ├── drivers/
│ │ │ └── DriverFactory.java
│ │ ├── hooks/
│ │ │ └── Hooks.java
│ │ ├── pages/
│ │ │ └── LoginPage.java
│ │ ├── steps/
│ │ │ └── LoginSteps.java
│ │ └── runners/
│ │ └── RunCucumberTest.java
│ └── resources/
│ ├── features/
│ │ └── login.feature
│ └── cucumber.properties
├── pom.xml
└── README.md
```

---

## ⚙️ Como instalar as dependências

1. Certifique-se de ter **Java 17** instalado e configurado (`JAVA_HOME`).  
2. Certifique-se de ter **Maven** instalado e configurado (`MAVEN_HOME`).  
Verifique:
```bash
java -version
mvn -version
```

3. Clone o repositório:
```
git clone https://github.com/SEU_USUARIO/selenium-bdd-project.git
```
4. Acesse o diretório do projeto:
```
cd selenium-bdd-project
```
5. Instale as dependências via Maven:
```
mvn clean install
```





---

## ▶️ Como rodar os testes
Executar todos os testes (Chrome por padrão)
```
mvn clean test
```
Executar em navegador específico
```
mvn clean test -Dbrowser=firefox
```

📌 Navegadores suportados: Chrome, Firefox, Edge
📌 Durante a execução local, o navegador será aberto para visualização dos testes.
📌 No GitHub Actions, os testes rodam em modo headless.

---

## 🧪 Cenários Automatizados
Os testes foram desenvolvidos com foco em cobertura funcional, clareza e reutilização através de Page Object Model e Hooks do Cucumber.

### Login (login.feature)

A funcionalidade de login foi escolhida por ser uma das principais portas de entrada do sistema.

#### 🔎 Motivo da escolha

É essencial para acessar páginas protegidas

Erros de autenticação impactam diretamente o usuário

Permite validar diferentes tipos de credenciais

Fluxo reutilizável para outros testes futuros

#### ✅ Cenários de Teste

1. Login com credenciais válidas
Garante que o usuário consiga acessar o sistema com usuário e senha corretos.

2. Tentativa de login com credenciais inválidas
Confirma que o sistema exibe mensagens adequadas de erro e não autentica usuários inválidos.

3. Login sem informar credenciais
Verifica a obrigatoriedade dos campos e o comportamento do sistema ao tentar logar sem dados.

---

## 🧩 Arquitetura e Boas Práticas

* BDD com Cucumber para clareza e comunicação com o negócio
* Page Object Model para organização e manutenção do código
* Hooks do Cucumber para controle de Before e After dos testes
* DriverFactory para centralizar criação e configuração do WebDriver
* Separação clara de responsabilidades
* Cenários independentes e isolados

---

## 🔄 Integração Contínua (CI)

O projeto utiliza GitHub Actions para rodar os testes automaticamente.
Características do CI:
* Execução a cada push e em pull requests
* Ambiente Linux (ubuntu-latest)
* Java 17
* Execução cross-browser: Chrome, Firefox, Edge
* Build falha automaticamente se algum teste falhar

---

## Autor
Pablo Paiva
