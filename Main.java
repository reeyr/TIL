import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10]; 
        
        // for 문 작성하기
        for(int i = 0; i < numbers.length; i++){
        	numbers[i] = scanner.nextInt();
        }
            
        for (int number:numbers) {
            System.out.println(number); 
        }
    }
}