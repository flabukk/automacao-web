$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PesquisarQA.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisa com o QA",
  "description": "Como um recrutador\nQuero colher dados da pesquisa \nPara fazer análises mais detalhadas do QA",
  "id": "pesquisa-com-o-qa",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@PesquisarQA"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Preencher pesquisa com dados obrigatórios válidos",
  "description": "",
  "id": "pesquisa-com-o-qa;preencher-pesquisa-com-dados-obrigatórios-válidos",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 10,
  "name": "que eu acesse a página da VV Test",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "acesse o menu \"Pesquisa – QA\"",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu preencher todos os campos obrigatórios",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "deve ser direcionado para uma página de sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisarQA.queEuAcesseAPáginaDaVVTest()"
});
formatter.result({
  "duration": 8588207700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pesquisa – QA",
      "offset": 15
    }
  ],
  "location": "PesquisarQA.acesseOMenu(String)"
});
formatter.result({
  "duration": 2795519400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarQA.euPreencherTodosOsCamposObrigatórios()"
});
formatter.result({
  "duration": 16639408900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarQA.deveSerDirecionadoParaUmaPáginaDeSucesso()"
});
formatter.result({
  "duration": 2159357700,
  "status": "passed"
});
formatter.after({
  "duration": 1026241000,
  "status": "passed"
});
});