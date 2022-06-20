#Simulador de caixa eletronico 50/20/10/01
print('='*40)
print('        Simulador de caixa 24H   ')
print('='*40)
resto = 0
saque = int(input('Saque: '))
if saque >= 50:
    while True:
        div50 = saque // 50
        resto = saque % 50
        print(f'    Foram emitidas {div50} cédulas de 50 R$')
        break
if resto >= 20:
    while True:
        div20 = resto // 20
        resto = resto % 20
        print(f'    Foram emitidas {div20} cédulas de 20 R$')
        break
if resto >= 10:
    while True:
        div10 = resto // 10
        resto = resto % 10
        print(f'    Foram emitidas {div10} cédulas de 10 R$')
        break
if resto < 10:
    print(f'    Foram emitidas {resto} cédulas de 1 R$')
print('=='*20)
print('     Volte sempre, tenha um bom dia')
