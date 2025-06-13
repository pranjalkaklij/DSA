public class Pattern10 {                            
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= 2*num-1; i++) {
            int stars= i;
            if (i>num) {
                stars=2*num-i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
