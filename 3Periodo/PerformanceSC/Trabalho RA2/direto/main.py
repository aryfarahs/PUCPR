from func import *

# LETRA A
os.system('cls')
tamanho_cache = 5
pos_memoria = [0,1,2,3,1,4,5,6]

cache = inicializar_cache(tamanho_cache)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_direto(cache, tamanho_cache, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")



os.system('cls')
tamanho_cache = 5
pos_memoria = [0,1,2,2,22,32,42,20,1,10,11,12,13]

cache = inicializar_cache(tamanho_cache)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_direto(cache, tamanho_cache, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")



# LETRA B
os.system('cls')
tamanho_cache = 5
pos_memoria = [1,6,1,11,1,16,1,21,1,26]

cache = inicializar_cache(tamanho_cache)
title("Cache Inicial")
imprimir_cache(cache)
mapeamento_direto(cache, tamanho_cache, pos_memoria)

title("IR PARA PRÓXIMO EXEMPLO")
input("<PRESS ENTER>")

