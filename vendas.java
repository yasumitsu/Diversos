import javax.swing.JOptionPane;
class vendas
{
      public static void main(String args[])

    {
        float salario, comissao;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario fixo: "));
        comissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das vendas: "));
        salario = salario + (comissao * 15/100);

        System.out.println ("O salário será: " +salario);

        JOptionPane.showMessageDialog(null,"O salário será : "+salario);
    }
}