package project;

import java.io.*;
import java.util.ArrayList;

public class Item {
        File fileSec = new File("byteOfProduct.dat");
        private int itemID;
        private String itemName;
        private double itemPrice;
        private String itemDescription;
        private int itemQuantity;
        private String itemType;
        public static ArrayList<Item> itemList = new ArrayList<>();
        public Item (int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity,String itemType){
            this.itemID = itemID;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemDescription = itemDescription;
            this.itemQuantity = itemQuantity;
            this.itemType = itemType;
        }
        public Item() { }
        // METHODS
        public void getItemDescription(int id){
            for (int i = 0; i<itemList.size();i++){
                if (itemList.get(i).getID() == id){
                    System.out.println(itemList.get(i).getDescription());
                }
            }
        }
        public void removeItem(String itemName){
            for (int i=0;i<itemList.size();i++){
                if (itemList.get(i).getName().equals(itemName)){
                    itemList.remove(i);
                }
            }
        }
        public void ListProductOfType(){
            for (int i=0;i<itemList.size();i++){
                System.out.println(itemList.get(i).itemType);
            }
        }
        public void addItemToList(Item item){
            itemList.add(item);
        }
        public void getItemType(String itemType){
            for (int i=0;i<itemList.size();i++){
                if (itemList.get(i).getItemType().equals(itemType)){
                    System.out.println("Item Name : " + itemList.get(i).itemName + " Item ID : " + itemList.get(i).getID());
                }
            }
        }
        public void getItemList() {
            for (int i = 0; i<itemList.size();i++){
                System.out.println(itemList.get(i).getName());
            }
        }
        // GETTERS
        public int getID(){
            return itemID;
        }
        public String getName(){
            return itemName;
        }
        public double getPrice(){
            return itemPrice;
        }
        public String getDescription(){
            return itemDescription;
        }
        public int getQuantity(){
            return itemQuantity;
        }
        public String getItemType() {
            return itemType;
        }
}



