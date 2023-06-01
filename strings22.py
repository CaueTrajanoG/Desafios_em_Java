frase = input('frase: ').upper()

saida = ''
for i in range(len(frase)):
    if frase[i] == 'A':
        saida += ' '
    elif frase[i] == 'E':
        saida += 'U'
    elif frase [i] == 'I':
        saida += 'O'
    elif frase [i] == 'O':
        saida += 'I'
    elif frase [i] == 'U':
        saida += 'E'
    elif frase [i] == ' ':
        saida += 'A'
    else:
        saida += frase[i]
print(saida)