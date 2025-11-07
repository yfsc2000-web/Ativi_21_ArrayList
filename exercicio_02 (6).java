package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> nomes= new ArrayList<>();
        String nome;
        do {
            System.out.println("Digite um nome ou digite fim para sair");
            nome= sc.nextLine();

            if (!nomes.contains(nome.trim().toLowerCase()) && !nome.equalsIgnoreCase("fim")){
                nomes.add(nome);
            }
        } while (!nome.equalsIgnoreCase("fim"));

        for (String indice : nomes) {
            System.out.println(indice);
        }
        sc.close();
    }
}
