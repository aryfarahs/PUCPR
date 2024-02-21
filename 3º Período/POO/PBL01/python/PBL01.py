from funcoes import *
from os import system 

system('cls')

title('Lista Aleatória')

tam = int(input('\nDigite quantos números deseja ver: '))

l = lista(tam)
print(f'\nOs números gerados foram: {l}')

for n in l:
    m = multiplos(n)
    p = pares(n)
    i = impares(n)

print(f'\nMúltiplos de 3: {m}\n'
      f'Pares: {p}\n'
      f'Ímpares: {i}\n')

print('-'*30)