import os
import stat
import datetime

os.chmod("permissao.txt", stat.S_IRWXU)

data = datetime.datetime.now()

arquivo = open("permissao.txt", "w")
arquivo.write(str(data))
arquivo.close()

os.chmod("permissao.txt", stat.S_IRUSR)