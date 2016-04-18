package Array;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		for(int i=0;i<3;i++){
		names.remove(i);
		}
		System.out.println(names.size());
		}

}

//remove 到最後發現找不到2這個index來remove
