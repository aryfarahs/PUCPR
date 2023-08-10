function cmdSendOnClik() {
    let text = fomr1.txtText.value;
    if (isCEP(text)) {
        alert('Validação OK')
    } 
    else {
        alert('Erro hahahaha')
    }
}

function isCEP(text) {
    const re =/^\d{2}\.?\d{3}-?\d(3)$/;
    return re.test(text)
}