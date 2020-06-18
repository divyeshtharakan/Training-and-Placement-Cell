import java.lang.Thread;
class dispthread extends Thread
{
	String msg;
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(msg);
		}
	}
	dispthread(String m)
	{
		m=msg;
	}
}
class ThreadTest
{
	public static void main(String args[])
	{
		dispthread dt1=new dispthread("Hello");
		dispthread dt2=new dispthread("World");
		Thread t1=new Thread(dt1);
		Thread t2=new Thread(dt2);
		t1.start();
		t2.start();
		dt1.start();
		dt2.start();
	}
	
}