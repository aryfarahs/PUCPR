from funcoes import *

title("Cadastrando Usuários")

l = []

while True:
    choice = int(input("O que deseja fazer?\n"
                       "[1] Cadastro\n"
                       "[2] Login\n"
                       "[0] Sair"))
    if choice < 0 or choice > 2:
        print('Digite uma opção válida!')

    elif choice == 0:
        break

    elif choice == 1:
        usuario = novoUsuario()
        cadastro(usuario)

    elif choice == 2:
        pass
