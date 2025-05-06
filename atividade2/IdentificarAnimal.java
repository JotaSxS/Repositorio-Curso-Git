package atividade;

public class IdentificarAnimal {
    public static String identificarAnimal(String tipo1, String tipo2, String tipo3){
        if (tipo1.equals("vertebrado")){
            if (tipo2.equals("ave")){
                if (tipo3.equals("carnivoro")){
                    return "aguia";
                } else if (tipo3.equals("onivoro")) {
                    return "pomba";
                }
            } else if (tipo2.equals("mamifero")) {
                if (tipo3.equals("onivoro")){
                    return "homem";
                } else if (tipo3.equals("herbivoro")) {
                    return "vaca";
                }
            }
        } else if (tipo1.equals("invertebrado")) {
            if (tipo2.equals("inseto")) {
                if (tipo3.equals("hematofago")){
                    return "pulga";
                } else if (tipo3.equals("herbivoro")) {
                    return "lagarta";
                }
            } else if (tipo2.equals("anelideo")) {
                if (tipo3.equals("hematofago")){
                    return "sanguessuga";
                } else if (tipo3.equals("onivoro")) {
                    return "minhoca";
                }
            }
        }
        return "nenhum animal encontrado";
    }
}
