package sec6;

import java.io.IOException;

public class SortExam {
	public static void main(String[] args) throws IOException {
		System.out.println("정령 방식 선택 :");
		System.out.println("B : bubblesort");
		System.out.println("S : heapsort");
		System.out.println("Q : quicksort");
		
		int ch = System.in.read();
		Sort sort = null;
		
	if(ch == 'B' || ch =='b') {
		sort = (Sort) new BubbleSort();
	}
	if(ch == 'H' || ch =='h') {
		sort = (Sort) new HeapSort();
	}
	if(ch == 'Q' || ch =='q') {
		sort = (Sort) new QuickSort();
	}
	else {
		System.out.println(" 지원 안됨 ");
		return;
	}
	int[]arr = new int[10];
	sort.ascending(arr);
	sort.descending(arr);
	sort.description();
	}
	


	
}

