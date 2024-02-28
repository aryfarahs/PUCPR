function tabela() {
    for(i=0; i<8; i++) {
        document.write("<tr>")
        for(j=0; j<12; j++) {
                document.write(`<td width=50 onclick='shipOnClick(${i}, ${j})'><img id='ship${i}${j}' src='images/tile.jpeg'></td>`)
        }
        document.write("</tr>")
    }
}

function fodaseOnClick() {
    let tabeladas = document.getElementById('tabeladas')
    let botadas = document.getElementById('botadas')
    tabeladas.style.visibility = "visible"
    botadas.style.visibility = 'hidden'
    if (life == 0) {
        window.location.reload()
    }
}



const ships = [
    [0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0],
    [0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 1, 2],
    [0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0],
    [0, 1, 0, 0, 3, 0, 0, 0, 0, 3, 0, 2],
    [1, 0, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0],
    [0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 0],
    [0, 1, 0, 0, 3, 0, 0, 0, 0, 3, 0, 2],
    [0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2]];
let life;
let points;
let endGame;
const selectAmmo = document.getElementById("selectAmmo")
let ammoCount = [0, 2, 1]

function resetGame() {
    life = 5;
    points = 0;
    endGame = false;
    random();
}

function random() {
    for(i=0; i<1000; i++) {
        i1 = Math.floor(Math.random() * 5)
        j1 = Math.floor(Math.random() * 8)
        i2 = Math.floor(Math.random() * 5)
        j2 = Math.floor(Math.random() * 8)
        let temp = ships[i1][j1];
        ships[i1][j1] = ships[i2][j2];
        ships[i2][j2] = temp;
    }
}

function verificarVidas(selecionar) {
    const vidas = document.getElementsByName("vida");
    if (selecionar) {
        for (var i = 0; i < vidas.length; i++) {
            if (vidas[i].checked) {
                life = vidas[i].value;
            }
            vidas[i].disabled = true;
        }
    } else {
        for (var i = 0; i < vidas.length; i++) {
            vidas[i].disabled = false;
        }
    }
}

function shipOnClick(indX, indY) {

    if (endGame) return;
    const ship = document.getElementById(`ship${indX}${indY}`);
    const type = ships[indX][indY];
    ship.src = getImage(type);
    update_scoreboard(type);
}

function ammoImpact(corX, corY, ammoType) {
    let totalType = 0;
    totalType += attackCell(corX, corY)
    if (ammoType == 1 || ammoType == 2) {
        totalType += attackCell(corX - 1, corY)
        totalType += attackCell(corX + 1, corY)
        totalType += attackCell(corX, corY - 1)
        totalType += attackCell(corX, corY + 1)
        if (ammoType == 2) {
            totalType += attackCell(corX - 1, corY - 1)
            totalType += attackCell(corX + 1, corY - 1)
            totalType += attackCell(corX - 1, corY + 1)
            totalType += attackCell(corX + 1, corY + 1)
        }
    }

    update_scoreboard(totalType);
}

function getImage(type) {
    switch (type) {
        case 0:
            return "images/ocean.jpeg";
            break;
        case 1:
            return "images/submarine.jpeg";
            break;
        case 2:
            return "images/boat.jpeg";
            break;
        case 3:
            return "images/port.jpg";
            break;
    }
    return "images/tile.jpeg";
}


function update_scoreboard(type) {
    points += type;
    if (type == 0) {
        life--;
        update_scoreboard_view();
        if (life == 0) {
            alert('You Lose!');
            endGame = true;
            botadas.textContent = 'Reiniciar Jogo'; 
            botadas.style.visibility = 'visible'
            tabeladas.style.visibility = 'hidden'
        }
    }
    else {
        update_scoreboard_view();
    }
}

function update_scoreboard_view() {
    const scoreboard = document.getElementById("divScoreboard");
    scoreboard.innerHTML = "Pontos: " + points + " - Vidas: " + life;
}