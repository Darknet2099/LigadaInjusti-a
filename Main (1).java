import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do corredor:");

        Corredor c1 = new Corredor(nome,0,2);

        c1.adicionarTrofeus(7);
        c1.adicionarTrofeus(3);
        c1.receberNotasDesempenho();
        c1.ficha();

        // Recebendo 100 notas de desempenho e calculando a média
  
        
  }
}
