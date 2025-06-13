public class Pattern9 {

    public void P1(int num)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void P2(int num)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*num - (2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num =5;

        Pattern9 p = new Pattern9();

        p.P1(num);
        p.P2(num);
    }
}
