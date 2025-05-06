package atividade;

import java.util.Scanner;

import static atividade.IdentificarAnimal.identificarAnimal;

public class Identificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.print("Digite a primeira palavra: ");
            String tipo1 = sc.nextLine();
            System.out.print("Digite a segunda palavra: ");
            String tipo2 = sc.nextLine();
            System.out.print("Digite a terceira palavra: ");
            String tipo3 = sc.nextLine();

            String resultado = identificarAnimal(tipo1, tipo2, tipo3);
            System.out.println(resultado);
            System.out.print("Digite 1 para tentar de novo ou 2 para sair:");
            escolha = sc.nextInt();
            sc.nextLine();
        } while (escolha != 2);

    }
}
