import javax.swing.JOptionPane;  //biblioteca para intera��o com o usu�rio
class media_inter
{
    public static void main(String args[])
    {
        float nota1, nota2, calc_media; //vari�veis do tipo float
        //JOptionPane.showInputDialog("Digite a primeira nota: "); abre a caixa de di�logo
        float prova1, prova2, prova3, nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        prova1 = (nota * 2/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        prova2 = (nota * 3/10);
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
        prova3 = (nota * 5/10);
        nota = prova1 + prova2 + prova3;

        if (nota >= 6)
           System.out.println ("O aluno foi aprovado com m�dia: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi aprovado com m�dia: "+nota);
        else if (nota >= 4)
           System.out.println ("O aluno foi para recupera��o com m�dia: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi para recupera��o com m�dia: "+nota);
        else
           System.out.println ("O aluno foi reprovado com m�dia: "+nota);
           JOptionPane.showMessageDialog(null,"O aluno foi reprovado com m�dia: "+nota);
    }
}