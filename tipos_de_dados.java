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

        System.out.println("O nome é : "+nome);
        System.out.println("A idade é : "+idade);
        System.out.println("O salário é : "+salario);

        JOptionPane.showMessageDialog(null,"O nome é : "+nome);
        JOptionPane.showMessageDialog(null,"A idade é : "+idade);
        JOptionPane.showMessageDialog(null,"O salário é : "+salario);
     }
}