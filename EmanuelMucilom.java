import javax.swing.JOptionPane;
import java.util.Scanner;

public class EmanuelMucilom{
  
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Integer Idade;
            System.out.println("Digite a sua Idade:" );
            Idade = input.nextInt();

            if ((Idade < 3) && (Idade == 0)) {
                JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é bebê.");}

                if ((Idade >= 3) && (Idade <= 11)) {
                    JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é Criança.");}

                    if ((Idade >= 12) && (Idade <= 19)) {
                        JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é Adolecente.");}

                        if ((Idade >= 20) && (Idade <= 30)) {
                            JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é Jovem.");}

                            if ((Idade >= 31) && (Idade <= 60)) {
                                JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é Adulto.");}
    
                                if (Idade >= 61)  {
                                    JOptionPane.showMessageDialog(null,"Você tem " + Idade + " de idade, logo é Jovem.");}
        
        }
  
     }
}
