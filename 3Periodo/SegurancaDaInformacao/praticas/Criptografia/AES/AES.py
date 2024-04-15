import os
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.backends import default_backend

backend = default_backend()
key = os.urandom(32)
iv = os.urandom(16)
MSG = "“RSA: algoritmo dos professores do MIT: Rivest, Shamir e Adleman”"

#convertendo para array de bits
b_MSG = bytearray(MSG, encoding="ascii")

aes = algorithms.AES(key) #objeto que criptografa AES 
cbc = modes.CBC(iv) #modo com initialization vector
cipher = Cipher(aes, cbc, backend=backend) #cypher
encryptor = cipher.encryptor() #encriptador
ct = encryptor.update(b_MSG)