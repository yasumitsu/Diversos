import javax.swing.JOptionPane;
class vendasII
{
 public static void main(String args[])
    {
     float salario, soft;
     salario = 500;
     soft = Float.parseFloat(JOptionPane.showInputDialog("Digite o n�mero de softwares vendidos:"));
     salario = salario + (soft * 50);
     System.out.println ("O sal�rio ser�: " + salario);
     JOptionPane.showMessageDialog(null,"O sal�rio ser� : "+salario);
    }
}
