package classes;

public class SimpleComplex {
		
	float real;
	float imaginary;
	
		
	public SimpleComplex(float re, float im) {	//einai comstructor
			
		real = re;					//this.real = real; this.imaginary = imaginary afto tha to ekana an anti gia re kai im evaza real kai imaginary opote ta onomata na itan idia, to this se voithaei na ta ksexwriseis.
		imaginary = im;

	}
	
	public SimpleComplex() {
		
		real = 0;
		imaginary = 0;
		
	}
	
	public float getReal() {
		return real;
		
	}

	public float getImaginary(){
	
	return imaginary;
	
	}

	public void setReal(float re) {
		
		real = re;
		
	}

	public void setImagianry(float im) {
		
		imaginary = im;
	
	}
	
	float computeNorm() {
		
		float temp = (real*real) + (imaginary*imaginary);
		
		
		return (float) Math.sqrt(temp);
		
		
		
	}
	
}
