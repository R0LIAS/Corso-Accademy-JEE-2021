
public class DoppioArray {

	public static int[] mix(int[] a1, int[] a2) {
		
		if(a1.length == a2.length) {
			int[] arrayMix = new int[a1.length + a2.length];
			int temp = 0;
				for(int i = 0; i < a1.length; i++) {
					arrayMix[temp] = a1[i];
					arrayMix[temp + 1] = a2[i];
					temp +=2;
				}
				return arrayMix;
			}
		return null;
	}
}