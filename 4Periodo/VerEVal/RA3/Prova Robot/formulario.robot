*** Settings ***
Documentation    Teste de Avaliação de Cadatro do Fornecedor
Library          SeleniumLibrary

*** Variables ***
${URL}                   https://forms.office.com/pages/responsepage.aspx?id=w_YeiiSDA0G_ShMoxdw2U8bAlGkIKERKjhA2BSBR5mxUOU1FQkxDV1BOUjc3Q0M4MFdXVTM5SFJOTi4u&route=shorturl
${BROWSER}               Chrome

${NOME_EMPRESA}          xpath=//input[@aria-labelledby="QuestionId_rb0bf97002b20402faa716f69df244edb QuestionInfo_rb0bf97002b20402faa716f69df244edb"]
${ENDERECO_EMPRESA}      xpath=//input[@aria-labelledby="QuestionId_r0ba51155d92d431a8e44449efa3f199b QuestionInfo_r0ba51155d92d431a8e44449efa3f199b"]
${PROPRIETARIO}          xpath=//input[@aria-labelledby="QuestionId_r1b85a5598e50432bac5b6cdcb6b3df84 QuestionInfo_r1b85a5598e50432bac5b6cdcb6b3df84"]
${CONTATO}               xpath=//input[@aria-labelledby="QuestionId_r32ba7bf4f68b4fecb17099ccf106ecb0 QuestionInfo_r32ba7bf4f68b4fecb17099ccf106ecb0"]
${DATA_DE_CADASTRO}      id=DatePicker0-label
${BTN_ENVIAR}            xpath=//button[@data-automation-id="submitButton"]
${SUCESSO}               Suas respostas foram enviadas com êxito.


*** Test Cases ***
CT1 - Preencher formulário corretamente
    DADO QUE o usuário acessa o site
    QUANDO preencher o formulário corretamente
    ENTÃO o formulário é enviado com sucesso
    E uma mensagem de sucesso é exibida



*** Keywords ***
DADO QUE o usuário acessa o site
    Open Browser           ${URL}                 ${BROWSER}             # Abrir o navegador
    Sleep    1s                                                   # Aguardar 1 segundo                            

QUANDO preencher o formulário corretamente
    Input Text             ${NOME_EMPRESA}        Empresa Teste          # Preencher o campo Nome da Empresa
    Input Text             ${ENDERECO_EMPRESA}    Rua Teste, 123         # Preencher o campo Endereço da Empresa
    Input Text             ${PROPRIETARIO}        Proprietario Teste     # Preencher o campo Proprietário
    Input Text             ${CONTATO}             41999999999            # Preencher o campo Contato
    Input Text             ${DATA_DE_CADASTRO}    23/10/2024             # Preencher o campo Data de Cadastro
    Sleep    1s                                                   # Aguardar 1 segundo
    Capture Page Screenshot                                       # Capturar a tela                         

ENTÃO o formulário é enviado com sucesso
    Click Button           ${BTN_ENVIAR}                                 # Clicar no botão Enviar
    Sleep    5s                                                   # Aguardar 3 segundos
    
E uma mensagem de sucesso é exibida
    Page Should Contain    ${SUCESSO}                             # Verificar se a mensagem de sucesso é exibida
    Capture Page Screenshot                                       # Capturar a tela
    Close Browser                                                 # Fechar o navegador   

