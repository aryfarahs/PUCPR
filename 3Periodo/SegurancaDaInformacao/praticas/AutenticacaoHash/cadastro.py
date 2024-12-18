from funcoes import *

while True:
    title("Cadastrando Usuários")
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
        erros = 0
        while True:
            email = strMax("E-mail: ", 80)
            senha = strMax("Senha: ", 4)
            if login(email, senha):
                print("Login bem-sucedido!")
                break
            else:
                print("E-mail ou Senha incorretos")
                erros += 1
                if erros >= 3:
                    print("Muitas tentativas incorretas! Aguarde 10 segundos")
                    time.sleep(10)
                    erros = 0
        input('<enter para continuar>')
