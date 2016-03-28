package Sample_0328;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = new int[2][3];
		for( int i=0; i<2; i++) {
			for( int j=0; j<3; j++){
				ar[i][j] = i*3+(j+1);
				System.out.println(ar[i][j]);
			}
		}
		
		
		/*for( int i=0, r=1; i<2; i++){
			for( int j=0; j<3; j++, r++) {
				ar[i][j] = r;
				System.out.println(ar[i][j]);
				}
			}*/
		 

	}

}
