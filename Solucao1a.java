public class Solucao1a {
  public static void main(String[] args) {
      int a = 5, b = 7, c = 10; 
      if ((a + b > c) && (a + c > b) && (b + c > a)) {
          System.out.println("Os números podem ser lados de um triângulo.");
      } else {
          System.out.println("Os números não podem ser lados de um triângulo.");
      }
  }
}
