from random import randint

def title(x):
    print('-' * 30)
    print(f'{x:^30}')
    print('-' * 30)

l = []
mult = []
par = []
impar = []

def lista(tam):
    for c in range(tam):
        r = randint(0, 1000)
        l.append(r)
    return l


def multiplos(x):
    if x % 3 == 0:
        mult.append(x)
    return mult


def pares(x):    
    if x % 2 == 0:
        par.append(x)
    return par


def impares(x):
    if x % 2 == 1 :
        impar.append(x)
    return impar



if __name__ in '__main__':

    n = 10
    print(lista(n))