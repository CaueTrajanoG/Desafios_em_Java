frase = input('frase: ')
print(frase.upper())

saida = ''
for i in frase:
    if i  >= 'a' and i <= 'z':
        saida += chr(ord(i)-32)
    else:
        saida += i
print(saida)