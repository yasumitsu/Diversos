import javax.swing.JOptionPane;
class carro
{
    public static void main (String args[])
    {

        float custo_total, fabrica, comissao, imposto;

        fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de f�brica: "));

        comissao = (fabrica * 25) / 100;
        imposto = (fabrica * 45) / 100;
        custo_total = (fabrica + comissao + imposto);
        System.out.println("A comiss�o � : "+comissao);
        System.out.println("O imposto � : "+imposto);
        System.out.println("O custo total � : "+custo_total);

        JOptionPane.showMessageDialog(null,"A comiss�o � : "+comissao);
        JOptionPane.showMessageDialog(null,"O imposto � : "+imposto);
        JOptionPane.showMessageDialog(null,"O custo total � : "+custo_total);
     }
}