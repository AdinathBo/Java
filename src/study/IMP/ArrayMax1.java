package study.IMP;

public class ArrayMax1 {

	public static void main(String[] args) {
		
		int a[] = {1,423,6,46,34,23,13,53,4};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
