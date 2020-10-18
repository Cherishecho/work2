package two;
import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		String[] name = new String[n];
		float[] score= new float[n];
		for(int i=0;i<n;i++){
			name[i] = input.next();
			score[i] = input.nextFloat();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(score[i]<score[j]) {
					float tmp=score[j];
					score[j]=score[i];
					score[i]=tmp;
					String tmp1=name[j];
					name[j]=name[i];
					name[i]=tmp1;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(name[i]);
        }
		
	}
	}
