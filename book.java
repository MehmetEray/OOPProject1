package project;

import java.util.ArrayList;

public class book<item> extends Item{
    ArrayList booklist = new ArrayList();

    public book(int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity, String itemType) {
        super(itemID, itemName, itemPrice, itemDescription, itemQuantity, itemType);
    }
    public book (){
        init();
    }
    public void init(){
        Item book1 = new Item(10,"war",30,"aaa",20,"Books");
        Item book2 = new Item(7,"Peace book",40.0,"This book is best seller",7,"Books");
        itemList.add(book1);
        itemList.add(book2);
        booklist.add(book1);
        booklist.add(book2);
    }
    public void getbook(){
        for (int i=0;i<booklist.size();i++){
            System.out.println(booklist.get(i));
        }
    }
    public void addBookItemToList(Item item){
        itemList.add(item);
        booklist.add(item);
    }
}

