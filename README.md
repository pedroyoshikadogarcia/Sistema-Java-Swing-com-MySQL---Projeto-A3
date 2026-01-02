📚 Sistema de Gestão de Indicação de livros, podcasts, videos, entre outros.
---
Este projeto é uma aplicação desktop desenvolvida em Java Swing com persistência de dados em MySQL, criada para o Projeto A3 da Universidade São Judas Tadeu. O sistema funciona como um organizador pessoal de estudos, permitindo cadastrar e gerenciar indicações de livros, filmes, podcasts e vídeos educativos.

🚀 Funcionalidades
---
Autenticação: Tela de login para acesso seguro ao sistema.

Gestão de Pessoas: Cadastro de nome, telefone e e-mail com salvamento direto no banco de dados.

Visualização em Tempo Real: Listagem dinâmica dos dados cadastrados em componentes JTable.

Manipulação de Dados: Funções para editar e excluir registros existentes.

Conexão Segura: Implementação do padrão ConnectionFactory para gerenciamento de sessões com o MySQL.


🛠️ Tecnologias Utilizadas
---
Linguagem: Java 17.

Interface Gráfica: Swing (JFrame).

Banco de Dados: MySQL 8.0.

Dependências: Maven (mysql-connector-j).

IDE: Netbeans.

📋 Configuração do Banco de Dados
---
Para que o projeto funcione, você deve criar o banco de dados localmente. Utilize o script abaixo no seu MySQL Workbench:

-- Criar o banco de dados
CREATE DATABASE db_pessoas;
USE db_pessoas;

-- Criar a tabela de pessoas
CREATE TABLE tb_pessoa (
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL,
    tel VARCHAR(20),
    email VARCHAR(100)
);

-- Criar a tabela de contas
CREATE TABLE tb_conta (
    numero INT PRIMARY KEY,
    saldo DECIMAL(12, 2)
);

🔧 Como Rodar o Projeto
---
1. Clone o repositório:

git clone https://github.com/pedroyoshikadogarcia/Sistema-Java-Swing-com-MySQL---Projeto-A3.git

2. Importe no Netbeans: Abra o projeto como um projeto Maven.

3. Verifique a Conexão: No arquivo ConnectionFactory.java, certifique-se de que o usuário seja root e a senha seja 1234.

4. Resolução de Erros de Driver: Caso apareça o erro "Driver JDBC não encontrado", abra o terminal do Netbeans e execute:

mvn clean install -U

5. Execute: Rode o arquivo LoginTela.java para iniciar.
---
✒️ Autor
Pedro Yoshikado Garcia 
