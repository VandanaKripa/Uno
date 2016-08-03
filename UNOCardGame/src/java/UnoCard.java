
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VANDANA KRIPA
 */
public class UnoCard {
   // public static final String[] COLOUR_NAMES= {"", "Green","Blue","Red","Yellow"};
private String cardColor;
private String type;
private int cardValue;
private String img;

    public UnoCard(String cardColor, String type, int cardValue, String img) {
        this.cardColor = cardColor;
        this.type = type;
        this.cardValue = cardValue;
        this.img = img;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "UnoCard{" + "cardColor=" + cardColor + ", type=" + type + ", cardValue=" + cardValue + ", img=" + img + '}';
    }

   
}
