/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author usuario
 */
public class SimpleCalc {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        String entrada;
        do{
            System.out.println("Escoja una operaci�n o pulse 0 para salir.");
            System.out.println("Operaciones: + - * /");
            System.out.print("> ");
            entrada = sc.nextLine();
            int n1 = 0, n2 = 0;
            if("+-*/".contains(entrada)){
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
            }else{
                System.out.println("Operaci�n incorrecta!");
            }
            switch(entrada){
                case "+":
                    System.out.println("%d+%d=%d".formatted(n1,n2,n1+n2));
                    break;
                case "-":
                    System.out.println("%d-%d=%d".formatted(n1,n2,n1-n2));
                    break;
                case "*":
                    System.out.println("%dx%d=%d".formatted(n1,n2,n1*n2));
                    break;
                case "/":
                    System.out.println("%d/%d=%d".formatted(n1,n2,n1/n2));
                    break;
            }
        }while(!entrada.equals(""));
    }
}
