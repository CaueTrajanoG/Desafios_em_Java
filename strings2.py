frase = input('Frase: ')
print(frase.replace(' ',''))

frase2 = ''
for i in frase:
    if i != ' ':
        frase2+=i
print(frase2)