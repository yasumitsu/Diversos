import javax.swing.JOptionPane;
class ContaBanco
{
   public static void main(String args[])
   {
        float saldoi, cheque;
        saldoi = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial: "));
        cheque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque: "));
        if (saldoi < cheque)
           JOptionPane.showMessageDialog(null,"Saldo insuficiente, disponível: R$"+saldoi);
        else
        {
           saldoi = saldoi - cheque;
           JOptionPane.showMessageDialog(null,"Operação realizada com sucesso, saldo restante: R$"+saldoi);
        }

   }