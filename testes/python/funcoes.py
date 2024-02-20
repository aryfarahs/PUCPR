def title(x):
    print('-' * 30)
    print(f'{x:^30}')
    print('-' * 30)

numero = []
casas = []


def exp(bi, x):
    numero.clear()
    casas.clear()
    
    num = str(x)
    for c in range(len(num)):
        numero.append(int(num[c]))
        casas.append(c)
    casas.reverse()


    print(numero)
    print(casas)


    resp = 0
    for n in numero:
        resp += numero[n] * (bi ** casas[-1])

    return resp

if __name__ in '__main__':

    title('teste')

    n = 100110
    b = 2