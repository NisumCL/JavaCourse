import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b;
        
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        a = lScanner.nextInt();

        System.out.println("Ingrese otro número: ");
        b = lScanner.nextInt();

        System.out.println(a);
        System.out.println(b);
    }
}