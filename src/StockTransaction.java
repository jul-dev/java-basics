//package com.company;
//import java.util.Scanner;
//
//public class StockTransaction {
//
//    Scanner reader = new Scanner(System.in);
//
//    double purchaseStockPrice;
//    double soldStockPrice;
//    int numberOfSharesPurchased;
//    int numberOfSharesSold;
//    double amountPurchasedReceived;
//    double amountSoldReceived;
//    double purchseBrokerCommission;
//    double soldBrokerCommission;
//    double amountOfPurchCommission;
//    double amountOfSoldCommission;
//    double amountOfProfit;
//
//
//    public static void main(String[] args) {
//        getUserInput();
//        calculateProfit();
//        displayResults();
//        greetings("Congratulations! You are done!", "Julia");
//
//    }// end of maine
//
//    private static void greetings(String msg, String name){
//        System.out.println("Hi " + name + " " + msg);
//    }
//    private static void displayResults() {
//        System.out.println("Amount of money Joe paid for the stock " + amountPurchasedReceived) ;
//        System.out.println("Amount of commission Joe paid broker on purchase " + amountOfPurchCommission);
//        System.out.println("Amount that Joe sold the stock " + amountSoldReceived);
//        System.out.println("Amount of commission Joe paid his broke when he sold the stock. " + amountOfSoldCommission);
//        System.out.println("Amount of profit or loss after Joe sold the stock and paid his broker, both times. " +
//                amountOfProfit);
//    }
//
//    private static void calculateProfit() {
//        amountPurchasedReceived = purchaseStockPrice * numberOfSharesPurchased;
//        amountOfPurchCommission = amountPurchasedReceived * purchseBrokerCommission;
//
//        amountSoldReceived = soldStockPrice * numberOfSharesSold;
//        amountOfSoldCommission =amountSoldReceived * soldBrokerCommission;
//        amountOfProfit = amountSoldReceived - amountPurchasedReceived -
//                amountOfPurchCommission - amountOfSoldCommission;
//    }
//
//    private static void getUserInput() {
//        System.out.println("Please;enter stock purchase price per share");
//        purchaseStockPrice = reader.nextDouble(); //32.87;
//        System.out.println ("Please enter the number of shares purchased");
//        numberOfSharesPurchased= 1000;
//        System.out.println("Please enter the percent of broker commision on purchase");
//        purchseBrokerCommission = 0.02;
//        System.out.println("Please enter stock sell price per share");
//        soldStockPrice = 33.92;
//        System.out.println("Please enter the number of shares sold");
//        numberOfSharesSold =1000;
//        System.out.println("Please enter the percent of broker commision on stock sold");
//        soldBrokerCommission = 0.02;
//
//        reader.close();
//    }
//
//
//}//end of class
