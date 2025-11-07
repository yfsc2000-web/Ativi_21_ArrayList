package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.List;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite uma lista de tarefas");
        String tarefas= sc.nextLine();

        List<String> lista= List.of(tarefas.split(","));

        for (int i=0; i < lista.size(); i++ ) {
            System.out.println((i+1)+"º: "+lista.get(i));
        }
        sc.close();
    }
}
