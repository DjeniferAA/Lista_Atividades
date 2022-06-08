//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package ex2_pag23;

import java.util.function.IntUnaryOperator;

//import java.util.Scanner;

public class ex1 {
    static long par = 1;
    Integer i;
    static int impar;
 public static void main(String[] args)
 {
    for(int i = 1; i < 30; i++)
    { 
     if ((i % 2) == 1 )
     {
       impar += i ;
     }
     else
    {
       par *= i;
     }
    }
    System.out.println("A soma dos numeros impares de 0 ate 30:" + impar );
    System.out.println("A multiplicação dos numeros pares de 0 ate 30:" + par  ); 
 }  
}
