package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        List<Double> numeros=new ArrayList<>();
        double numero,soma=0,media=0;
        int contador=1;

        do {
            System.out.println("Digite seu número (caso queira sair, digite 0.)");
            numero=sc.nextDouble();

            if (numero > 0)  {
                numeros.add(numero);
                soma+=numero;
            }else if (numero < 0){
                System.out.println("Não pode ter número negativo");
            }
        } while (numero!=0);

        int tamanho=numeros.size();
        media=soma/tamanho;

        for (double abc : numeros) {
            System.out.println("Preço "+contador+": "+abc);
            contador++;
        }
        System.out.printf("média: %.2f%n",media);
    }
}
