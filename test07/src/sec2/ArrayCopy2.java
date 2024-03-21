package sec2;
// 주소가 같으면 얕은 복제, 주소가 다르면 깊은 복제.
public class ArrayCopy2 {

	public static void main(String[] args) {
		int[] arr1 = {80,70,65,90,85,95,60};
		int[] arr2 = {5,3,8,7,6,4,2};
		int[] arr3;
		System.out.println(arr1);
		System.out.println(arr2);
		for(int i=0; i< arr1.length; i++){
			arr2[i] = arr1[i]; 
			// 얕은 복제
		
		}
				

	}

}
