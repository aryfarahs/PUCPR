import os

# cores pra ficar legas
# verm = '\033[31m'
# verde = '\033[32m'
# amarelo = '\033[33m'
# reset = '\033[0m'

def title(x):
    print('\033[1m-' * 40)
    print(f'{x:<40}')
    print('-' * 40 + "\033[m")


def inicializar_cache(tam_cache, num_blocos):
    cache = {}
    for i in range(tam_cache // num_blocos):
        cache[i] = [-1] * num_blocos  
    return cache


def imprimir_cache(cache):

    k = list(cache.keys())
    v = list(cache.values())

    print(f"\033[1;34mTamanho da Cache: {len(cache)}\033[m")
    title("|    Conjunto     |        Bloco       |")
    for c in range(len(cache)):
        print(f"{k[c]:^17} | {str(v[c]):^19}")
        print("-" * 40)
    print()

    print("=-" * 20)


def atualizar_lru(lru, bloco):
    if bloco in lru:
        lru.remove(bloco)
    lru.append(bloco)


def mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria):
    
    lru = {i: [] for i in cache.keys()}

    hit = 0
    miss = 0

    for c in range(len(pos_memoria)):
        pos_conjunto = (pos_memoria[c] // num_blocos) % (tam_cache // num_blocos)

        print(f"\033[1mLinha {c} -> Posição da memória desejada: \033[1;35m{pos_memoria[c]}\033[m")

        if pos_memoria[c] in cache[pos_conjunto]:
            hit += 1
            print("\033[1;32mHIT!\033[m")
            atualizar_lru(lru[pos_conjunto], pos_memoria[c])
        else:
            miss += 1
            print("\033[1;31mMISS!\033[m")
            if -1 in cache[pos_conjunto]:
                index = cache[pos_conjunto].index(-1)
                cache[pos_conjunto][index] = pos_memoria[c]
            else:
                bloco_substituido = lru[pos_conjunto].pop(0)
                index = cache[pos_conjunto].index(bloco_substituido)
                cache[pos_conjunto][index] = pos_memoria[c]
            atualizar_lru(lru[pos_conjunto], pos_memoria[c])
        
        imprimir_cache(cache)

        print()

    acessos = miss + hit
    porcHits = (hit / acessos) * 100

    title("Resumo Mapeamento Associativo Por Conjunto - Ary | Vini | Ícaro")
    print(f"\033[1;35mTotal de acessos: {acessos}\033[m")
    print(f"\033[1;31mMisses: {miss}\033[m")
    print(f"\033[1;32mHits: {hit}\033[m")
    print(f"\033[1;34mTaxa de acertos (hits): {porcHits:.2f}%\033[m")
    print('-' * 40)


if __name__ == '__main__':
    os.system('cls')

    tam_cache = 16
    num_blocos = 4
    pos_memoria = [0, 1, 2, 2, 5, 6]

    cache = inicializar_cache(tam_cache, num_blocos)
    mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria)