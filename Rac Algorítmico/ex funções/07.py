def valorPagamento(valor, dias):
    if dias == 0:
        return f' Valor com multa: R${valor:.2f}'
    else:
        valor += (valor * 0.03) + ((0.001 * valor) *  dias)
        return f'Valor com multa: R${valor:.2f}'

while True:
    valor = float(input('Digite o valor [0 p/ parar]: R$'))
    dias = int(input('Quantos dias de atraso? '))
    print(valorPagamento(valor, dias))
    if valor == 0:
        break


































































































































