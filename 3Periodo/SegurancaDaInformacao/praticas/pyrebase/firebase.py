import pyrebase     #importar o pyrebase4 no pip
import getpass      #leitura da senha sem eco

firebaseConfig = {
    "apiKey": "AIzaSyAxlUrUoQk-ZnvpEP4ivvnkfvsfV0gwTSY",
    "authDomain": "pyrebasepucpr.firebaseapp.com",
    "projectId": "pyrebasepucpr",
    "databaseURL": "https://" + "pyrebasepucpr" + ".firebaseio.com",
    "storageBucket": "pyrebasepucpr.appspot.com",
    "messagingSenderId": "590943201963",
    "appId": "1:590943201963:web:3162034624eeecfdd5e5ee",
    "measurementId": "G-JYZF5GXERR"
}

firebase = pyrebase.initialize_app(firebaseConfig)
auth = firebase.auth()

user = input("Digite seu e-mail: ")
password = input("Digite sua senha, com pelo menos 6 caracteres: ")
# status = auth.create_user_with_email_and_password(user,password)
status = auth.sign_in_with_email_and_password(user, password)
idToken = status["idToken"]

print("Resultado: ", status)
print("Token: ", idToken)

info = auth.get_account_info(idToken)
print("Info", info)

pausa = input('Pressione ENTER para finalizar...')

# Baseado em código de https://aicodeconvert.com/



