public class Pattern14 {
    public static void main(String[] args) {
        int num=5;

        for (int i = 0; i < num; i++) {
            for (char ch = 'A'; ch <='A'+i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
