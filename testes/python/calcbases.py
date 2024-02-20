'''Calculadora para a Troca de Bases'''

from os import system
from funcoes import *

system('cls')

title('CALULADORA DE BASES')
print()

print('[2] Binário \n'
      '[8] Octal \n'
      '[10] Decimal \n'
      '[16] Hexadecimal \n'
      '[0] SAIR \n')

print('-'*30)

while True:
    binicial = int(input('Qual a base inicial do número? '))
    
    if binicial == 0:
        break 

    if binicial not in [2,8,10,16]:
         print('\nEscolha uma opção válida!')

    else:
        if binicial != 16:
            num = int(input('Digite o número: '))
            print()

        elif binicial == 16:
            num = input('Digite o número: ',)
            print()

        print(f'\n{num} na base decimal é {exp(binicial, num)}\n')
        print('-'*30)

    