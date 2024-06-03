import os

# cores pra ficar legas
# verm = '\033[31m'
# verde = '\033[32m'
# amarelo = '\033[33m'
# reset = '\033[0m'

def title(x):
    print('\033[1m-' * 28)
    print(f'{x:^28}')
    print('-' * 28 + "\033[m")



def inicializar_cache(tamanho_cache):
    cache = {}
    for c in range(tamanho_cache):
        cache[c] = -1
    return cache



def imprimir_cache(cache=dict):

    k = list(cache.keys())
    v = list(cache.values())
    
    print(f"\033[1;34mTamanho da Cache: {len(cache)}\033[m")
    title("| Pos Cache  | Pos Memória |")
    for c in range(len(cache)):
        print(f"| {k[c]:^10} | {v[c]:^11} |")

    print("-" * 28)
    print("")
    print("=-" * 14)
    print("")



def mapeamento_direto(cache, tamanho_cache, pos_memoria):

    hit = 0
    miss = 0

    for c in range(len(pos_memoria)):
        pos_cache = pos_memoria[c] % tamanho_cache

        print(f"\033[1mLinha {c} -> Posição da memória desejada: \033[1;35m{pos_memoria[c]}\033[m")

        if cache[pos_cache] == pos_memoria[c]:
            hit += 1
            print("\033[1;32mHIT!\033[m")
        else:
            miss += 1
            print("\033[1;31mMISS!\033[m")
            cache[pos_cache] = pos_memoria[c]
        
        print()
        imprimir_cache(cache)

    acesso = hit + miss
    porcHits = (hit / acesso) * 100

    title("Resumo Mapeamento Direto - Ary | Vini | Ícaro")
    print(f"\033[1;35mTotal de acessos: {acesso}\033[m")
    print(f"\033[1;31mMisses: {miss}\033[m")
    print(f"\033[1;32mHits: {hit}\033[m")
    print(f"\033[1;34mTaxa de acertos (hits): {porcHits:.2f}%\033[m")
    print('-' * 30)


# ---------------------------------------------------


if __name__ == "__main__":
    tamanho_cache = 5
    pos_memoria = [0, 1, 2, 2, 5, 6]

    os.system('cls')

    teste = inicializar_cache(tamanho_cache)
    mapeamento_direto(teste, tamanho_cache, pos_memoria)