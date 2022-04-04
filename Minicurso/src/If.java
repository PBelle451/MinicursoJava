import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade;
        System.out.println("Insira uma idade: ");
        idade = input.nextInt();
        if (idade < 18){
            System.out.println("Não pode votar");
        } else {
            System.out.println("Pode votar");
        }
        input.close();
    }
}
