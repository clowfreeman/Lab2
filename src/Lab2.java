

import KFC.Burger;
import KFC.CardCredit;
import KFC.Crispy;
import KFC.DoubleCrispy;
import KFC.PayPal;
import KFC.Plata;
import exceptions.ExceptiileMele;
import interfaces.Gestiune_KFC;

/**
 * @author ClPardos
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	ExceptiileMele newExc=new ExceptiileMele("Aceasta este o exceptie random");

    public Lab2() throws ExceptiileMele
    {
        System.out.println("Hello new exception");
        throw newExc;       
}
	/**
	 * @param args
	 * @throws ExceptiileMele
	 */
	public static void main(String[] args) throws ExceptiileMele {
		// TODO Auto-generated method stub
		/*MMMAMDAS*/
		/*sadasd a*/
		/*asdsa*/
		Gestiune_KFC g1=new PayPal();
		g1.info();
		Gestiune_KFC g2=new PayPal();
		g2.status();
		Gestiune_KFC g3=new Crispy();
		g3.info();
		Plata p1=new PayPal();
		p1.makePayment();
		Plata p2=new CardCredit();
		p2.makePayment();
		Burger b1=new Crispy();
		b1.impachetare();
		b1.Pret();
		Burger b2=new DoubleCrispy();
		b2.impachetare();
		b2.Pret();
		
		
	}

}
