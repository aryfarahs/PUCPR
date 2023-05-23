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
from titulo import title
import conjuntos
import funcoes
from mat import leiaFloat, leiaInt
from numpy import arange


while True:
      system('cls')
      title('MENU')
      print('[1] Conjuntos\n'
            '[2] Funções\n'
            '[3] Matrizes\n'
            '[4] Sair')
      print('-' * 30)
      choice = leiaInt('O que deseja analisar? ')

      # operações com conjuntos
      if choice == 1:
            system('cls')

            # coletando e validando conjuntos
            a = []
            b = []
            conjuntos.valores(a, b)
            A = set(a)
            B = set(b)

            # opções
            while True:
                  system('cls')
                  print(f'Conjunto A: {A}' if len(a) != 0 else 'Conjunto A: Ø')
                  print(f'Conjunto B: {B}' if len(b) != 0 else 'Conjunto B: Ø')
                  conjuntos.opt()
                  ans = leiaInt('O que deseja ver? ')
                  print('-' * 30)

                  # resultados
                  if ans == 1:
                        conjuntos.sub_prop(A, B)
                        input('<enter>')
                  elif ans == 2:
                        conjuntos.uniao(A, B)
                        input('<enter>')
                  elif ans == 3:
                        conjuntos.inter(A, B)
                        input('<enter>')
                  elif ans == 4:
                        conjuntos.dif(A, B)
                        input('<enter>')
                  elif ans == 5:
                        break
                  elif ans > 5 or ans < 1:
                        print('Digite uma opção válida.')
                        input('<enter>')

      # funções
      elif choice == 2:
            system('cls')
            while True:
                  system('cls')
                  # tipo da função
                  funcoes.type()
                  print('-' * 30)
                  ans = leiaInt('Escolha 1 tipo de função: ')
                  print('-' * 30)

                  # coletando coeficientes
                  if ans == 1:
                        system('cls')
                        a = leiaFloat('a = ')
                        b = leiaFloat('b = ')
                        print('-' * 30)
                        while True:
                              system('cls')
                              title('FUNÇÃO AFIM')
                              print(f'f(x) = {a}x + {b}')
                              funcoes.direcao_afim(a)
                              print('-' * 30)
                              funcoes.opt_afim()
                              print('-' * 30)
                              opc = leiaInt('O que mais deseja fazer? ')
                              print('-' * 30)
                              if opc == 1:
                                    funcoes.raiz(a, b)
                                    input('<enter>')
                              elif opc == 2:
                                    x = leiaInt('Digite o valor de x: ')
                                    funcoes.choose_afim(a, b, x)
                                    input('<enter>')
                              elif opc == 3:
                                    x = arange(-10, 10, 0.1)
                                    y = [a*valor + b for valor in x]
                                    funcoes.grafico_afim(x, y)
                                    input('<enter>')
                              elif opc == 4:
                                    break
                              elif opc > 4 or opc < 1:
                                    print('Digite uma opção válida.')
                                    input('<enter>')

                  elif ans == 2:
                        system('cls')
                        num_a = input('Digite o valor de a: ')
                        num_b = input('Digite o valor de b: ')
                        num_c = input('Digite o valor de c: ')
                        a = float(num_a)
                        b = float(num_b)
                        c = float(num_c)
                        while True:
                              system('cls')
                              title('FUNÇÃO 2º GRAU')
                              print(f'f(x) = {a}x² + {b}x + {c}')
                              print('-' * 30)
                              funcoes.opt_seg()
                              print('-' * 30)
                              opc = leiaInt('O que deseja fazer? ')
                              print('-' * 30)
                              if opc == 1:
                                    print(funcoes.baskhara(a, b, c))
                                    input('<enter>')
                              elif opc == 2:
                                    x = leiaInt('Digite o valor de x: ')
                                    funcoes.choose_seg(a, b, c, x)
                                    input('<enter>')
                              elif opc == 3:
                                    funcoes.vertice(a, b, c)
                                    input('<enter>')
                              elif opc == 4:
                                    x = arange(-10, 10, 0.1)
                                    y = [a*(valor**2) + b*valor + c for valor in x]
                                    funcoes.grafico_seg(x,y)
                                    input('<enter>')
                              elif opc == 5:
                                    break
                              elif opc > 5 or opc < 1:
                                    print('Digite uma opção válida')
                                    input('<enter>')

                  elif ans == 3:
                        system('cls')
                        num_a = input('a = ')
                        a = float(num_a)
                        while True:
                              system('cls')
                              title('FUNÇÃO EXPONENCIAL')
                              print(f'f(x) = {a}**x')
                              funcoes.direcao_exp(a)
                              print('-' * 30)
                              funcoes.opt_exp()
                              print('-' * 30)
                              opc = leiaInt('O que mais deseja fazer? ')
                              print('-' * 30)
                              if opc == 1:
                                    x = leiaInt('Digite o valor de x: ')
                                    funcoes.choose_exp(a, x)
                                    input('<enter>')
                              elif opc == 2:
                                    x = arange(-10, 10, 0.1)
                                    y = [a**valor for valor in x]
                                    funcoes.grafico_exp(x, y)
                                    input('<enter>')
                              elif opc == 3:
                                    break

                              elif opc > 3 or opc < 1:
                                    print('Digite uma opção válida')
                                    input('<enter>')

                  elif ans == 4:
                        break

                  elif ans > 4 or ans < 1:
                        print('Digite uma opção válida')
                        input('<enter>')


      # matrizes
      elif choice == 3:
            print('Trabalhando nessa opção...')
            input('<enter>')

      # sair do programa
      elif choice == 4:
            break

      # erro
      elif choice < 1 or choice > 4:
            print('Digite uma escolha válida')
            input('<enter>')

# fim         
print('-' * 30)
print('Obrigado pela preferência!')
print('-' * 30)