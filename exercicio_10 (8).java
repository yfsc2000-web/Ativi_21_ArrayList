package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.*;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite os emails separados apenas por vírgula");
        String emails= sc.nextLine().trim().toLowerCase();

        List<String> emailsDuplicados = List.of(emails.split(","));
        Set<String> set = new HashSet<>(emailsDuplicados);
        List<String> emailLimpo = new ArrayList<>(set);

        for (String i : emailLimpo){
            System.out.println(i);
        }
        sc.close();
    }
}
