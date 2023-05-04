def piramide(num):
    for c in range(num):
        print(f'{c+1} ' * (c+1))
        c += 1


piramide(4)