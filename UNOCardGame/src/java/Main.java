/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VANDANA KRIPA
 */
public class Main {
    
        public static void main (String args[]) {
            
        UnoPlayer a=new UnoPlayer("001","zhu");UnoPlayer b=new UnoPlayer("002","liu");UnoPlayer c=new UnoPlayer("003","li");
        UnoPlayer d=new UnoPlayer("004","han");UnoPlayer e=new UnoPlayer("005","peng");
        UnoGame game=new UnoGame("UNO-001");
        game.CreateNewGame();//create a new deck
        game.addplayer(a);game.addplayer(b);game.addplayer(c);//add players
        game.addplayer(d);game.addplayer(e);
        game.StartGame();//discard a card and send start cards for players
        game.showGameInformation();
        }
}

