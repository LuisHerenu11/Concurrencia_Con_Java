package Concurrencia;

public class UsandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new HiloConHerencia("hilo 1");
		Thread b = new HiloConHerencia("Hilos 2");
		a.start();
		b.start();
		
		HiloConRunnable c = new HiloConRunnable("Hilo 3");
		HiloConRunnable d = new HiloConRunnable("Hilo 4");
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
		
		System.out.println("Fin del hilo principal");
	}

}

class HiloConHerencia extends Thread {
	String mensaje;
	
	public HiloConHerencia(String _mensaje) {
		mensaje = _mensaje;
	}

	public void run() {
		for (int i=0; i<10; i++)
			System.out.print(mensaje);
	}
}

