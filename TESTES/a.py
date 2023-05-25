d = {}

d['nome'] = str(input('Nome: '))
d['idade'] = int(input('Idade: '))

for k, v in d.items():
    print(f'{k} - {v}')