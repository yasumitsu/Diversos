import javax.swing.JOptionPane;
class tipos_de_dados
{
    public static void main (String args[])
    {

        float salario;
        int idade;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: "));

        System.out.println("O nome � : "+nome);
        System.out.println("A idade � : "+idade);
        System.out.println("O sal�rio � : "+salario);

        JOptionPane.showMessageDialog(null,"O nome � : "+nome);
        JOptionPane.showMessageDialog(null,"A idade � : "+idade);
        JOptionPane.showMessageDialog(null,"O sal�rio � : "+salario);
     }
}