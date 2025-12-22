Feature: Login no SauceDemo

  Scenario: Login com sucesso
    Given que estou na página de login
    When realizo login com usuario "standard_user" e senha "secret_sauce"
    Then devo ver a página inicial