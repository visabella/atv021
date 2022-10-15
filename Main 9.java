import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x, y;
    int resultadoSoma;
    int resultadoSubtração;
    int resultadoMultiplicação;

    System.out.println("Digite o valor de X: ");
    x = sc.nextInt();

    System.out.println("Digite o valor de Y: ");
    y = sc.nextInt();
    System.out.println("");

    resultadoSoma = soma(x, y);
    System.out.println("O valor da soma é: " + resultadoSoma);

    resultadoSubtração = subtração(x, y);
    System.out.println("O valor da subtração é: " + resultadoSubtração);

    resultadoMultiplicação = multiplicação(x, y);
    System.out.println("O valor da multiplicação é: " + resultadoMultiplicação);

  }

  public static int soma(int x, int y) {

    int soma = x + y;

    return soma;
  }

  public static int subtração(int x, int y) {

    int subtração = x - y;

    return subtração;
  }

  public static int multiplicação(int x, int y) {

    int multiplicação = x * y;

    return multiplicação;
  }
}