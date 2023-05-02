estoque = {'pao': 10, 'hamburguer': 12, 'tomate': 5, 'bacon': 5, 'ovo': 5}
cardapio = {
 'xburguer': ['pao', 'hamburguer'],
 'xsalada': ['pao', 'hamburguer', 'tomate'],
 'xbacon': ['pao', 'hamburguer', 'tomate', 'bacon'],
 'xegg': ['pao', 'hamburguer', 'ovo'],
 'xtudo': ['pao', 'hamburguer', 'tomate', 'hamburguer', 'bacon', 'ovo']
}
while True:
    cont = 1
    print('—'*40)
    print(f'{"CARDÁPIO BOCA FELIZ":^40}')
    print('—'*40)
    for sanduiche, ingredientes in cardapio.items():
        print(f'[{cont}] {sanduiche[0].title()}-{sanduiche[1:].title():<10}  -    ', end='')
        for c in range(len(ingredientes)):
            print(f'{ingredientes[c].title()}, ', end='')
        print()
        cont += 1
    print('—'*40)
    ans = input('O que deseja pedir? [0 p/ parar] ').lower().replace('-', '')
    if ans in '0':
        break
    elif ans not in cardapio:
        print('\033[1;31mERRO! Item não econtrado.\033[m')
    else:
        if ans in 'xburguer' or ans in '1':
            estoque['pao'] -= 1
            estoque['hamburguer'] -= 1
        elif ans in 'xsalada' or ans in '2':
            estoque['pao'] -= 1
            estoque['hamburguer'] -= 1
            estoque['tomate'] -= 1
        elif ans in 'xbacon' or ans in '3':
            estoque['pao'] -= 1
            estoque['hamburguer'] -= 1
            estoque['tomate'] -= 1
            estoque['bacon'] -= 1
        elif ans in 'xegg' or ans in '4':
            estoque['pao'] -= 1
            estoque['hamburguer'] -= 1
            estoque['ovo'] -= 1
        elif ans in 'xtudo' or ans in '5':
            estoque['pao'] -= 1
            estoque['hamburguer'] -= 1
            estoque['tomate'] -= 1
            estoque['bacon'] -= 1
            estoque['ovo'] -= 1                     
    for ingrediente, quant in estoque:
        print(f'{ingrediente:<10}{quant:>6}')