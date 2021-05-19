#Author: maturandomassas@gmail.com
Feature: Casos de teste
  Eu como usuário quero realizar testes relacionados com o cadastro e o login do usuário

  @executa
  Scenario: cadastro - preencher todos os campos
    Given que eu esteja no "http://advantageonlineshopping.com/#/"
    And clique no botao do utilizador
    And clique em criar nova conta
    When preencher todos os campos
    Then cadastro realizado com sucesso

  @executa
  Scenario: cadastro - apenas os campos obrigatorios
    Given que eu esteja no "http://advantageonlineshopping.com/#/" dois
    And clique no botao do utilizador  dois
    And clique em criar nova conta  dois
    When preencher apenas os campos obrigatorios dois
    Then cadastro realizado com sucesso  dois

  @executa
  Scenario: login - preencher o campo login e senha incorretos
    Given que eu esteja em "http://advantageonlineshopping.com/#/" tres
    And apertar no botao do utilizador  tres
    When preencher o campo de login e senha incorretos tres
    Then entao nao efetuar cadastro tres

  @executa
  Scenario: cadastro - não preencher o campo email obrigatorio
    Given que eu esteja em "http://advantageonlineshopping.com/#/" quatro
    And apertar no botao do utilizador  quatro
    When preencher os campos obrigatorios menos o email  quatro
    Then entao nao efetuar cadastro  quatro

  @executa
  Scenario: login - inserir login e senha corretos
    Given que eu esteja em "http://advantageonlineshopping.com/#/" cinco
    And apertar no botao do utilizador cinco
    When preencher os campos de login e senha cinco
    Then entao efetuar login  cinco
