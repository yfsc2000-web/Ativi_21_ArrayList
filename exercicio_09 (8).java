package Atividades_Listas_Senai.Atv21_ExerciciosDeArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        List<Double> list = new ArrayList<>();

        int resp;

        do {
            double preco;

            System.out.println("1-Add\n" + "2-List\n" + "3-List compare\n" + "4-Clean\n" + "0-Exit");
            resp=sc.nextInt();

            if (resp==1) {
                System.out.println("Type the price");
                list.add(sc.nextDouble());
            } else if (resp==2) {
                for (double i : list) {

                    System.out.println(i);
                }

            } else if (resp==3) {
                System.out.println("Enter the price to be compared");
                preco=sc.nextDouble();

                for (double i : list) {
                    if (i>preco){
                        System.out.println(i);
                    }
                }

            } else if (resp==4) {
                list.clear();

            }
            else System.out.println("Enter a valid number");


        }while(resp!=0);



    }
}
