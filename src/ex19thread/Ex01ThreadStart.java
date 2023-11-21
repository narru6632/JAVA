package ex19thread;

class ShowThread extends Thread
{
	String threadName;

	public ShowThread(String name)
	{
		threadName = name;
	}

	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("안녕하세요.[" + threadName + "]입니다.");
			try
			{
				sleep(10);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart
{
	public static void main(String[] args)
	{
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");

		st1.start(); //순서없이 진행
		st2.start(); //=병행실행이 가능함

//		st1.run(); //순차적으로 실행
//		st2.run(); //=병행처리하지 못함->st1.run이 전부 끝나야 st2.run실행
	}

}
