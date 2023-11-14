package ex06array;

public class QuNumberCounter {
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			for(int f=0; f<counter.length; f++) {
				if(answer[i] == f+1) {
					counter[f] ++;
				}
			}
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.printf("counter [%d] => %d\n",i,counter[i]);
		}
	
}
}
