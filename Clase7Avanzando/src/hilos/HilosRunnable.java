package hilos;

public class HilosRunnable implements Runnable {
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (i = 0; i<100; i++) {
			System.out.println("ir " + i);
		}
	}

}
