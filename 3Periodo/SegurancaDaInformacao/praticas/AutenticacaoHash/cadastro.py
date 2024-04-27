from funcoes import *

title("Cadastrando Usuários")

l = []

while True:
    print("[1] Cadastro\n"
          "[2] Login\n"
          "[0] Sair")

    choice = int(input("O que deseja fazer? "))
    if choice < 0 or choice > 2:
        print('Digite uma opção válida!')

    elif choice == 0:
        break

    elif choice == 1:
        usuario = novoUsuario()
        cadastro(usuario)

    elif choice == 2:
        email = strMax("E-mail: ", 80)
        senha = strMax("Senha: ", 4)

        autenticacao(email, senha)
