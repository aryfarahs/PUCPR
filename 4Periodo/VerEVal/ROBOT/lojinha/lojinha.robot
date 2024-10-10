*** SETTINGS ***
Library    SeleniumLibrary

*** VARIABLES ***
${URL}    http://165.227.93.41/lojinha-web/

*** TEST CASES ***
CT1 - Acessar Lojinha com sucesso
    Abrir Site 
    Preencher Campo Usuario Com "rafael"
    Preencher Campo Senha Com "123456"

*** KEYWORDS ***
Abrir Site
    Open Browser    ${URL}   chrome 

Preencher Campo Usuario Com "${USER}"
    Input Text    name=usuario    ${USER}

Preencher Campo Senha Com "${PASSWORD}"
    Input Text    name=senha    ${PASSWORD}
    