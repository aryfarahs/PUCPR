import matplotlib.pyplot as plt

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
        pass
    
    print('—'*40)
    cont = str(input('Deseja continuar? ')).strip().upper()[0]
    if cont in 'N':
        break