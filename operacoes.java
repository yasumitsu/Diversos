import javax.swing.JOptionPane;
class operacoes
{
    public static void main (String args[])
    {

        float num1=0, num2=0, soma, multiplicacao, divisao, subtracao; //no Java, as vari�veis num�ricas devem receber um valor para iniciar as opera��es

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a idade: "));

        soma = num1 + num2; //opera��o matem�tica simples, direto na vari�vel
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        subtracao = num1 - num2;

        System.out.println("A soma � : "+soma);
        System.out.println("A multiplica��o � : "+multiplicacao);
        System.out.println("A divis�o � : "+divisao);
        System.out.println("A subtra��o � : "+subtracao);

        JOptionPane.showMessageDialog(null,"A soma � : "+soma);
        JOptionPane.showMessageDialog(null,"A multiplica��o � : "+multiplicacao);
        JOptionPane.showMessageDialog(null,"A divis�o � : "+divisao);
        JOptionPane.showMessageDialog(null,"A subtra��o � : "+subtracao);
     }
}