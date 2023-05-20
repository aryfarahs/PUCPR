from os import system
from titulo import title

def valores(a, b):
    ca = 1
    cb = 1

    while True:
        num_a = input(f'Digite o {ca}º numero do conjunto A ['' para continuar]: ')
        if num_a in '':
            break
        a.append(int(num_a))
        ca += 1
    
    print('-'*40)
    print('CONJUNTO B')
    while True:
        num_b = input(f'Digite o {cb}º número do conjunto B ['' para continuar]: ')
        if num_b in '':
            break
        b.append(int(num_b))
        cb += 1
    print('-'*40)
    return a, b


def valid(a, b):
    # define os conjuntos
    A = set(a)
    B = set(b)
    print(f'Conjunto A: {A}')
    print(f'Conjunto B: {B}')


def opt(x):
    title('OPÇÕES', 30)
    print('[1] ')