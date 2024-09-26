public class Solucao1d {
  public static void main(String[] args) {
      String nome = "Carlos"; 
      char inicial = nome.charAt(0);

      if (inicial >= 'A' && inicial <= 'K') {
          System.out.println(nome + " está na D1.");
      } else if (inicial >= 'L' && inicial <= 'N') {
          System.out.println(nome + " está na D2.");
      } else if (inicial >= 'O' && inicial <= 'Z') {
          System.out.println(nome + " está na D3.");
      }
  }
}

