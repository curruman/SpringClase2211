package vistas;

import java.util.ArrayList;
import java.util.Collection;

import hilos.HiloInterrumpible;
import hilos.HiloVolatile;
import hilos.Hilos;
import hilos.Hilos2;
import hilos.HilosRunnable;

public class MainHilos {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		pausarHilo();
		
		ejemploHilo();
		
		
		apagarHilo();
		
		interrumpir();
	}
	
	private static void apagarHilo() throws Exception {
	    HiloVolatile r1 = new HiloVolatile();
	    Thread t1 = new Thread(r1);
	    t1.start();
	    // ...
	    t1.sleep(3000);
	    r1.timeToQuit = true;
	      

	}
	
	private static void interrumpir() {
	    HiloInterrumpible h3 = new HiloInterrumpible();
		Thread t1 = new Thread(h3);
	    t1.start();
	    // ...
	    t1.interrupt();

	}
	public static void pausarHilo() {
		Hilos h1 = new Hilos();
		h1.start();
		Hilos runnable = new Hilos();
		Thread h4 = new Thread(runnable);
		Thread h5 = new Thread(runnable);
		Collection<Thread> hilo = new ArrayList<>();
	//	Hilos2 h2 = new Hilos2();
	//	h2.run();
		
		h1.setName("Primero");
		h4.setName("Segundoo");
		h5.setName("Tercero");
		
		hilo.add(h1);
		hilo.add(h4);
		hilo.add(h5);
		
		for (Thread t : hilo) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Terrmino " + t.getName());
		}
	}
	
	public static void ejemploHilo() {
		HilosRunnable hr = new HilosRunnable();
		Thread t1 = new Thread(hr);
		Thread t2 = new Thread(hr);
		
		t1.start();
		t2.start();
	}

}
