package multithreading.oefeningen.one;

public class PingPong {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread ping = new Thread(new Ping());
		Thread pong = new Thread(new Pong());
		
		ping.start();
		pong.start();
		
		
		ping.join();
		pong.join();
		
		
		
	}

}
