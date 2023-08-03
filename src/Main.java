public class Main {
    public static void main(String[] args) {
        Mage mag = new Mage("Alan", 20, 100, "ice");
        System.out.println(mag.getInfo());
        System.out.println(mag.fight(mag));
    }
}
