public class Positive {
    public static void main(String[] args) {
        int num = -7;
        int firstScore = 18;
        int lastScore = 25;

        if (num > 0) {
            System.out.println("number type: positive");
        } else if (num < 0) {
            System.out.println("number type: negative");
        } else {
            System.out.println("number type: zero");
        }

        if(num % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        if (firstScore >= lastScore) {
            System.out.println("Larger score:" + firstScore);
        } else {
            System.out.println("Larger score:" + lastScore);
        }
    }
}
