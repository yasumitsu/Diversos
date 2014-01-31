import javax.swing.JOptionPane;
class consorcio
{
 public static void main(String args[])
    {
     float prest_total, prest_pagas, valor_total, valor_deve,valor_pago, valor;
     prest_total = Float.parseFloat(JOptionPane.showInputDialog ("Digite o numero total de prestacoes: "));
	 valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das prestacoes: "));
	 prest_pagas = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero de prestacoes pagas: "));
	 valor_total=valor*prest_total;
	 valor_pago=valor*prest_pagas;
	 valor_deve=(valor_total-valor_pago);
	 System.out.println("Voce pagou : R$ ",+valor_pago);
	 System.out.println("Ainda faltam: R$ ", +valor_deve);
     JOptionPane.showMessageDialog(null,"Voce pagou : R$ ",+valor_pago);
     JOptionPane.showMessageDialog(null,"Ainda faltam: R$ ", +valor_deve);

    }
}