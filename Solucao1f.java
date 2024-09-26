public class Solucao1f {
  public static void main(String[] args) {
      int[] numeros = {8, 3, 5, 7, 10}; 
      int maior = numeros[0]; 
      int menor = numeros[0]; 

      for (int i = 1; i < numeros.length; i++) {
          if (numeros[i] > maior) {
              maior = numeros[i]; 
          }
          if (numeros[i] < menor) {
              menor = numeros[i]; 
          }
      }

      System.out.println("O maior número é: " + maior);
      System.out.println("O menor número é: " + menor);
  }
}
