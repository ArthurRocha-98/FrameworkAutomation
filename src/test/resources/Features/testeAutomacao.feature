Feature: Teste Automacao

  Aula modulo 1

  Scenario: Validar se o botao pesquisar esta funcionando corretamente
    Given que eu acesse o site da google
    When e digitar o texto universidade qa
    And clicar no botao pesquisar
    Then devera aparecer a tela com a lista de pesquisas encontradas no google
