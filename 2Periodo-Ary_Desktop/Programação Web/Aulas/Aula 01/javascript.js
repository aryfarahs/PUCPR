function message() {
    alert('Oi, pessoal!!!');
}

function cmdSendOnClick() {
    if (forml.txtName.value == '') {
        alert('O campo "Nome" não foi preenchido')
        forml.txtName.focus();
    }
    else if (fomrl.optSexo.value == '') {
        alert('O campo "Sexo" não foi preenchido')
    }
}

function cmdSendOnClickWithId() {
    let myForm = document.getElementById('fomrl')
    let txtName = document.getElementById('txtName')
    let optM = document.getElementById('optM')
    let optF = document.getElementById('optF')
    let optO = document.getElementById('optO')


    if (txtName.value == '') {
        alert('O campo "Nome" não foi preenchido')
        forml.txtName.focus();
        return false;
    }
    else if (!optM.checked && !optF.checked && !optO.checked) {
        alert('O campo "Sexo" não foi preenchido')
        return false;
    }
    else {
        return myForm.onsubmit();
    }
}