import javax.swing.JOptionPane;
class troca_de_valores
{
    public static void main (String args[])
    {

        int num1, num2, troca;

        num1 = 5;
        num2 = 10;

        troca=num1;
        num1=num2;
        num2=troca;

        System.out.println("O primeiro número é : "+num1);
        System.out.println("O segundo número é : "+num2);

        JOptionPane.showMessageDialog(null,"O primeiro número é : "+num1);
        JOptionPane.showMessageDialog(null,"O segundo número é : "+num2);

     }
}