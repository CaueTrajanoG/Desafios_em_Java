nome = input('nome: ').upper()

nomes = nome.split(' ')
saida = nomes[len(nomes)-1] + ','

for i in range( len(nomes) -1):
    var = nomes[i]
    saida += var[0] +'.'

print(saida)