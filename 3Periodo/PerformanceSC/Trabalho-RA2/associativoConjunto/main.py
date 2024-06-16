from func import *

# LETRA A
# 4 blocos
os.system('cls')

tam_cache = 16
num_blocos = 4
pos_memoria = [0, 2, 2, 5, 6, 3, 4]

cache = inicializar_cache(tam_cache, num_blocos)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")


# 8 blocos
os.system('cls')

tam_cache = 16
num_blocos = 8
pos_memoria = [1, 0, 5, 4, 7, 2, 3, 3]

cache = inicializar_cache(tam_cache, num_blocos)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")


# 2 blocos
os.system('cls')

tam_cache = 16
num_blocos = 2
pos_memoria = [4, 2, 5, 6, 7, 2, 1, 1, 2]

cache = inicializar_cache(tam_cache, num_blocos)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")



# 6 - b
os.system('cls')

tam_cache = 16
num_blocos = 4
pos_memoria = [0, 4, 8, 12, 16, 20, 24, 28, 4, 8, 12]

cache = inicializar_cache(tam_cache, num_blocos)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_associativo_conjunto(cache, tam_cache, num_blocos, pos_memoria)
