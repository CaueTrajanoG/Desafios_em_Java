frase = input('Frase: ')
print(frase.title())
print(frase.capitalize())

flag = False
saida = ''
for i in range(len(frase)):
    if frase[i-1] == ' ' or i == 0:
        saida += frase[i].upper()
    else:
        saida += frase[i]
print(saida)