public class Pattern17 {
    public static void main(String[] args) {
        int num =5;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint =(2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakpoint){ch++;}else{ch--;}
            }

            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
