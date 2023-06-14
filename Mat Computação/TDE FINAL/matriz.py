from titulo import title
from mat import leiaInt, leiaFloat

def opt():
    print('[1] Calcular DETERMINANTE (2x2/3x3)\n'
          '[2] Multiplicar\n'
          '[3] Matriz transposta\n'
          '[4]   <---')


def valid(lin, col):
    if lin == col:
        return True
    else:
        return False


def mult(mat, mat2, lin, col):
    pass    


def transp(mat, col, lin):
    title('MATRIZ TRANSPOSTA')
    for c in range(col):
        for l in range(lin):
            print(f'[{mat[l][c]:^5}]' , end=' ')
        print()
    

def det(mat):
    princ = (mat[0][0]*mat[1][1]*mat[2][2])+(mat[0][1]*mat[1][2]*mat[2][0])+(mat[0][2]*mat[1][0]*mat[2][1])
    sec = (mat[2][0]*mat[1][1]*mat[0][2])+(mat[1][0]*mat[0][1]*mat[2][2])+(mat[2][1]*mat[1][2]*mat[0][0])
    determ = princ - sec
    return determ


def prep(lin, col, mat):
    for l in range(lin):
        mat.append([0]*col)
    return mat


def build(lin, col, mat):
    for l in range(lin):
        for c in range(col):
            mat[l][c] = leiaInt(f'Digite um valor para a posição [{l+1},{c+1}]: ')


def show(mat: list, lin, col, num=1):
    title(f'MATRIZ {num}')
    for l in range(lin):
        for c in range(col):
            print(f'[{mat[l][c]:^5}]' , end=' ')
        print()


if __name__ in '__main__':
    lin = leiaInt('Linhas: ')
    col = leiaInt('Colunas: ')
    mat = []
    prep(lin, col, mat)
    build(lin, col, mat)
    show(mat, lin, col)
    print()
    transp(mat, col, lin)
    
    