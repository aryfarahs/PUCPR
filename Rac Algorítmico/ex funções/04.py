def valor(n):
    if n > 0:
        return 'P'
    else:
        return 'N'
    
n = int(input('Digite um valor: '))
print(valor(n))