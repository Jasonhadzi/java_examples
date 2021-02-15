
public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] arraySum = new int[10];

		for (int i = 0; i < 10; i++) {

			array1[i] = i;
			array2[i] = (int)  (Math.random()*10);	// o math.random epistrefei times apo [0,1) opote kanw *10 gia na einai mexri 10 kai kanw kai (int) gia na ginei mprosta mia stoggylopoiisi
			
			arraySum[i] = array1[i] + array2[i];
			
			System.out.print(arraySum[i]+" ");
		}

	}

}
