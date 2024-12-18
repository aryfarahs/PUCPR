import hashlib
import time


def title(x):
    print('-' * 30)
    print(f'{x:^30}')
    print('-' * 30)

def strMax(msg, limite=int):
    while True:
        dado = str(input(msg))
        if len(dado) > limite:
            print(f"Limite de caracteres: {limite}.")
        else:
            break

    return dado

def novoUsuario():
    nome = strMax("Nome: ", 40)
    email = strMax("E-mail: ", 80)
    senha = strMax("Senha: ", 4)

    hash_MD5 = criptografar(senha)

    usuario = {'nome': nome,
               'email': email,
               'senha': hash_MD5
               }

    return usuario

def cadastro(usuario):
    with open('usuarios.txt', 'a') as arquivo:
        arquivo.write(f"{usuario['nome']}, {usuario['email']}, {usuario['senha']}\n")
    print("Usuário cadastrado com sucesso!")
    input('<enter para continuar>')

def criptografar(senha):
    hash_MD5 = hashlib.md5()
    hash_MD5.update(senha.encode('utf-8'))
    return hash_MD5.hexdigest()

def login(email, senha):
    with open('usuarios.txt', 'r') as arquivo:
        for linha in arquivo:
            dados = linha.strip().split(', ')
            if dados[1] == email and dados[2] == criptografar(senha):
                return True
            else:
                return False

