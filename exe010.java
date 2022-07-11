import javax.swing.JOptionPane ;
public class exe010{
public static void main(String[] args) {
    String aux = "";
    float peso = 0, altura = 0, imc = 0;

    try{
        aux=JOptionPane.showInputDialog("Entre com o peso: ");
        peso = Float.parseFloat(aux);

        aux=JOptionPane.showInputDialog("Entre com a altura: ");
        altura = Float.parseFloat(aux);
    
        imc = peso/(altura * altura);

        if (imc < 18.5){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Peso abaixo do normal'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
        if (imc >= 18.5 && imc <= 24.4){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Peso Ideal'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
        if (imc >= 24.5 && imc <= 29.9){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Pré-obesidade'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
        if (imc >= 30 && imc <= 34.9){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Obesidade classe'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
        if (imc >= 35 && imc <= 39.9){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Obesidade severa'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
        if (imc >= 39.9){
        JOptionPane.showMessageDialog(null, "Seu imc é " + imc + " e a categoria é 'Obesidade móbida'.","Resultado",JOptionPane.WARNING_MESSAGE);
        }
    } 
    catch (NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Parabuains. Fodasse o programa!","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
}
