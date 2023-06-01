frase = input('Frase: ')
contador = frase.count(' ')
print(f'a frase contem {contador} espaço(s)')

cont = 0 
for i in frase:
    if i == ' ':
        cont +=1

print(f'quantidades de brancos {cont}')

