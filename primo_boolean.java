import javax.swing.JOptionPane;
class primo_boolean
{
   public static void main(String args[])
  {
     int num, count, i;
     boolean ok;
     ok = true;
     i = 2;
     num = Integer.parseInt (JOptionPane.showInputDialog("Digite o número: "));
     while (i < num)
     {
        if (num % i == 0)
           ok = false;
        i = i + 1;
     }
     if (ok)
        JOptionPane.showMessageDialog(null, "O número "+num+" é primo.");
     else
        JOptionPane.showMessageDialog(null, "O número "+num+" não é primo.");
  }
}