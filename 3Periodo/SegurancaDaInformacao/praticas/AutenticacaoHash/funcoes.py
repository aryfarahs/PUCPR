import hashlib

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
    with open('usuarios', 'a') as arquivo:
        arquivo.write(f"Nome: {usuario['nome']}, E-mail: {usuario['email']}, Senha: {usuario['senha']}\n")
    print("Usuário cadastrado com sucesso!")

def criptografar(senha):
    hash_MD5 = hashlib.md5()
    hash_MD5.update(senha.encode('utf-8'))
    return hash_MD5.hexdigest()


def autenticacao(email, senha):
    hash_MD5 = criptografar(senha)

    with open('usuarios', 'r') as arquivo:
        usuario = arquivo.read()
        for l in usuario:
            if email in l and l['senha'] == hash_MD5:
                print("logado")
        else:
            print("nao deu certo")

