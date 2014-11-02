package KFC;

import interfaces.Gestiune_KFC;

/**
 * @author ClPardos
 *
 */
public abstract class Plata implements Gestiune_KFC {
	public abstract void makePayment();

	/* (non-Javadoc)
	 * @see IP_Lab2.Gestiune_KFC#info()
	 */
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Acesta este un program de gestiune KFC si ne aflam in clasa Plata");
	}
	/**
	 * 
	 */
	public void Status(){
		System.out.println("OK!");
		
	}

}
