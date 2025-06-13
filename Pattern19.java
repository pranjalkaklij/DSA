public class Pattern19 {
    public static void main(String[] args) {
        int num=5;
        int iniSpace =0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num-i; j++) {
                System.out.print("*");
            }

            iniSpace +=2;
            System.out.println();
        }
        iniSpace =8;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            iniSpace -=2;
            System.out.println();
        }
    }
}
