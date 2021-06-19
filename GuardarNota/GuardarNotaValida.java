package GuardarNota;

import java.util.Scanner;

public class GuardarNotaValida {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        boolean notaValida = false;


       do {
           System.out.println("Digite sua nota: ");
           double nota = input.nextDouble();

           if (nota >= 0 && nota <= 10) {
               
               notaValida = true;

               System.out.println("A nota digitada é válida.");
           } else {
               
               System.out.println("A nota digitada é inválida.");

           }
           
       }while(notaValida == false);




    }
}