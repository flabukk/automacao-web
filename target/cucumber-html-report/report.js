$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de Usuario no sistema do Zé Delivery",
  "description": "Sendo eu um cliente do Zé delivery\r\nquero automatizar o cadastro de usuario",
  "id": "cadastro-de-usuario-no-sistema-do-zé-delivery",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@CadastroUsuario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Cadastrar usuário válido",
  "description": "",
  "id": "cadastro-de-usuario-no-sistema-do-zé-delivery;cadastrar-usuário-válido",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que informo maior idade",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu acesso a pagina de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho o campo Nome e sobrenome com o valor \u003cnome_sobrenome\u003e",
  "keyword": "E "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#E preencho o campo E-mail com o valor \u003cemail\u003e"
    }
  ],
  "line": 16,
  "name": "preencho o campo E-mail com um valor de e-mail genérico",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho o campo Senha com o valor \"Automacao001\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "preencho o campo CPF com o valor \u003ccpf\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "preencho o campo Celular com o valor \u003ctelefone\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho o campo \u0027Qual a sua idade?\u0027 com o valor \"23\"",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "aceito os termos",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "aceito as Notificações",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "confirmo o cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "é exibido a página inicial do sistema",
  "keyword": "Então "
});
formatter.step({
  "line": 25,
  "name": "eu verifico se o nome cadastrado é igual a \u003cnome_sobrenome\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "eu verifico se o telefone cadastrado é igual a \u003ctelefone\u003e",
  "keyword": "E "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "cadastro-de-usuario-no-sistema-do-zé-delivery;cadastrar-usuário-válido;",
  "rows": [
    {
      "cells": [
        "nome_sobrenome",
        "email",
        "cpf",
        "telefone"
      ],
      "line": 30,
      "id": "cadastro-de-usuario-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;1"
    },
    {
      "cells": [
        "\"Ze Delivery\"",
        "\"automacao10006@gmail.com\"",
        "\"37366727059\"",
        "\"11977454286\""
      ],
      "line": 31,
      "id": "cadastro-de-usuario-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que estou no site \"https://www.ze.delivery/\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.ze.delivery/",
      "offset": 19
    }
  ],
  "location": "CadastroUsuario.que_estou_no_site(String)"
});
formatter.result({
  "duration": 13181438700,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Cadastrar usuário válido",
  "description": "",
  "id": "cadastro-de-usuario-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@CadastroUsuario"
    },
    {
      "line": 10,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que informo maior idade",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu acesso a pagina de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencho o campo Nome e sobrenome com o valor \"Ze Delivery\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#E preencho o campo E-mail com o valor \u003cemail\u003e"
    }
  ],
  "line": 16,
  "name": "preencho o campo E-mail com um valor de e-mail genérico",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho o campo Senha com o valor \"Automacao001\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "preencho o campo CPF com o valor \"37366727059\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "preencho o campo Celular com o valor \"11977454286\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho o campo \u0027Qual a sua idade?\u0027 com o valor \"23\"",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "aceito os termos",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "aceito as Notificações",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "confirmo o cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "é exibido a página inicial do sistema",
  "keyword": "Então "
});
formatter.step({
  "line": 25,
  "name": "eu verifico se o nome cadastrado é igual a \"Ze Delivery\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "eu verifico se o telefone cadastrado é igual a \"11977454286\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.que_informo_maior_idade()"
});
formatter.result({
  "duration": 1092935000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.eu_acesso_a_pagina_de_cadastro()"
});
formatter.result({
  "duration": 3197913700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ze Delivery",
      "offset": 47
    }
  ],
  "location": "CadastroUsuario.preencho_o_campo_Nome_e_sobrenome_com_o_valor(String)"
});
formatter.result({
  "duration": 2262795700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.preencho_o_campo_E_mail_com_um_valor_de_e_mail_genérico()"
});
formatter.result({
  "duration": 2348729600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automacao001",
      "offset": 36
    }
  ],
  "location": "CadastroUsuario.preencho_o_campo_Senha_com_o_valor(String)"
});
formatter.result({
  "duration": 2381173300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "37366727059",
      "offset": 34
    }
  ],
  "location": "CadastroUsuario.preencho_o_campo_CPF_com_o_valor(String)"
});
formatter.result({
  "duration": 2228495600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11977454286",
      "offset": 38
    }
  ],
  "location": "CadastroUsuario.preencho_o_campo_Celular_com_o_valor(String)"
});
formatter.result({
  "duration": 2210703200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23",
      "offset": 50
    }
  ],
  "location": "CadastroUsuario.preencho_o_campo_Qual_a_sua_idade_com_o_valor(String)"
});
formatter.result({
  "duration": 2204542200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.aceito_os_termos()"
});
formatter.result({
  "duration": 2096218000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.aceito_as_Notificações()"
});
formatter.result({
  "duration": 2110120200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.confirmo_o_cadastro()"
});
formatter.result({
  "duration": 5468276800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.é_exibido_a_página_inicial_do_sistema()"
});
formatter.result({
  "duration": 2195642700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ze Delivery",
      "offset": 44
    }
  ],
  "location": "CadastroUsuario.eu_verifico_se_o_nome_cadastrado_é_igual_a(String)"
});
formatter.result({
  "duration": 1073262700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11977454286",
      "offset": 48
    }
  ],
  "location": "CadastroUsuario.eu_verifico_se_o_telefone_cadastrado_é_igual_a(String)"
});
formatter.result({
  "duration": 1059072400,
  "status": "passed"
});
formatter.after({
  "duration": 1403045600,
  "status": "passed"
});
formatter.after({
  "duration": 4347005800,
  "status": "passed"
});
formatter.uri("ConsultarClima.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Consultar dados metereologicos",
  "description": "a partir de uma requisição do tipo GET\r\n\nContexto\n\tDado que eu quero consultar o clima de uma cidade",
  "id": "consultar-dados-metereologicos",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Consultar clima por cidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-cidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que eu realizo a chamada da api de consultar clima para a cidade \u003ccidade\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu valido do ResponseBody o campo \"name\" igual a \u003ccidade\u003e",
  "keyword": "E "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-cidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;",
  "rows": [
    {
      "cells": [
        "status",
        "cidade"
      ],
      "line": 14,
      "id": "consultar-dados-metereologicos;consultar-clima-por-cidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;1"
    },
    {
      "cells": [
        "200",
        "\"London\""
      ],
      "line": 15,
      "id": "consultar-dados-metereologicos;consultar-clima-por-cidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 15,
  "name": "Consultar clima por cidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-cidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que eu realizo a chamada da api de consultar clima para a cidade \"London\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu valido do ResponseBody o campo \"name\" igual a \"London\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 66
    }
  ],
  "location": "ConsultarClima.que_eu_realizo_a_chamada_da_api_de_consultar_clima_para_a_cidade(String)"
});
formatter.result({
  "duration": 3256152600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 35
    },
    {
      "val": "London",
      "offset": 50
    }
  ],
  "location": "ConsultarClima.eu_valido_do_ResponseBody_o_campo_igual_a_cidade(String,String)"
});
formatter.result({
  "duration": 569714600,
  "status": "passed"
});
formatter.after({
  "duration": 4307072100,
  "status": "passed"
});
formatter.after({
  "duration": 4141332000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Consultar clima por idCidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-idcidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 19,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que eu realizo a chamada da api de consultar clima por ID cidade \u003cidCidade\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "eu valido do ResponseBody o campo \"name\" igual a \u003ccidade\u003e",
  "keyword": "E "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-idcidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;",
  "rows": [
    {
      "cells": [
        "status",
        "cidade",
        "idCidade"
      ],
      "line": 25,
      "id": "consultar-dados-metereologicos;consultar-clima-por-idcidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;1"
    },
    {
      "cells": [
        "200",
        "\"London\"",
        "2172797"
      ],
      "line": 26,
      "id": "consultar-dados-metereologicos;consultar-clima-por-idcidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 26,
  "name": "Consultar clima por idCidade e verificar se o campo NAME retorna o nome da Cidade informado na consulta",
  "description": "",
  "id": "consultar-dados-metereologicos;consultar-clima-por-idcidade-e-verificar-se-o-campo-name-retorna-o-nome-da-cidade-informado-na-consulta;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 19,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "que eu realizo a chamada da api de consultar clima por ID cidade 2172797",
  "matchedColumns": [
    2
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "eu valido do ResponseBody o campo \"name\" igual a \"London\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "2172797",
      "offset": 65
    }
  ],
  "location": "ConsultarClima.que_eu_realizo_a_chamada_da_api_de_consultar_clima_por_ID_cidade(int)"
});
formatter.result({
  "duration": 1265385000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 35
    },
    {
      "val": "London",
      "offset": 50
    }
  ],
  "location": "ConsultarClima.eu_valido_do_ResponseBody_o_campo_igual_a_cidade(String,String)"
});
formatter.result({
  "duration": 14557000,
  "status": "passed"
});
formatter.after({
  "duration": 4256378700,
  "status": "passed"
});
formatter.after({
  "duration": 4380521500,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Validação de acessos no sistema do Zé Delivery",
  "description": "Sendo eu um cliente do Zé delivery\r\nquero automatizar os acessos ao sistema",
  "id": "validação-de-acessos-no-sistema-do-zé-delivery",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Cadastrar usuário válido",
  "description": "",
  "id": "validação-de-acessos-no-sistema-do-zé-delivery;cadastrar-usuário-válido",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que informo maior idade",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu acesso a pagina de Login",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "realizo o acesso com o E-mail \u003cemail\u003e e senha \u003csenha\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "é exibido a página inicial do sistema",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "eu verifico se o e-mail cadastrado é igual a \u003cemail\u003e",
  "keyword": "E "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validação-de-acessos-no-sistema-do-zé-delivery;cadastrar-usuário-válido;",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ],
      "line": 19,
      "id": "validação-de-acessos-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;1"
    },
    {
      "cells": [
        "\"automacao1010@gmail.com\"",
        "\"Automacao001\""
      ],
      "line": 20,
      "id": "validação-de-acessos-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que estou no site \"https://www.ze.delivery/\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.ze.delivery/",
      "offset": 19
    }
  ],
  "location": "CadastroUsuario.que_estou_no_site(String)"
});
formatter.result({
  "duration": 9142822700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Cadastrar usuário válido",
  "description": "",
  "id": "validação-de-acessos-no-sistema-do-zé-delivery;cadastrar-usuário-válido;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@Login"
    },
    {
      "line": 10,
      "name": "@Regressivo"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que informo maior idade",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu acesso a pagina de Login",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "realizo o acesso com o E-mail \"automacao1010@gmail.com\" e senha \"Automacao001\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "é exibido a página inicial do sistema",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "eu verifico se o e-mail cadastrado é igual a \"automacao1010@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.que_informo_maior_idade()"
});
formatter.result({
  "duration": 1091133700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.eu_acesso_a_pagina_de_Login()"
});
formatter.result({
  "duration": 1068060100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automacao1010@gmail.com",
      "offset": 31
    },
    {
      "val": "Automacao001",
      "offset": 65
    }
  ],
  "location": "CadastroUsuario.realizo_o_acesso_com_o_E_mail_e_senha(String,String)"
});
formatter.result({
  "duration": 5523278100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuario.é_exibido_a_página_inicial_do_sistema()"
});
formatter.result({
  "duration": 4025235200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automacao1010@gmail.com",
      "offset": 46
    }
  ],
  "location": "CadastroUsuario.eu_verifico_se_o_e_mail_cadastrado_é_igual_a(String)"
});
formatter.result({
  "duration": 1057347600,
  "status": "passed"
});
formatter.after({
  "duration": 1108536400,
  "status": "passed"
});
formatter.after({
  "duration": 4433787200,
  "status": "passed"
});
});