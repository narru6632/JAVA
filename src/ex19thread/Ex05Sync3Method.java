package ex19thread;

class SumMulti2{
	int num;
	public SumMulti2() {
		num=0;
	}
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}
class MultiAdderThread2 extends Thread{
	SumMulti2 sumInst;
	int start, end;
	public MultiAdderThread2(SumMulti2 sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run() {
		for(int i=start; i<=end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync3Method
{
	public static void main(String[] args)
	{
		SumMulti2 s = new SumMulti2();
		MultiAdderThread2 mat1 = new MultiAdderThread2(s, 1, 5000);
		MultiAdderThread2 mat2 = new MultiAdderThread2(s, 5001, 10000);
		mat1.start();
		mat2.start();
		try {
			mat1.join();
			mat2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합:"+s.getNum());
	}
}
