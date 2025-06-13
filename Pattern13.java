public class Pattern13 {
    public static void main(String[] args) {
        int num=5;
        int number=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
