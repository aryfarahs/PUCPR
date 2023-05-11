import matplotlib.pyplot as plt
from math import sqrt

def formato(x):
    if x % 1 == 0:
        return f'{x:.0f}'
    else:
        return f'{x:.2f}'
    
def grafico(x, y):
    plt.plot(x, y)
    plt.xlabel('Eixo X')
    plt.ylabel('Eixo Y')
    plt.title('Função do 1º Grau')
    plt.show()

def primeiro(a, b):
    val = ''
    print(f'f(x) = {formato(a)}x + {formato(b)}')
    if a > 0:
        val = 'crescente'
    if a < 0:
        val = 'decrescente'
    if a == 0:
        val = 'constante'
    print(f'\033[1;36mA função é {val}!\033[m')
    print(f'Zero da função: {b*-1}/{a} = {(b*-1)/a:.2f}')

def c_delta(a, b, c):
    return b**2 - 4 * a * c

def raiz(a, b, delta, sinal=1):
    return (-b + sinal * sqrt(delta)) / 2 * a

def baskhara(a, b, c):
    delta = c_delta(a, b, c)
    if delta < 0:
        print('Nenhuma raíz real encontrada.')
    elif delta == 0:
        x = raiz(a, b, delta)
        print(f'Raiz encontrada: {x}')
    else:
        x1 = raiz(a, b, delta)
        x2 = raiz(a, b, delta, -1)
        print(f'As raizes da equação são; {x1} e {x2}')



print('[1] Função do 1º grau\n[2] Função do 2º grau')
print('—'*40)
while True:
    ans = int(input('O que deseja calcular? '))
    if ans == 1:
        a = float(input('Digite o valor de a: '))
        b = float(input('Digite o valor de b: '))
        print('—'*40)
        primeiro(a, b)
        graf = str(input('Deseja gerar um gráfico? ')).strip().upper()[0]
        if graf in 'S':
            x = list(range(-10, 11))
            y = [a*valor + b for valor in x]
            grafico(x, y)

    elif ans == 2:
        a = float(input('Digite o valor de a: '))
        b = float(input('Digite o valor de b: '))
        c = float(input('Digite o valor de c: '))
        baskhara(a, b, c)

    print('—'*40)
    cont = str(input('Deseja continuar? ')).strip().upper()[0]
    if cont in 'N':
        break