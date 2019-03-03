package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int i = 1;
         int b = 0;
        System.out.println("40 Fibonacci numbers: ");
        for (int r =1; r <=40; r++){
            int sum = i +b;
            i = b;
            b = sum;
            System.out.println(sum + " ");

        }

    }
}
