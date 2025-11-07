package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> palavras= new ArrayList<>();

        System.out.println("Digite quantas palavras gostaria de digitar:");
        int n= sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++) {
            System.out.println("Digita a "+(i+1)+"º palavra:");
            palavras.add(sc.nextLine());
        }

        System.out.println("Digite o tamanho maximo (em letras) das palavras que deseja remover");
        int tamanho= sc.nextInt();

        palavras.removeIf(i -> i.length() <= tamanho);

        for (String i:palavras) {
            System.out.println(i);
        }
        sc.close();
    }
}
