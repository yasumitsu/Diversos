import javax.swing.JOptionPane;
class primo
{
   public static void main(String args[])
  {
     int num, count, i;
     count = 0;
     i = 2;
     num = Integer.parseInt (JOptionPane.showInputDialog("Digite o n�mero: "));
     while (i < num)
     {
        if (num % i == 0)
           count = count +1;
        i = i + 1;
     }
     if (count > 0)
        JOptionPane.showMessageDialog(null, "O n�mero "+num+" n�o � primo.");
     else
        JOptionPane.showMessageDialog(null, "O n�mero "+num+" � primo.");
  }
}