from functions import *
import os

login = []
usuarios = []

while True:
    os.system('cls')

    title('Sistema de Cadastro')
    print('[1] Cadastrar-se \n'
          '[2] Realizar Login \n'
          '[3] Sair \n')

    choice = int(input('O que deseja fazer? '))
    print('-'*30)

    if choice == 1:
        new = []
        print('\033[1mÓtimo! Vamos dar início ao seu cadastro.\033[m')
        nome = str(input('Primeiramente, digite o nome de usuário: '))
        senha = str(input('Agora, escolha uma senha: '))

        new.append(nome)
        new.append(senha)
        login.append(new)

        print('-'*30)
        print('Cadastro realizado com sucesso!')
        input('<enter para continuar>')

    elif choice == 2:
        while True:
            os.system('cls')

            nome = str(input('Usuário: '))
            for l in login:
                if nome not in l[0]:
                    print('Oops! Não identificamos nenhuma conta. Tente novamente.')
                    input('<enter para continuar>')

                else:
                    senha = str(input('Senha: '))
                    if senha not in l[1]:
                        print('Senha incorreta! Tente novamente')
                        input('<enter para continuar>')
                    
                    else:
                        print('Você foi logado com sucesso! Obrigado pela preferência, até logo!')
                        input('<enter para continuar>')
                        break
        
           

    elif choice == 3:
        break

    else:
        print('Escolha uma opção válida!')

title('Obrigado pela preferência!')
