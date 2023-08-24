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

function rinicia() {
    window.location.reload()
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

function resetGame() {
    life = 10;
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



function shipOnClick(indX, indY) {

    if (endGame) return;
    
    const ship = document.getElementById(`ship${indX}${indY}`);
    const type = ships[indX][indY];
    ship.src = getImage(type);
    update_scoreboard(type);
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