'''Calculadora para a Troca de Bases'''

from os import system
from funcoes import *

system('cls')


print('')
print('[1] Binário \n'
      '[2] Octal \n'
      '[3] Decimal \n'
      '[4] Hexadecimal \n'
      '[0] SAIR \n')

while True:
    binicial = int(input('Qual a base inicial do número? '))
    
    if binicial == 0:
        break 

    if binicial < 1 or binicial > 4:
         print('\nEscolha uma opção válida!')

    else:
        if 0 < binicial < 4:
            num = int(input('Digite o número: '))
            print()

        elif binicial == 4:
            num = input('Digite o número: ',)
            print()

        print(f'\n{num} na base decimal é {exp(binicial, num)}\n')
        print('-'*30)

    