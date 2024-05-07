public class MainAnimal{
    public static void main(String[] args) {
        Perro perro = new Perro("toby", "croquetas", 12, "pitbull");
        Gato gato = new Gato("pelusa", "pezcado", 5, "meztiza");
        perro.mostrar();
        System.out.println();
        gato.mostrar();;
        System.out.println();
    }
}