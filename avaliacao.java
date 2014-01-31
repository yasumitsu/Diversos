import javax.swing.JOptionPane;
class avaliacao
{
      public static void main(String args[])

    {
        float prova1, prova2, prova3, nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        prova1 = (nota * 2/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        prova2 = (nota * 3/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
        prova3 = (nota * 5/10);
        nota = prova1 + prova2 + prova3;

        if (nota >= 6)
           JOptionPane.showMessageDialog(null,"O aluno foi aprovado com média: "+nota);
        else if (nota >= 4)
           JOptionPane.showMessageDialog(null,"O aluno foi para recuperação com média: "+nota);
        else
           JOptionPane.showMessageDialog(null,"O aluno foi reprovado com média: "+nota);

     }
}