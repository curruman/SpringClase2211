package hilos;

public class HiloVolatile implements Runnable {
	public volatile boolean timeToQuit = false;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started");
        	while(!timeToQuit) {
        		System.out.println("Esperando terminar");
        	}
        	System.out.println("Thread finishing");
		
	}
	

}
