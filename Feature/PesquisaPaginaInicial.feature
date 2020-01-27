# language: pt
Funcionalidade: Busca de um produto pela pagina inicial

  Contexto: 
    Dado que estou na tela home

  @BuscaHomeSucesso
  Cenário: Busca de produto pela home com sucesso
    Quando clico na categoria LAPTOPS
    E clico no produto
    Então estou na especificação do produto

  @BuscaHomeFalha
  Cenario: Certifica abertura de produto diferente
    E escolhe produto na tela inicial
    Entao abre produto diferente do que consta na  tela inicial
