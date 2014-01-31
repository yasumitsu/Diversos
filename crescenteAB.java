import javax.swing.JOptionPane;
class crescenteAB
{
 public static void main(String args[])
    {
     int A, B;
      //printf("\nDigite o valor de A: ");
      //scanf("%d",&A);
      //printf("\nDigite o valor de B: ");
      //scanf("%d",&B);
      //if (A>B) //no C++, a condição fica entre parenteses
      //   printf("Em ordem crescente B=%d e A=%d", B,A);
      //else
      //    printf("Em ordem crescente A=%d e B=%d",B,A);

      A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
      B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
      if (A>B)
         JOptionPane.showMessageDialog(null,"Em ordem crescente B="+B+" e A="+A);
      else
         JOptionPane.showMessageDialog(null,"Em ordem crescente A="+A+" e B="+B);
     }
}