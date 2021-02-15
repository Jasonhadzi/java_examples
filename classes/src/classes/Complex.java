package classes;

public class Complex extends SimpleComplex{	//grafontas extends SimpleComplex einai san na exw kanei copy paste oli tin klassi SimpleComplex

	public Complex() {
		
	
		
		super();	//kalei ton aplo constractor stin SimpleComplex to super einai i prwti entoli pou kaloume
//		logw tou suoer den xreiazetai na grapsw tis parakate entoles
//		real = 0;
//		imaginary = 0;
				
	
	}
	
	public Complex(float re, float im){
		super(re,im);	//o super ston constractor me orismata kalei ton constrctor tis yperklasis pou pairnei orismata	
		
	}
	

	Complex conj() {
		
	 return new Complex(real, -imaginary);
	 	
	}
	
	
	static Complex multi(Complex a, Complex b){
		
		float re = (a.real*b.real) - (a.imaginary*b.imaginary);
		float im = (a.real*b.imaginary) + (a.imaginary - b.real);
		
		Complex sum = new Complex(re , im);
		
		
		return sum;
	}

	public static void main(String[] args) {
		
		
		Complex[] compArray = new Complex[10]; 	//orizw kai arxikopoiw pinaka pou na exei 10 antikeimeno tis klassis complex
				
		Complex[] conjArray = new Complex[10];	// gia tous sizigeis migadikous
		
		float[] norms = new float[10];	//float giati tha einai metra
		
		Complex[] multiArray = new Complex[10];	//tha apothikefsei ton pollaplasiasmo twn 2 migadikwn
		
		for (int i = 0; i < multiArray.length; i++) {
			
			compArray[i] = new Complex((float) Math.random(), (float) Math.random());	//kanw populate ton pinaka me random times
			
			conjArray[i] = compArray[i].conj();	//gia na parei tis times tou proigoumenou kai na dwsei tous sizigeis
			
			norms[i] = compArray[i].computeNorm();
			multiArray[i] = Complex.multi(compArray[i],conjArray[i]);	//to Complex. einai perito edw giati eimaste mesa stin klassi alla an to grafoume allou tha xreiastei opote to grafw kai egw etsi
			
			System.out.println("Comparray: " + compArray[i].real + compArray[i].imaginary);
			System.out.println("   ");
			System.out.println("Conjarray: " + conjArray[i].real + conjArray[i].imaginary);
			System.out.println("   ");
			System.out.println("multiarray: " + multiArray[i].real + multiArray[i].getImaginary());
			System.out.println("   ");
			System.out.println("norms "+ norms[i]*norms[i]);
			System.out.println(" --------------  ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
