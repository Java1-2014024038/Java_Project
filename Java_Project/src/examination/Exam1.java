package examination;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=8; j>=1; j--){
			for(int i=1; i<=6; i++){
				if(j>=7 && j<=8 && i>=5 && i<=6) 
					break;
				if(j>=5 && j<=6 && i>=4 && i<=5) 
					continue;
				if(j==1 && i>=4 && i<=5){
					System.out.print("    ");
					continue;
				}
				System.out.print((100*j+i) + " ");	
			}
			System.out.println();
		}
		System.out.println("2014024038 ÃÖ³ªÀº");
	}
}
