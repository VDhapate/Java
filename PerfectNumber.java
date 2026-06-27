class PerfectNumber{
public static void main(String[] args) {
		int a [] = {28, 6, 496, 45, 34};
		int b [] = a;
		for(int i = 0 ; i<a.length; i++){
			if(b[i]==sumI(a[i]))
				System.out.println("perfect number "+a[i]);
		}
	}
	public static int sumI(int num){
		int sum = 0;
		for(int i = 1; i<=num/2; i++){
			if(num%i==0)
				sum+=i;
		}
		return sum;
	}	
}