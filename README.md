# avaliacao-media-notas
Sistema de avaliação de alunos desenvolvido em Java, com o objetivo de calcular a média de duas notas e verificar a situação do aluno.

O sistema classifica os resultados em três situações:

Aprovado: média maior ou igual a 7.

Recuperação: média maior ou igual a 5 e menor que 7.

Reprovado: média menor que 5.

Também realiza a validação das notas, permitindo apenas valores entre 0 e 10.

O projeto utiliza JUnit 5 para testes unitários e Cucumber para testes de comportamento (BDD).

Integrantes:

Gabriela Asevedo de Amorim

Guilherme Lucas de Souza Ribeiro

Lavínia Lucia Martins

Instruções de execução

Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

Java (JDK 17 ou superior)

Apache Maven

Git (opcional, para clonar o repositório)

1. Clonar o repositório

Abra o terminal e execute:

git clone https://github.com/Gabriela-Amorim/avaliacao-media-notas

Entre na pasta do projeto:

cd avaliacao-media-notas

2. Executar os testes

No terminal, dentro da pasta do projeto, execute:

mvn test

O Maven irá compilar o projeto e executar automaticamente os testes unitários com JUnit 5 e os cenários BDD com Cucumber.

3. Verificar os resultados

Ao final da execução, o terminal apresentará o resultado dos testes.

Se tudo estiver funcionando corretamente, será exibida a mensagem:

BUILD SUCCESS

O projeto possui 6 testes no total:

3 testes unitários com JUnit 5.

3 cenários de comportamento com Cucumber.
