package KFC;

import interfaces.Gestiune_KFC;

/**
 * @author ClPardos
 *
 */
public abstract class Burger implements Gestiune_KFC {
	/**
	 * 
	 */
	public void impachetare ()
	{
		System.out.println("Impachetarea!!!");
	}
	public abstract void Pret(); 

}
