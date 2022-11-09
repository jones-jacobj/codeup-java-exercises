public class ControlFlowExercises {
    public static void main(String[] args) {
        // int i = 5;
        // while (i <= 15) {
        //     System.out.println(i);
        //     i++;
        // }
        // int i = 100;
        // do {
        //     System.out.println(i);
        //     i -= 5;
        // }while(i >= -10);
        for (int i=100; i>= -10; i-=5){
            System.out.println(i);
        }
        // double i = 2;
        // do {
        //     System.out.println(i);
        //     i = Math.pow(i,2);
        // }while(i < 1000000);
        for (double i=2; i<1000000; i=Math.pow(i,2)){
            System.out.println(i);
        }
    }
}
