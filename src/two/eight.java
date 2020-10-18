package two;
import java.util.Scanner;
public class eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1:");
		int n=input.nextInt();
		int list1[]=new int[n];
		for(int i=0;i<n;i++) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2:");
		int m=input.nextInt();
		int list2[]=new int[m];
		for(int j=0;j<m;j++) {
			list2[j]=input.nextInt();
		}
		int list3[]=new int[n+m];
		int a=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(list2[j]<list1[i]) {
						list3[a]=list2[j];
						break;
					}
					else {
						list3[a]=list1[i];
						break;
					}
				}
				a=a+1;
			}
		System.out.print("The merged list is");
		for(int p=0;p<n+m;p++) {
			System.out.print(list3[p] );
		}
	}

}
