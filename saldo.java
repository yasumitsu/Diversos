import javax.swing.JOptionPane;
class saldo
{
      public static void main(String args[])

    {
        float saldo, cheque;
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo atual: "));
        cheque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque: "));
        saldo = saldo - cheque;

        System.out.println ("O saldo atual é: " +saldo);

        JOptionPane.showMessageDialog(null,"O saldo atual é : "+saldo);
    }
}