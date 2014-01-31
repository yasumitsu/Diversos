import javax.swing.JOptionPane;
class carro
{
    public static void main (String args[])
    {

        float custo_total, fabrica, comissao, imposto;

        fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de fábrica: "));

        comissao = (fabrica * 25) / 100;
        imposto = (fabrica * 45) / 100;
        custo_total = (fabrica + comissao + imposto);
        System.out.println("A comissão é : "+comissao);
        System.out.println("O imposto é : "+imposto);
        System.out.println("O custo total é : "+custo_total);

        JOptionPane.showMessageDialog(null,"A comissão é : "+comissao);
        JOptionPane.showMessageDialog(null,"O imposto é : "+imposto);
        JOptionPane.showMessageDialog(null,"O custo total é : "+custo_total);
     }
}