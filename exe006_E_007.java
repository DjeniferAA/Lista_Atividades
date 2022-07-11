//cedup albilio paulo turma:3-54 nome:Djenifer A A e Joao Vitor S. Svaisser
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exe006_E_007{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           Double salario, Htrab;
           String nome = "dirija-se";
            System.out.println("Informe as horas trabalhadas:");
            
            Htrab = input.nextDouble();
            
            salario = (Htrab * 10.25);
           
            System.out.println("Você irá receber: " + "R$ " + salario);
    
         //Atividade 7
            if (salario < 50) {
            JOptionPane.showMessageDialog(null,"Atenção, " + nome + " à direção do hotel");
        }

}
}