
public class BruUp2 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 9, 122};
		
		for (int i = 0; i<arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				
				System.out.println(arr1[i]);
			}
			else {
				System.out.println(arr1[i] + "is not a multiple of 2");
			}
			
		}
		System.out.println("We are doing full training");
		String[] arr2 = {"Waaseu", "Sameer", "Medhat"};
		System.out.println(arr2[1]);
		for (String s:arr2) {
			System.out.println(s);
		}
	}

}
