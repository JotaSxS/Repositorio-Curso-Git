def classificarAnimais( tipo_osseo, classe ,alimentacao ):
    if tipo_osseo == vertebrado :

        if classe == ave :

            if alimentacao == carnivoro :
                return 'aguia'
            else: return 'pomba'
        else : 
            if alimentacao == oivoro :
                return 'homem'
            else:
                return 'vaca'
    if tipo_osseo == invertebrado :
        if classe == inseto :
            if alimentacao == hematofogo:
                return 'pulga'
            else : return 'lagarta'
        else :
            if alimentacao== hematofogo :
                return 'sanguessuga'
            else:
                return 'minhoca'