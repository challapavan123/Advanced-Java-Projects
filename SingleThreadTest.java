//To create single thread to print 1 to 5
//total 2 threads (main,one)
class MyThread extends Thread{
	String name;
	MyThread(String threadname){
		name=threadname;
		System.out.println(name + "thread created");
	}
	public void run() {
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(name+" "+i);
			Thread.sleep(1000);
		}
		}catch(Exception e) {}
	}
}
public class SingleThreadTest {

	public static void main(String[] args) throws Exception {
		System.out.println("Main thread begins");
		System.out.println("hello");
		//context switch to thread one
		MyThread m1=new MyThread("one");
		MyThread m2=new MyThread("two");
		m1.start();
		m2.start();
		Thread.sleep(5000);
		System.out.println("bye");

	}

}
