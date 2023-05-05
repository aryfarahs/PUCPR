def inverte(num):
    rev = ''
    for i in (int(num),-1):
        rev += i
    return rev

num = str(input('Digite um número: '))
print(inverte(num))