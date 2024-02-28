/* Declarando Variáveis */

const form = document.getElementById("form")
const nameInput = document.getElementById("name")
const cpfInput = document.getElementById("cpf")
const birthInput = document.getElementById("birth")
const streetInput = document.getElementById("street")
const cepInput = document.getElementById("cep")
const cityInput = document.getElementById("city")
const stateInput = document.getElementById("state")
const phoneInput = document.getElementById("phone")
const emailInput = document.getElementById("email")


/* Validando o Formulário */
form.addEventListener("submit", (event) => {
    event.preventDefault();

    // nome
    if (nameInput.value === "" || !isNameValid(nameInput.value)) {
        alert("Preencha seu nome (apenas letras)");
        return;
    }

    // cpf
    formatarCpf(cpfInput);
    if (cpfInput.value === "" || !isCpfValid(cpfInput.value)) {
        alert('CPF Inválido');
        return;
    }

    // data de nascimento
    if (birthInput === "") {
        alert("Campo 'Data de Nascimento' obrigatório")
        return;
    }

    // rua
    if (streetInput.value === "" || !isNameValid(streetInput.value)) {
        alert("Preencha o campo 'Rua' corretamente (apenas letras)")
        return;
    } 

    // cep
    formatarCep(cepInput)
    if (cepInput.value.length === ""|| !isCepValid(cepInput.value)) {
        alert('CEP Inválido!')
        return;
    }

    // cidade
    if (cityInput.value === "" || !isNameValid(cityInput.value)) {
        alert("Preencha o campo 'Cidade' corretamente (apenas letras)")
        return;
    }

    // estado
    formatState(stateInput)
    if (stateInput.value === "" || !isStateValid(stateInput.value)) {
        alert("Preencha o campo 'Estado' apenas com a silga")
        return;
    }

    // telefone
    formatPhone(phoneInput)
    if (phoneInput.value === "" || !isPhoneValid(phoneInput.value)) {
        alert("Preencha o campo 'Telefone' corretamente (apenas números)")
        return;
    }

    //email
    if (emailInput.value === "" || !isEmailValid(emailInput.value)) {
        alert("Preencha o campo 'E-mail' corretamente")
        return;
    }

    // caso tudo esteja certo:
    form.submit();
});

// VALIDANDO CPF
function formatarCpf(cpfInput) {
    const tiraLetra = cpfInput.value.replace(/\D/g, '');
    const cpfPronto = tiraLetra.substring(0, 3) + '.' + tiraLetra.substring(3, 6) + '.' + tiraLetra.substring(6, 9) + '-' + tiraLetra.substring(9, 11);
    cpfInput.value = cpfPronto
    return cpfInput.value;
}

function isCpfValid(cpfInput) {
    const cpfRegex = new RegExp(
        /^[\d]{3}\.\d{3}\.\d{3}-\d{2}$/
    )
    if (cpfRegex.test(cpfInput)) {
        return true;
    } return false;
}

// VALIDANDO CEP
function isCepValid(cepInput) {
    const cepRegex = new RegExp(
        /^\d{5}-\d{3}$/
    )
    if (cepRegex.test(cepInput)) {
        return true;
    } return false;
}

function formatarCep(cepInput) {
    const tiracep = cepInput.value.replace(/\D/g, '');
    const cepPronto = tiracep.substring(0, 5) + '-' + tiracep.substring(5, 8);
    cepInput.value = cepPronto
    return cepInput.value;
}

//VALIDANDO RUA, NOME, CIDADE
function isNameValid(nameInput) {
    const NameRegex = new RegExp(
        /^[a-zA-Z\s]+$/
    )
    if (NameRegex.test(nameInput)) {
        return true;
    } return false;
}

// VALIDANDO ESTADO
function isStateValid(stateInput) {
    const stateRegex = new RegExp(
        /^[a-zA-Z]{2}$/
    )
    if (stateRegex.test(stateInput)) {
        return true;
    } return false;
}

function formatState(stateInput) {
    const stateSig = stateInput.value.toUpperCase();
    stateInput.value = stateSig
    return stateInput.value;
}

// VALIDANDO TELEFONE
function isPhoneValid(phoneInput) {
    const phoneRegex = new RegExp(
        /^\(\d{2}\) \d{5}-\d{4}$/
    )
    if (phoneRegex.test(phoneInput)) {
        return true;
    } return false;
}


function formatPhone(phoneInput) {
    const tiraNum = phoneInput.value.replace(/\D/g, '')
    const numPronto = '(' + tiraNum.substring(0,2) + ')' + ' ' + tiraNum.substring(2, 7) + '-' + tiraNum.substring(7, 11);
    phoneInput.value = numPronto
    return phoneInput.value;
}

// VALIDANDO EMAIL
function isEmailValid(emailInput) {
    const emailRegex = new RegExp(
        /^[\w\.-]+@[\w\.-]+\.[a-zA-Z]{2,}$/
    );
    if (emailRegex.test(emailInput)) {
        return true;
    } return false;
}