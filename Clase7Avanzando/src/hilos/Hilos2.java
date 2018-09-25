package hilos;

public class Hilos2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j<100; j++) {
			System.out.println("j " + j);
		}
	}

}
