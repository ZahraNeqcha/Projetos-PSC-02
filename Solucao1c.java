public class Solucao1c {
  public static void main(String[] args) {
      String verbo = "cantar"; 

      if (verbo.endsWith("ar")) {
          System.out.println("Verbo da 1ª conjugação.");
      } else if (verbo.endsWith("er")) {
          System.out.println("Verbo da 2ª conjugação.");
      } else if (verbo.endsWith("ir")) {
          System.out.println("Verbo da 3ª conjugação.");
      } else if (verbo.endsWith("or") || verbo.endsWith("ur")) {
          System.out.println("Provavelmente não é verbo no infinitivo.");
      } else {
          System.out.println("Não está no infinitivo.");
      }
  }
}

