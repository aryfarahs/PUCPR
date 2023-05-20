from titulo import title
from math import sqrt

def type():
    title('FUNÇÕES')
    print('[1] Afim\n'
          '[2] 2º Grau\n'
          '[3] Exponencial\n'
          '[4]   <---')

class Primeiro:
    def direcao(a, b):
        print(f'f(x) = {a}x + {b}')
        if a > 0:
            print('A função é crescente.')
        elif a < 0:
            print('A função é decrescente.')
        else:
            print('A função é constante.')

    def coef(a, b):
        pass



def c_delta(a, b, c):
    return b**2 - 4 * a * c

def raiz(a, b, delta, sinal=1):
    return (-b + sinal * sqrt(delta)) / 2 * a

def baskhara(a, b, c):
    delta = c_delta(a, b, c)
    if delta < 0:
        return 'Nenhuma raíz real encontrada'
    elif delta == 0:
        x = raiz(a, b, delta)
        return f'Raíz: {x}'
    else:
        x1 = raiz(a, b, delta)
        x2 = raiz(a, b, delta, -1)
        return f'Raízes: {x1} e {x2}'