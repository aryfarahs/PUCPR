estoque = {'pao': 10, 'hamburguer': 12, 'tomate': 5, 'bacon': 5, 'ovo': 5}
cardapio = {
 'x-burguer': ['pao', 'hamburguer'],
 'x-salada': ['pao', 'hamburguer', 'tomate'],
 'x-bacon': ['pao', 'hamburguer', 'tomate', 'bacon'],
 'x-egg': ['pao', 'hamburguer', 'ovo'],
 'x-tudo': ['pao', 'hamburguer', 'tomate', 'hamburguer', 'bacon', 'ovo']
}
while True:
    cont = 1
    print('—'*40)
    print(f'{"CARDÁPIO BOCA FELIZ":^40}')
    print('—'*40)
    for sanduiche, ingredientes in cardapio.items():
        print(f'[{cont}] {sanduiche.title():<10}  -   ', end='')
        for c in range(len(ingredientes)):
            print(f'{ingredientes[c].title()}, ', end='')
        print()
        cont += 1
    print('—'*40)
    ans = input('O que deseja pedir? [0 p/ parar] ').lower()
    if ans in '0':
        break
    elif ans not in sanduiche:
        print('\033[1;31mERRO! Item não econtrado.\033[m')
    else:


    