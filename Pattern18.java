public class Pattern18 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i < num; i++) {
            for (char ch = (char) ('E'-i); ch <= 'E'; ch++) {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}
