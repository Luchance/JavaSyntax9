public class RandomNumber {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random() * 100);
        if (random < 50) {
            System.out.println("maziau uz 50: " + random);
        } else {
            System.out.println("Daugiau uz 50: " + random);
        }
    }
}