
public class Test {

	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 3, 4};
		int[] a2 = {5, 6, 7, 8};
		
		System.out.println("Array 'a1': ");
		for(int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " | ");
		}
		
		System.out.println("\nArray 'a2': ");
		for(int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " | ");
		}
		
		int[] mix = DoppioArray.mix(a1, a2);
		
		System.out.println("\nMix degli Array 'a1' e 'a2' alternato: ");
		for(int i = 0; i < mix.length; i++) {
			System.out.print(mix[i] + " | ");
		}
	}
}