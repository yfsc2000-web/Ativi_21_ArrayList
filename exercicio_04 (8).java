package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.List;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto= sc.nextLine();

        List<String> palavras= List.of(texto.split("\\s+"));

        for (String i : palavras ) {
            if (i.length()<5) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
