def title(x):
    print('-' * 30)
    print(f'{x:^30}')
    print('-' * 30)

numero = []
casas = []
soma = []

def exp(bi, x):
    numero.clear()
    casas.clear()
    soma.clear()
    
    num = str(x)
    
    if num in 'A':
        num == '10'
    if num in 'B':
        num == '11'
    if num in 'C':
        num == '12'
    if num in 'D':
        num == '13'
    if num in 'E':
        num == '14'
    if num in 'F':
        num == '15'

    for c in range(len(num)):
        numero.append(int(num[c]))
        casas.append(c)
    casas.reverse()


    print(numero)
    print(casas)

    for c in casas:
        if numero[c] != 0:
            s = bi ** casas[c] * numero[c]
            soma.append(s)
            final = sum(soma)

    return final


if __name__ in '__main__':

    title('teste')

    n = 100110
    b = 2
    exp(b, n)