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

    if (nameInput.value === "") {
        alert("Preencha seu Nome");
        return;
    }
});


function ValidateForm() {

}