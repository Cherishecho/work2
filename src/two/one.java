package two;
import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		int [] mylist =new int[150];
		System.out.print("Enter the integers between 1 and 100: ");
		int number = input.nextInt();
		while(number!=0) {
			if (number <= 100 && number >= 0) {
				mylist[number]=mylist[number]+1;
			}
			number = input.nextInt();
		}
		if(number==0) {
			for(i=1;i<=100;i++) {
				if(mylist[i]==1) {
					System.out.println(i +" occurs " +mylist[i] +" time");
				}
				if(mylist[i]>1) {
					System.out.println(i +" occurs " +mylist[i] +" times");
				}
			}
		}
	}

}
