public class Pattern20 {
    public static void main(String[] args) {
        int num=5;
        int iniSpace=2*num-2;
        for (int i = 1; i <= 2*num-1; i++) {

            int stars=i;
            if(i>num) {stars =2*num-i;}
            for (int j = 1; j <= stars; j++) {
              System.out.print("*");  
            }
            for (int j = 1; j <= iniSpace; j++) {
              System.out.print(" ");  
            }
            for (int j = 1; j <= stars; j++) {
              System.out.print("*");  
            }
            if(i<num){iniSpace -=2;}else{iniSpace +=2;}
            System.out.println();
        }
        
    }
}
