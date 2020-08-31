
public class Java_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner (System.in);
		
		String [] nomes = new String [10];
		
		System.out.println("Digite 10 nomes:");
		
		nomes[0]= leitor.next();
		nomes[1]= leitor.next();
		nomes[2]= leitor.next();
		nomes[3]= leitor.next();
		nomes[4]= leitor.next();
		nomes[5]= leitor.next();
		nomes[6]= leitor.next();
		nomes[7]= leitor.next();
		nomes[8]= leitor.next();
		nomes[9]= leitor.next();
		
		System.out.println("Os nomes são:"+nomes[0]+","+nomes[1]+", "+nomes[2]+", "+nomes[3]+", "+nomes[4]+", "+nomes[5]+", "+nomes[6]+", "+nomes[7]+", "+nomes[8]+", "+nomes[9]);
	}

}
