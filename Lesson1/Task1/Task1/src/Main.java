import java.util.Scanner;

/**Нахождение факториала числа
Напишите метод factorial, который принимает число n и возвращает его
факториал. Если число n < 0, метод должен вернуть -1.
**/
class Answer {
    public int factorial(int n){
        if (n<0) {
            return -1;
        }
        int result = 1;
        for(int i = 2; i <= n ; i++){
            result *= i;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Answer ans = new Answer();

        int result = ans.factorial(n);
        System.out.println(result);
    }

}


