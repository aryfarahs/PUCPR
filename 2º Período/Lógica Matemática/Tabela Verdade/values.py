def var(quant):
    if quant == 1:
        p = ['V','F']
    if quant == 2:
        p = ['V','V','F','F']
        q = ['V','F','V','F']     
    elif quant == 3:
        p = ['V','V','V','V','F','F','F','F']  
        q = ['V','V','F','F','V','V','F','F']
        r = ['V','F','V','F','V','F','V','F']
    elif quant == 4:
        p = ['V','V','V','V','V','V','V','V','F','F','F','F','F','F','F','F']
        q = ['V','V','V','V','F','F','F','F','V','V','V','V','F','F','F','F']
        r = ['V','V','F','F','V','V','F','F','V','V','F','F','V','V','F','F']
        s = ['V','F','V','F','V','F','V','F','V','F','V','F','V','F','V','F']


def equal(p, q, r='', s=''):
    print('')