package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.List;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alvo;

        System.out.println("Digite todos os códigos");
        String respUsuario = sc.nextLine();
        List<String> codigos= List.of(respUsuario.split(","));

        do {
            System.out.println("Digite qual código gostaria de verificar quantas vezes aparece ou digita sair para sair.");
            alvo = sc.nextLine();

            int soma = 0;
            for (String indice : codigos) {
                if (indice.equalsIgnoreCase(alvo)){
                    soma++;
                }
            }
            if (!alvo.equalsIgnoreCase("sair")) {
                System.out.println("O código " + alvo + " aparece " + soma + " vezes");
            }

        }while (!alvo.equalsIgnoreCase("sair"));

        System.out.println("Sistema encerrando...");
        sc.close();
    }
}
