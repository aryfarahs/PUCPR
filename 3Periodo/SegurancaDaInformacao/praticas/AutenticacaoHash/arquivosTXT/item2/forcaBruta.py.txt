from funcoes import *

def ataqueBF(arquivo):
    print("-" * 50)
    with open(arquivo, 'r') as file:
        for linha in file:
            dados = linha.strip().split(', ')
            email = dados[1]
            hash = dados[2]
            print(f"Tentando ataque de força bruta para o usuário: {email}")
            with open('senhas.txt', 'r') as senha_file:
                for senha in senha_file:
                    senha = senha.strip()
                    if criptografar(senha) == hash:
                        print(f"Senha encontrada para o usuário {email}: {senha}")
                        break
                else:
                    print(f"Não foi possível encontrar a senha para o usuário {email}")
            print("-" * 50)

ataqueBF('usuarios.txt')