public class Solucao1b {
  public static void main(String[] args) {
      int a = 6, b = 6, c = 6; 
      if ((a + b > c) && (a + c > b) && (b + c > a)) {
          if (a == b && b == c) {
              System.out.println("O triângulo é equilátero.");
          } else if (a == b || b == c || a == c) {
              System.out.println("O triângulo é isósceles.");
          } else {
              System.out.println("O triângulo é escaleno.");
          }
      } else {
          System.out.println("Os lados não formam um triângulo.");
      }
  }
}

