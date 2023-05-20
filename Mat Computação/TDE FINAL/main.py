'''
O programa deverá ser desenvolvido com a estrutura de menus aninhados (um menu
dentro do outro baseado nas opções) sendo que sempre deverá ser possível a opção de
voltar (zerando as variáveis ao recomeçar). Ainda, a persistência de dados deverá ser
utilizada, ou seja, quando ocorrer um erro de digitação ou consistência dentro do contexto,
os dados de entrada deverão ser perguntados novamente ao usuário. Dessa forma, o
programa nunca deverá ser encerrado por erro ou ao final de algum cálculo, mas sim pela
opção do usuário sair.
Deve-se utilizar funções para cada item a ser calculado, portanto, em cada chamada de
opção nos meus chame uma função
'''

from os import system
import conjuntos

print('[1] Conjuntos\n'
      '[2] Funções\n'
      '[3] Matrizes\n'
      '[4] Sair')

choice = int(input('O que deseja analisar? '))

if choice == 1:
    system('cls')
    # coletando e validando conjuntos
    a = []
    b = []
    conjuntos.valores(a, b)
    conjuntos.valid(a, b)