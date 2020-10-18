package two;
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [] mylist=new double[10];
		for(int i=0;i<10;i++) {
			mylist[i]=input.nextDouble();
		}
		int flag=1;
		while(flag==1) {
			for(int i=0;i<10;i++) {
				for(int j=9;j>i;j--) {
					double temp = mylist[j-1];
					mylist[j-1] = mylist[j];
					mylist[j] = temp;
				}
				flag=0;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(mylist[i]+" ");
		}
	}

}
