import os
import stat

if os.path.isfile("permissao.txt"):
    os.chmod("permissao.txt", stat.S_IRWXU)

arquivo = open("permissao.txt", "w")
arquivo.write("Escrevendo coisarada")
arquivo.close()

os.chmod("permissao.txt", stat.S_IRUSR)