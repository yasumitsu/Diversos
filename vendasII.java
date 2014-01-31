import javax.swing.JOptionPane;
class vendasII
{
 public static void main(String args[])
    {
     float salario, soft;
     salario = 500;
     soft = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de softwares vendidos:"));
     salario = salario + (soft * 50);
     System.out.println ("O salário será: " + salario);
     JOptionPane.showMessageDialog(null,"O salário será : "+salario);
    }
}
