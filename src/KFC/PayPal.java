/**
 * 
 */
package KFC;

/**
 * @author ClPardos
 *
 */
public class PayPal extends Plata{

	public void makePayment()
	{
		System.out.println("Platit cu PayPal");
	}

	/* (non-Javadoc)
	 * @see IP_Lab2.Gestiune_KFC#status()
	 */
	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("OK PayPal!");
		
	}
}

