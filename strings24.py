frase = input('Frase: ')
n = int(input('Repeat: '))

saida = ''
for i in range(len(frase)):
    if frase[i] == 'a' or frase[i]=='e' or frase[i]=='i' or frase[i]=='o'or frase[i]=='u':
        saida += frase[i]*n
    else:
        saida += frase[i]
print(saida)
