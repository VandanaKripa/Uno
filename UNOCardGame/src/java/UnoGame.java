
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
public class UnoGame {
   // private String id;
   // private ArrayList<UnoPlayer> unp;
    private String gameId;
	   private ArrayList<UnoPlayer> playerList;
	   private String status;
	   private UnoCardDeck deck;
	   private String discardFile;
	   private ArrayList<UnoCard> discardPile;
           public UnoGame(String gameId) {
		super();
		this.gameId = gameId;
		deck=new UnoCardDeck(); 
                playerList=new ArrayList<UnoPlayer>();
                discardPile=new ArrayList<UnoCard>();
	}
	
	public String getGameID() {
		return gameId;
	}
	public void setGameID(String gameId) {
		this.gameId = gameId;
	}
        public UnoCardDeck getdeck(){
            return deck;
        }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDiscardFile() {
		return discardFile;
	}
	public void setDiscardFile(String discardFile) {
		this.discardFile = discardFile;
	}
	 

       public void addplayer(UnoPlayer player){
           playerList.add(player);
       }
	
      public void CreateNewGame(){
          	getdeck().CreateNewDeck();
      }
     public void StartGame(){
         discardCard(getdeck().TakeAcard());
         for(int j=0;j<7;j++){
		for(int i=0;i<playerList.size();i++){
              playerList.get(i).addCardtoHand(deck);
		} 
     }
     }
     
     public UnoCard discardCard(UnoCard c){
         UnoCard card=c;
         discardPile.add(card);
         return card;
     }
     public void showDiscardPile(){
         System.out.println("Discard :");
         Iterator<UnoCard> c = discardPile.iterator();
         while(c.hasNext()){
              System.out.println(c.next());
         }
     }
     public void showPlayerList(){
         Iterator<UnoPlayer> p = playerList.iterator();
                  while (p.hasNext()) {                 
                  p.next().show();
                   }
     }
     public void showGameInformation(){
         System.out.println("Game ID: "+gameId);
         showDiscardPile();
         System.out.println("Cards on deck "+deck.getNumber());
         System.out.println();
         showPlayerList();
     }
     
       public void TakeCardFromDeck(UnoCardDeck deck){
           UnoCard x=new UnoCard("a","b",1,"c");
     
       }
}
