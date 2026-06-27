class HarshadArray{
	public static void main(String[] args) {
		int [] a = {9, 21, 36, 72, 58};
		int sum = 0;
		for(int i = 0; i < a.length; i++){
             if(a[i]%sumI(a[i])==0){
             	System.out.println("harshad number is "+a[i]);
             }
		}
	}
	public static int sumI(int num){
		int sum = 0;
		while(num>0){
			int dgt = num%10;
			sum+=dgt;
			num/=10;
		}
		return sum;

	}

}