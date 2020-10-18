package two;
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int flag=0;
		System.out.print("Enter list:");
		int n=input.nextInt();
		int[] list=new int[n];
		for(int i=0;i<n;i++) {
			list[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(list[j]<list[i]) {
					flag=1;
					break;
				}
				else {
					continue;
				}
			}
			if(flag==1) {
				System.out.println("The list is not sorted");
				break;
			}
		}
		if(flag==0) {
			System.out.println("The list is already sorted");
		}
	}

}
