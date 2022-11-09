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
        // for (int i=100; i>= -10; i-=5){
        //     System.out.println(i);
        // }
        // double i = 2;
        // do {
        //     System.out.println(i);
        //     i = Math.pow(i,2);
        // }while(i < 1000000);
        // for (double i=2; i<1000000; i=Math.pow(i,2)){
        //     System.out.println(i);
        // }

        // FizzBuzz
        for(int i=0; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    
}
