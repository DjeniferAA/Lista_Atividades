//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
package ex2_pag23;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class exer1_pg26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         float h,b,B,area;
         System.out.println("Digite a altura:" );
         h = input.nextInt();  
         System.out.println("Digite a base menor:" );
         b = input.nextInt(); 
         System.out.println("Digite a base maior:" );
         B = input.nextInt();
         area =(h*(b + B))/2;
         
         System.out.println("o valor da área é de:" + area ); 
         //System.out.println("Area arredondada:" + Math.round(area)); 
    }
    
}
