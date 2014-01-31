import javax.swing.JOptionPane;
class operacoes
{
    public static void main (String args[])
    {

        float num1=0, num2=0, soma, multiplicacao, divisao, subtracao; //no Java, as variáveis numéricas devem receber um valor para iniciar as operações

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a idade: "));

        soma = num1 + num2; //operação matemática simples, direto na variável
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        subtracao = num1 - num2;

        System.out.println("A soma é : "+soma);
        System.out.println("A multiplicação é : "+multiplicacao);
        System.out.println("A divisão é : "+divisao);
        System.out.println("A subtração é : "+subtracao);

        JOptionPane.showMessageDialog(null,"A soma é : "+soma);
        JOptionPane.showMessageDialog(null,"A multiplicação é : "+multiplicacao);
        JOptionPane.showMessageDialog(null,"A divisão é : "+divisao);
        JOptionPane.showMessageDialog(null,"A subtração é : "+subtracao);
     }
}