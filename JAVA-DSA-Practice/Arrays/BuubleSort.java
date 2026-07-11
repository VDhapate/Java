import java.util.Arrays;
class BuubleSort{
	public static void main(String[] args) {
		int [] a = {4,6,2,5,7,1,3,0};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void bubbleSort(int [] a){
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a.length-1; j++){
				if(a[j]> a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
