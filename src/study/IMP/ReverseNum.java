package study.IMP;

public class ReverseNum {
	public static void main(String[] args) {
		int n=123,rem,rev=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
         System.out.println("reverse of digit: "+rev);
	}
}
