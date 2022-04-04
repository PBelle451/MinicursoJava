public class Metodos {
    static void myMethod(String fname, int age){ //Cria um método que recebe um ou mais parâmetros
        System.out.println(fname + " is " + age); //O que o método vai retornar
    }
    public static void main(String[] args) {
        myMethod("Pedro", 19);
        myMethod("Robert", 20);
        myMethod("Nemo", 20);
    }   
}