/*
 Jalani
991640256
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    //adding comments
    public static void main(String[] args)
    {
        CardDealer crd = new CardDealer();
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
     System.out.println(nineClubs);
        
    }
}
