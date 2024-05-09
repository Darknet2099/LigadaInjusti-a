import javax.swing.JOptionPane;
public class Corredor{
  private String Nome;
  private double Notas;
  private int Trofeus;

public Corredor (String Nome, double Notas, int Trofeus){
  this.Nome = Nome;
  this.Notas = 0;
  this.Trofeus = 0; }

public void adicionarTrofeus(int quantidade){
  this.Trofeus += quantidade; }

public void ficha() {
  System.out.println("Nome: " + this.Nome);
  System.out.println("Notas: " + this.Notas);
  System.out.println("Trofeus: " + this.Trofeus); }

public void tipo() {
  if (Trofeus > 5 ){
    System.out.print("Campeão"); 
  } else{
    System.out.print("Amador"); }
  }

public String getNome() {
  return Nome; }

public void setNome(String Nome) {
  this.Nome = Nome; }

public double getNotas(){
  return Notas; }

public void setNotas(double Notas){
  this.Notas = Notas; }

public int getTrofeus(){
  return Trofeus; }

public void setTrofeus(int Trofeus){
  this.Trofeus = Trofeus; }

public void receberNotasDesempenho() {
    double somaNotas = 0;
    for (int i = 1; i <= 100; i++) {
    String notaStr = JOptionPane.showInputDialog("Digite a nota de desempenho " + i + ":");
    double nota = Double.parseDouble(notaStr);
    somaNotas += nota;
      }
    this.Notas = somaNotas / 100;
  }


 }

