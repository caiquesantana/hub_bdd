# language: pt
# coding: utf-8
Funcionalidade: Cadastrar Usuário

  Contexto: 
    Dado que eu esteja no site
    E clico em criar nova conta

  @CadastroSucesso
  Cenário: Cadastro de usuario com sucesso
    Quando e insiro todas as informções do usuário
    E clico no botão de registra
    Então o usuario é cadastrado com sucesso
