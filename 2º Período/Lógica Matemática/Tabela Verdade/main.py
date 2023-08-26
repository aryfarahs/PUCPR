from values import *

variaveis = ['p', 'q', 'r', 's', 't', 'u', 'v']

quant = int(input('Quantas variáveis você deseja analisar? '))
range_table = int((2**quant)/2)

valores = []
valores2 = []
valores3 = []
true = ['V']*range_table
false = ['F']*range_table

for c in range(range_table):
    valores.append(true[c])
for c in range(range_table):
    valores.append(false[c])

for i in range(0, len(valores)//2):
    valores2.append(true[i])
    valores2.append(false[i])

if quant > 2:
    for i in range(0, len(valores)//4):
        valores3.append(true[i])
        valores3.append(true[i])
        valores3.append(false[i])
        valores3.append(false[i])

print()
print('\033[1;34m| ', end='')
for c in range(quant):
    print(f'{variaveis[c]}', end=' | ')

print('\033[m')
print('-'*4*quant)

cont2 = 0
cont3 = 0
if quant == 2:
    for c in range(len(valores)):
        print('| ', end='')
        print(valores[c], '|', valores2[cont2], '|')
        cont2 += 1
elif quant == 3:
    for c in range(len(valores)):
        print('| ', end='') 
        print(valores[c], '|', valores3[cont3], '| ' + valores2[cont2] )
        cont2 += 1
        cont3 += 1


