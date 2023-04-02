package practice_main;
import java.util.*;

public class BinaryS_find_no {

	static void findValue(ArrayList<Integer> arr, int n, int s) {
		int first = 0 , last= s-1, mid= (first + last)/2;
		while(first<=last) {
			if(arr.get(mid).equals(n)) {
				System.out.println("value "+n+" found at position "+ mid);
				break;
			}else if(arr.get(mid)>n) {
				last = mid - 1;
			}
			else {
				first = mid + 1;
			}
			mid = (first + last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		System.out.println("Enter array values");
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<size; i++) {
			arr.add(s.nextInt());
		}
		
		Collections.sort(arr);
		System.out.println("Enter number to find");
		int num = s.nextInt();
		findValue(arr,num,size);
	}

}
