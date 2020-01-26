# language: pt
Funcionalidade: Pesquisa de produto
  A pesquisa deve ser feita pelo campo de busca.

  Contexto: 
    Dado que estou na tela home
    Quando clico na lupa de pesquisa

  @PesquisaLupaSucesso
  Cenário: Buscar um produto sucesso
    E digito o nome do produto desejado
    E clico no produto
    Então estarei na tela do produto pesquisado

  @pesquisarProdutoInexistente
  Cenario: pesquisar produto inexistente
    E digitar um produto inexistente no site
    Entao constata que o produto nao existe
