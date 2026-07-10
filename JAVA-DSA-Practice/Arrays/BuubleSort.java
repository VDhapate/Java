import java.util.Arrays;
class BuubleSort{
	public static void main(String[] args) {
		int [] a = {4,6,2,5,7,1,3,0};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int [] a){
		for(int i =0; i<a.length-1; i++)
		{
			for(int j =i+1; j<a.length; j++){
				if(a[i]> a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}