# language: pt
Funcionalidade: Avaliação de Alunos

  Cenário: Aluno aprovado com notas 8 e 6
    Dado que o aluno obteve as notas 8 e 6
    Quando calcular a média e verificar a situação
    Então a média deve ser 7
    E a situação deve ser "APROVADO"

  Cenário: Aluno em recuperação com notas 6 e 6
    Dado que o aluno obteve as notas 6 e 6
    Quando calcular a média e verificar a situação
    Então a média deve ser 6
    E a situação deve ser "RECUPERACAO"

  Cenário: Erro ao informar nota 11 e 8
    Dado que o aluno obteve as notas 11 e 8
    Quando tentar calcular a média
    Então deve lançar um erro de nota inválida
