import javax.swing.JOptionPane;
class primo
{
   public static void main(String args[])
  {
     int num, count, i;
     count = 0;
     i = 2;
     num = Integer.parseInt (JOptionPane.showInputDialog("Digite o número: "));
     while (i < num)
     {
        if (num % i == 0)
           count = count +1;
        i = i + 1;
     }
     if (count > 0)
        JOptionPane.showMessageDialog(null, "O número "+num+" não é primo.");
     else
        JOptionPane.showMessageDialog(null, "O número "+num+" é primo.");
  }
}