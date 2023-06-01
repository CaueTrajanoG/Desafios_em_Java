entrada = input('Entrada: ')

for i in range(len(entrada) +1):
    print(entrada[i-1] * i)


for i in range( len(entrada)-1,-1,-1):
    print(entrada[i-1] * i)