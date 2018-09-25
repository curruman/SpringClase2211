package hilos;

public class HiloInterrumpible implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.println("Thread started");
        while(!Thread.interrupted()) {
            System.out.println("Hilo iniciado");
        }
        System.out.println("Thread finishing");

	}
	

}
