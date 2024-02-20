'''Calculadora para a Troca de Bases'''


def exp(bi, x):
    num = str(x)
    for c in range(len(num)):
        numero.append(int(num[c]))
        casas.append(c)
    print(numero)
    print(casas)



numero = []
casas = []

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
         print('Escolha uma opção válida!')

    else:
        if 0 < binicial < 4:
            num = int(input('Digite o número: '))

        elif binicial == 4:
            num = input('Digite o número: ')
        
        exp(binicial, num)

    