from random import choice

quad = [0] * 9 
qnt = 1
while True:
    n = list(range(1, 10))
    for c in range(9):
        quad[c] = choice(n)
        n.remove(quad[c])

    if quad[0] + quad[1] + quad[2] == quad[0] + quad[3] + quad[6] == quad[0] + quad[4] + quad[8]:
        break
    qnt += 1
print(f'\nForam necessários {qnt} tentativas\n')
for c in range(9):
    print(quad[c], end=' ')
    if c == 2 or c == 5:
        print()
print('\n')