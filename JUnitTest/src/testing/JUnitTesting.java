package testing;

public class JUnitTesting {
	public int square(int x) {
		return x*x;
	}
	public int sum(int x) {
		int s=0;
		for(int i=1 ; i<=x ; i++) {
			s+=i;
		}
		return s;
	}
}
