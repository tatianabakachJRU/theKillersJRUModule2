package elective_1;

public class RecursionSum {
    public static int sum(int number){
        System.out.println("Called sum: " + number);
        //Базовый случай
        if(number == 1){
            return 1;
        }

        //Рекурсивный случай
        return number + sum(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = sum(number);
        System.out.println("Result: " + result);
    }
}
