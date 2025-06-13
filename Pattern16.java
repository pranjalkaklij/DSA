public class Pattern16 {
    public static void main(String[] args) {
        int num=5;

        for (int i = 0; i < num; i++) {
            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();

        }
    }
}
