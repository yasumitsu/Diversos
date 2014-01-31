import javax.swing.JOptionPane;
class TabuadaPara
{
   public static void main(String args[])
   {
        int numero, i;
        String mensagem = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        for(i=1;i<=9;i=i+1)
            mensagem = mensagem + "\n" +numero + " x "+i+" = " +(numero * i);
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);
   }
}
