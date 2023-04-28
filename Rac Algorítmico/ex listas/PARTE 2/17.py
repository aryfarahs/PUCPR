ordem = ['Primeiro', 'Segundo', 'Terceiro', 'Quarto', 'Quinto']
nome = str(input('Atleta: '))
for c in range(5):
    salto = float(input(f'{ordem[c]} salto: '))
print('Resultado final: ')
print(f'Atleta: {nome}')
print(f'Saltos: {}')