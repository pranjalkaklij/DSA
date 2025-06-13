@FunctionalInterface
interface Pattern{

    abstract void printPattern();
}
public class Pattern1{

    public static void main(String[] args) {
        Pattern P1 = ()->{
            for(int i=0; i<4; i++){
                for (int j = 0; j < 4; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        };
        P1.printPattern();
    }

    
}