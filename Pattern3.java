@FunctionalInterface
interface Pattern{
    abstract void printPattern(int n);
}

public class Pattern3 {
    public static void main(String[] args) {
        Pattern P1 = (n)->{
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    };

    P1.printPattern(5);
    }
    
}
