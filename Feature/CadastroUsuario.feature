# language: pt
# coding: utf-8

Funcionalidade: Cadastrar Usuário
	
	Contexto:
	Dado que eu esteja no site
	
Cenário: Mostrar mensagem de sucesso ao criar novo usuário
  Dado que eu tenha acessado o site 
  E eu tenho acesso a parte de Create new accout
  E eu estou em criar nova conta de usuário
  Quando insiro todas as informções do usuário
  E eu clico no botão de registra
  Então eu deveria  ver a mensagem de usuário cadastrado