import javax.swing.JOptionPane;  //biblioteca para interação com o usuário
class media_inter
{
    public static void main(String args[])
    {
        float nota1, nota2, calc_media; //variáveis do tipo float
        //JOptionPane.showInputDialog("Digite a primeira nota: "); abre a caixa de diálogo
        float prova1, prova2, prova3, nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        prova1 = (nota * 2/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        prova2 = (nota * 3/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
        prova3 = (nota * 5/10);
        nota = prova1 + prova2 + prova3;

        if (nota >= 6)
           System.out.println ("O aluno foi aprovado com média: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi aprovado com média: "+nota);
        else if (nota >= 4)
           System.out.println ("O aluno foi para recuperação com média: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi para recuperação com média: "+nota);
        else
           System.out.println ("O aluno foi reprovado com média: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi reprovado com média: "+nota);
    }
}