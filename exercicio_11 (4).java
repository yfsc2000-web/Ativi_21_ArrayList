package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Double> temp= new ArrayList<>();

        while (temp.size()<=7) {
            System.out.println("Digite uma temperatura:");
            temp.add(sc.nextDouble());
        }

        for (Double i : temp) {
            if (i>=35) {
                System.out.println(i+" Alerta de calor");
            } else
                System.out.println(i);
        }
        sc.close();
    }
}
