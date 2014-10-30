package Gol;

public abstract class Plata implements Gestiune_KFC {
	abstract void makePayment();

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Acesta este un program de gestiune KFC si ne aflam in clasa Plata");
	}
	public void Status(){
		System.out.println("OK!");
		
	}

}
