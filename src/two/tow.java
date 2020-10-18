package two;
import java.util.Scanner;
public class tow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numberList = new int[10];
		int[] distinctList = new int[10];
		for (int i = 0; i < 10; i++) {
            numberList[i] = input.nextInt();
	}
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10;j++) {
                if (i == numberList[j])
                    distinctList[i] = numberList[j];
            }
        }
		int count = 0;
        for (int i = 0; i < 10; i++) {
            if (distinctList[i] != 0)
                count++;
        }
        System.out.print("The number of distinct number is " + count+
                "\nThe distinct numbers are: ");

        for (int i = 0; i < 10; i++) {
            if (distinctList[i] != 0) {
                System.out.print(distinctList[i] + " ");
            }
        }
    }

}
