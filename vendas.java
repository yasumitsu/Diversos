import javax.swing.JOptionPane;
class vendas
{
      public static void main(String args[])

    {
        float salario, comissao;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario fixo: "));
        comissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das vendas: "));
        salario = salario + (comissao * 15/100);

        System.out.println ("O sal�rio ser�: " +salario);

        JOptionPane.showMessageDialog(null,"O sal�rio ser� : "+salario);
    }
}