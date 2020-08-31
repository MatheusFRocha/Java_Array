import java.util.Scanner;

public class Java_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] num= new int[10];

		Scanner leitor= new Scanner(System.in);
		
		
		
		System.out.println("Digite 10 números inteiro");
		
		num[0]= leitor.nextInt();
		num[1]= leitor.nextInt();
		num[2]= leitor.nextInt();
		num[3]= leitor.nextInt();
		num[4]= leitor.nextInt();
		num[5]= leitor.nextInt();
		num[6]= leitor.nextInt();
		num[7]= leitor.nextInt();
		num[8]= leitor.nextInt();
		num[9]= leitor.nextInt();
		
		System.out.println("A média entre esses números é " +(num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9])/10);
	}

}
