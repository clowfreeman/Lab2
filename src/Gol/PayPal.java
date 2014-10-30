/**
 * 
 */
package Gol;

/**
 * @author ClPardos
 *
 */
public class PayPal extends Plata{

	public void makePayment()
	{
		System.out.println("Platit cu PayPal");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("OK PayPal!");
		
	}
}

