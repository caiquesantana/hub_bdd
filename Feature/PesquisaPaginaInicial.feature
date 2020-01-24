# language: pt
Funcionalidade: Busca de um produto pela pagina inicial

  Contexto: 
    Dado que estou na tela home
    Quando clico na categoria LAPTOPS

@BuscaHomeSucesso
  Cenário: Busca de produto pela home com sucesso
    E clico no produto 
    Então estou na especificação do produto

