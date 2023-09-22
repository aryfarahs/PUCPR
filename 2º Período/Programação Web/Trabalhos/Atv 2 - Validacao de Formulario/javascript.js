/* Declarando Variáveis */

const form = document.getElementById("form")
const nameInput = document.getElementById("name")
const cpfInput = document.getElementById("cpf")
const birthInput = document.getElementById("birth")
const streetInput = document.getElementById("street")
const cepInput = document.getElementById("cpf")
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
    if (cpfInput.value.length !== 11 || cpfInput.value === !isCpfValid(cpfInput.value)) {
        alert('CPF Inválido');
        return;
    } else {
       //formatarCpf(cpfInput);
    }

    // rua
    if (streetInput.value === "" || !isNameValid(streetInput.value)) {
        alert("Preencha o campo 'Rua' corretamente (apenas letras)")
        return;
    } 

    // cep
    if (cepInput.value !== 8 || cepInput.value === !isCepValid(cepInput.value)) {
        alert('CEP Inválido!')
        return;
    } else {
        formatarCep(cepInput)
    }

    // cidade
    if (cityInput.value === "" || !isNameValid(cityInput.value)) {
        alert("Preencha o campo 'Cidade' corretamente (apenas letras)")
        return;
    }

    // estado
    if (stateInput.value.length !== 2 || stateInput.value === !isStateValid(stateInput.value)) {
        alert("Preencha o campo 'Estado' apenas com a silga")
        return;
    } else {
        stateInput.value.toUpperCase();
    }

    // telefone


    //email


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

// VALIDANDO TELEFONE

