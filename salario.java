import javax.swing.JOptionPane;
class salario
{
 public static void main(String args[])
    {
     float salario_bruto, salario_liquido, inss;
     String nome;
     nome = (JOptionPane.showInputDialog("Digite seu nome: "));   //por ser uma String, ela não precisa ser convertida.
     salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario bruto: "));
     inss=salario_bruto*9/100;
     salario_liquido=salario_bruto - inss;
     System.out.println ("" + nome);
     System.out.println ("Seu salário bruto foi: " + salario_bruto);
     System.out.println ("Seu salário será: " + salario_liquido);
     System.out.println ("Seu desconto do INSS foi de: " + inss);
     JOptionPane.showMessageDialog(null,"Seu salário bruto foi: " + salario_bruto);
     JOptionPane.showMessageDialog(null,"Seu salário será: " + salario_liquido);
     JOptionPane.showMessageDialog(null,"Seu desconto do INSS foi de: " + inss);
    }
}