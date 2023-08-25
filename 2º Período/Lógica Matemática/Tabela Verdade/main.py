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
for i in range(0, len(valores), quant):
    valores2.append(valores[i])
for i in range(0, len(valores), quant//2):
    valores3.append(valores[i])

print()
print('\033[1;34m| ', end='')
for c in range(quant):
    print(f'{variaveis[c]}', end=' | ')

print('\033[m')
print('-'*5*quant)

cont2 = 0
cont3 = 0
for c in range(len(valores)):
    print('| ', end='')
    print(valores[c], valores2[c-2], valores3[cont3] if quant > 2 else '')
    if c % 2 == 0:
        cont3 += 1


