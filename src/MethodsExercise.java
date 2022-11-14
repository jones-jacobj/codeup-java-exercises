public class MethodsExercise {

    public static int Addition(int num1, int num2){
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static int Multiplication2(int num1, int num2){
        int total = 0;
        for (int i=0; i<num2; i++){
            total += num1;
        }
        return total;
    }

    public static int Division(int num1, int num2){
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println(Multiplication(5, 3));
        System.out.println(Multiplication2(5, 3));
    }
}
