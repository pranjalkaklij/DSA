@FunctionalInterface
interface Pattern{
    abstract void printPattern();
}
public class Pattern2 {
    public static void main(String[] args) {
        Pattern P1 = () ->{
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        };
        P1.printPattern();
    }
}
