
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
public class UnoCardDeck {
     private int cardnum;
    private ArrayList<UnoCard> deck;
public UnoCardDeck(){
    deck=new ArrayList<UnoCard>();
 
}
public ArrayList<UnoCard> getList(){
    return deck;
}
	public int getNumber() {
	cardnum=deck.size();
            return cardnum;
	}
	public void setValue(int num) {
		cardnum = num;
	}
public void AddCard(UnoCard card){
    deck.add(card);
}    
public void CreateNewDeck(){
    String x="";String y="";int z=0;
        String color[]={"Red","Yellow","Blue","Green","Black"};
        String type[]={"Normal","Reverse","Skip","Draw(+2)","Wild","Wild Draw(+4)"};
        int value[]={0,1,2,3,4,5,6,7,8,9,20,50};
       //       Deck c=new Deck();
//Add 1-9 Normal Cards
        for(int j=0;j<4;j++){  
            x=color[j];
        for(int i=1;i<10;i++){
           y=type[0];
           z=value[i];
          UnoCard cc=new UnoCard(x,y,z,x+y+z);
          UnoCard dd=new UnoCard(x,y,z,x+y+z);
          AddCard(cc);
          AddCard(dd);
          }
           }
//Add 4 "0" Cards
for(int i=0;i<4;i++){
    x=color[i];y=type[0];z=value[0];
    UnoCard cc=new UnoCard(x,y,z,x+y+z);
    AddCard(cc);
}
//Add Functional Card
for(int i=0;i<4;i++){
    x=color[i];
    for(int j=1;j<4;j++){
        y=type[j];
        z=value[10];
        UnoCard cc=new UnoCard(x,y,z,x+y+z);
        UnoCard dd=new UnoCard(x,y,z,x+y+z);
        AddCard(cc);
        AddCard(dd);
    }
}
//Add Wild Card
for(int i=4;i<6;i++){
    x=color[4];
    y=type[i];
    z=value[11];
    UnoCard a=new UnoCard(x,y,z,x+y+z);
    UnoCard b=new UnoCard(x,y,z,x+y+z);
    UnoCard cc=new UnoCard(x,y,z,x+y+z);
    UnoCard d=new UnoCard(x,y,z,x+y+z);
    AddCard(a);AddCard(b);AddCard(cc);AddCard(d);
}
}

public UnoCard TakeAcard(){
    int x=(int)(Math.random()*(deck.size()-1));
  UnoCard card= deck.get(x);
  deck.remove(x);
  return card;
}
	public void getcard() {
		Iterator<UnoCard> i = deck.iterator();
		while (i.hasNext()) {
                        System.out.println(i.next());                               
		}		
	}
}



