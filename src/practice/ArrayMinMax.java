package practice;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int a[] = {1,423,6,46,34,23,13,53,4};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("max no. is: "+max+ "min no. is: "+min);
	}
}
