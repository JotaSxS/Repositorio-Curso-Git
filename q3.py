numeros = [] 
while True:
    try:
        numb1, numb2 = map(int, input("Digite dois números  ").split())

        if numb1 <= 0 or numb2 <= 0:
            numeros.append((numb1,numb2))
            break
print(numeros.sort())
        
