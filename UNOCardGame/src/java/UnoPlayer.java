
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VANDANA KRIPA
 */
public class UnoPlayer {
    private String id;
   private String name;
   	private ArrayList<UnoCard> CardsinHand;
   public UnoPlayer(String id,String name){
        id=id;name=name;
         CardsinHand=new ArrayList<UnoCard>();
}
   	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
   	public String getID() {
		return id;
	}
	public void setID(String id) {
		id = id;
	}

        
   public void addCardtoHand(UnoCardDeck c){
       CardsinHand.add(c.TakeAcard());
   }
   public void GetCardsinHand(){
       		Iterator<UnoCard> i = CardsinHand.iterator();
		while (i.hasNext()) {
                     System.out.println(i.next());     
   }

   }
    @Override     
    public String toString () {
        return ("Player Id: "+id+", Name: "+name);
    }
    public void show(){
        System.out.println(this);
        System.out.println("Cards in hand:");
        GetCardsinHand();
        System.out.println();
    }
   public void removeCardfromHand(UnoCard card){
       CardsinHand.remove(card);
   }
}
