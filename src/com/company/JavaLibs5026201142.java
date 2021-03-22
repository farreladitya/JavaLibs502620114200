package com.company;

import javax.swing.*;

public class JavaLibs5026201142 {

    public static void main(String[] args) {
        String name, address, place, phone, teamName, clubFav;
        int fieldRent = 1, drinkQty = 1, ballQty = 1, fieldPrice = 5, drinkPrice = 1, ballPrice = 2, totalItem;
        double fieldTime, grandTotal;
        //question
        JOptionPane.showMessageDialog(null, "Welcome to Go-Futsal! \nYour #1 Futsal Field Order in Town \nPlease fill in the following data");
        name = JOptionPane.showInputDialog("Welcome to Go-Futsal! What's your name?");
        address = JOptionPane.showInputDialog("Hi " + name + "! What is your address?");
        phone = JOptionPane.showInputDialog("What is your phone number?");
        clubFav = JOptionPane.showInputDialog("What is your favourite club?");
        teamName = JOptionPane.showInputDialog("What is your team name?");
        place = JOptionPane.showInputDialog("Which futsal field rental do you want to go?");
        fieldRent = Integer.parseInt(JOptionPane.showInputDialog("How many fields do you want to order?"));
        fieldTime = Double.parseDouble(JOptionPane.showInputDialog(null, "How long do you want to order? (hour)"));
        ballQty = Integer.parseInt(JOptionPane.showInputDialog(null, "How many ball do you want to order?"));
        drinkQty = Integer.parseInt(JOptionPane.showInputDialog(null, "How many drinks do you want to buy?"));

        //recap
        JOptionPane.showMessageDialog(null, "Let's recap your order," + name + "!");
        totalItem = fieldRent + ballQty + drinkQty;
        grandTotal = (double) (fieldPrice * fieldRent * fieldTime) + (ballPrice * ballQty) + (drinkPrice * drinkQty);
        JOptionPane.showMessageDialog(null, "Okay, let's wrap it up, " + name + "! \nYour address is at " + address + " and your phone number is " + phone + ". \nInteresting! Your favourite club is " +
                clubFav + ". They are the best club in the world. In " + place + " you will rent a futsal field with your team, " + teamName + ". \nOrder : " + fieldRent + " field, " + ballQty + " ball, " + drinkQty + " drink" + "\nTotal item : " + totalItem + "\nTotal Price : $" + grandTotal +
                "\nThank you for choosing Go-Futsal! Hope you enjoy the game. \nStay healthy :)");
    }
}