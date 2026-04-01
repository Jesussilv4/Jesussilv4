import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;

public class App {
    public static void main(String[] args) throws Exception {
    ArrayList<Double> precos = new ArrayList<>();
    ArrayList<String> guarana = new ArrayList<>();
    guarana.add("GUARANÁ TRADICIONAL 300 ML ");
    precos.add(7.00);
    guarana.add("GUARANÁ TRADICIONAL 500 ML ");
    precos.add(12.00);
    guarana.add("GUARANÁ TRADICIONAL 700 ML ");
    precos.add(18.00);

    ArrayList<String> carrinho = new ArrayList<>();
    double total = 0;
    int continuar;
    do{

        String lista = "";
        

        for (int x = 0; x < guarana.size(); x ++) {
            lista += (x + 1) + " - " + guarana.get(x) + precos.get(x) +"\n";
        }
        String msn = lista + "DIGITE O NÚMERO DO PRODUTO AO QUAL VOCÊ DESEJA ADCIONAR:";
        String op = JOptionPane.showInputDialog(null,msn, "Lista de produtos", JOptionPane.QUESTION_MESSAGE);
        int num = Integer.parseInt(op);
        
        if(num >= 1 && num <= guarana.size()){
            carrinho.add(guarana.get(num - 1));
            total +=precos.get(num - 1);
            
            JOptionPane.showMessageDialog(null ,"produto adcionado!");
            
        }else{
            JOptionPane.showMessageDialog(null, "Produto invalido!");
            
        }
        continuar = JOptionPane.showConfirmDialog(null, "DESEJA ADCIONAR MAIS PRODUTOS?");
    
    } while (continuar == JOptionPane.YES_OPTION);
    String consumo = String.join("  \n", carrinho);
    JOptionPane.showMessageDialog(null, "SEU CONSUMO FOI: \n" + consumo 
    + "\n \n TOTAL: R$ = " + String.format("%.2f", total));

    }
}