'''
Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo
um valor entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3
ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6,
8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente.
Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.
'''

from random import randint

def craps(num, num2):
    l = []
    l.append(num)
    l.append(num2)
    soma = sum(l)
    while True:
        if soma == 7 or soma == 11:
            print(f'\033[1;33m{soma} = NATURAL - Você GANHOU!\033[m')
            break
        elif soma == 2 or soma == 3 or soma == 12:
            print(f'\033[1;31m{soma} = CRAPS - Você PERDEU!\033[m')
            break
        else:
            print(f'\033[1;36m{soma} = PONTO - Continue jogando.\033[m')
            while True:
                craps(num, num2)
                if soma == 7:
                    print('VOCE PERDEU')
                    break
                else:
                    print('voce ganoh')
                    break
                
num1 = randint(1, 6)
num2 = randint(1, 6)
craps(num1, num2)