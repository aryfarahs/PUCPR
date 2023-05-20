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


while True:
      system('cls')
      title('MENU')
      print('[1] Conjuntos\n'
            '[2] Funções\n'
            '[3] Matrizes\n'
            '[4] Sair')
      choice = int(input('O que deseja analisar? '))

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
                  ans = int(input('O que deseja ver? '))
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

      # funções
      elif choice == 2:
            system('cls')
            while True:
                  # tipo da função
                  funcoes.type()
                  ans = int(input('Escolha 1 tipo de função: '))
                  print('-' * 30)

                  # coletando coeficientes
                  if ans == 1:
                        num_a = input('a = ')
                        num_b = input('b = ')
                        a = float(num_a)
                        b = float(num_b)
                        

                  elif ans == 2:
                        pass
                  elif ans == 3:
                        pass
                  elif ans == 4:
                        break


      # matrizes
      elif choice == 3:
            pass

      # sair do programa
      elif choice == 4:
            break

      # erro
      elif choice < 1 or choice > 4:
            print('Digite uma escolha válida')

# fim         
print('-' * 30)
print('Obrigado pela preferência!')
