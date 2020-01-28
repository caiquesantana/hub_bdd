# language: pt

Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que eu esteja no site
    E clico em criar nova conta

  @CadastroSucesso
  Cenário: Cadastro de usuario com sucesso
    Quando insiro todas as informções do usuário
    E clico no botão de registra
    Então eu valido se o usuário foi cadastrado
		
    @CadastroFalha
    Cenário: Cadastro de usuario com falha
    Quando insiro as informções do usuário e tento enviar o formulario
    Então apresenta o erro de login invalido
    