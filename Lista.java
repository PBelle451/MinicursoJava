public class Lista {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
        System.out.println(cars.length); //Quantos itens tem na lista
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }
    
}