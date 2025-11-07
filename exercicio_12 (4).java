package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> nomes= new ArrayList<>();
        String nome;

        do {
            System.out.println("Digite um nome ou digite sair para sair");
            nome= sc.nextLine();

            if (!nome.equalsIgnoreCase("sair")) {
                nomes.add(nome);
            }
        } while (!nome.equalsIgnoreCase("sair"));

        System.out.println("Digite quantas rotações da fila serão simuladas:");
        int rot= sc.nextInt();

        for (int i=1; i<=rot; i++) {
            nomes.add(nomes.getFirst());
            nomes.remove(nomes.getFirst());
        }

        for (String i:nomes) {
            System.out.println(i);
        }
    }
}