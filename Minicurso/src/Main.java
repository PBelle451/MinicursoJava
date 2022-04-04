import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo");
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um nome");
        name = input.nextLine();
        System.out.println("Meu nome é: " + name);
        input.close();
        String botafogo = "Olá pobre imundo";
        String carName = "Volvo";
        int maxSpeed = 120;
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(carName);
        System.out.println(botafogo);
        System.out.println(maxSpeed);
    }
}
