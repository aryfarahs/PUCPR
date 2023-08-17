let map=[
    [0,0,0,0,0,0,0,0],
    [0,1,2,3,4,5,6,7],
    [1,2,3,4,5,6,7,8],
]

function tabela() {
    for(i=0; i<5; i++) {
        document.write("<tr>")
            for(j=0; j<8; j++) {
                document.write(`<td width=50 onclick='shipOnClick(${i}, ${j})'><img id='ship${i}${j}' src='images/tile.jpeg'></td>`)
            }
        document.write("</tr>")
    }
}

/*
function random() {
    j1 = Math.floor(Math.random() * 5)
    j1 = Math.floor(Math.random() * 8)
    j1 = Math.floor(Math.random() * 5)
    j1 = Math.floor(Math.random() * 8)
}
*/

function shipOnClick(i, j) {
    alert(`${i}${j}`)
}