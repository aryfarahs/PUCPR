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
    //const re = /^\d{2}\.?\d{3}-?\d{3}$/;
    // const re = /^(0[1-9]|1[0-2])$/;
    // const re = /^\w{2,5}$/;
    // const re = /^[0-9A-F]{2}$/;
    const re = /^([\b]| )\b.+$/;
    return re.test(text);
}