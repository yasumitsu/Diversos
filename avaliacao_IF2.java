/* Problema: O sistema de avalia��o de determinada disciplina, � composto
por tr�s provas. A primeira prova tem peso 2,  a  Segunda tem peso 3 e
 a terceira prova tem peso 5. Fa�a um algoritmo para calcular a m�dia
 final de um aluno desta disciplina. Caso a media seja maior ou igual
  a 6 mostre APROVADO, se a media for entre 4 e 6, mostre em RECUPERA��O,
  e se for menor do que 4 mostre REPROVADO.
*/
import javax.swing.JOptionPane;
class avaliacao_IF2
{
   public static void main(String args[])
   {
        float prova1, prova2, prova3, media;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1.: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2.: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 3.: "));
        //prova1 := 6;
        //prova2 := 8;
        //prova3 := 4;

        prova1 = prova1 * 2 /10;
        prova2 = prova2 * 3 /10;
        prova3 = prova3 * 5 /10;
        media  = (prova1 + prova2 + prova3);

        if (media >= 6)
           JOptionPane.showMessageDialog(null,"Aprovado com media "+media);
        else if (media >= 4)
           JOptionPane.showMessageDialog(null,"Recuperacao com media "+media);
        else
           JOptionPane.showMessageDialog(null,"Reprovado com media "+media);

   }
}