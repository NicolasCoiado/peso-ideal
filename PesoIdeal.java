import java.util.Scanner;
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("EXERCÍCIO 12");
            System.out.println("Diga sua altura:");
            double altura = Double.parseDouble(scanner.next());
            double pesoIdeal = (72.7*altura)-58;
            System.out.println("Seu peso ideal é igual a: "+pesoIdeal+" kg");
            System.out.println("=====================================");
    }
}
