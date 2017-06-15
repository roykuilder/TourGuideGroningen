package com.example.henkvanderveen.tourguidegroningen;

public class Card {
    private int cardTitle;
    private int cardMainText;
    private int cardPhoneNumber;
    private int cardAddress;
    private int cardLink;
    private int cardPicture;

    public Card(int title, int mainText, int phoneNumber, int address, int link, int picture){
        cardTitle = title;
        cardMainText = mainText;
        cardPhoneNumber = phoneNumber;
        cardAddress = address;
        cardLink = link;
        cardPicture = picture;
    }

    public int getCardTitle() {
        return cardTitle;
    }

    public int getCardMainText() {
        return cardMainText;
    }

    public int getCardPhoneNumber() {
        return cardPhoneNumber;
    }

    public int getCardAddress() {
        return cardAddress;
    }

    public int getCardLink() {
        return cardLink;
    }

    public int getCardPicture() {
        return cardPicture;
    }

}
