package day15_Thread;

class A02 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A02 : "+i);
		}
	}
}
class B02 extends Thread{
	public void run() {
		for(int i=0; ;i++) {
			System.out.println("음악이 흘러나옵니다~ "+i);
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);
		b.setDaemon(true);
		
		a.start();
		b.start();
		
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
	}
}