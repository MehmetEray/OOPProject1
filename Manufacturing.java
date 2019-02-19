package project;

import java.util.ArrayList;

public class Manufacturing extends Item{
    ArrayList manulist = new ArrayList();
    Item item = new Item();
    public Manufacturing(int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity, String itemType) {
        super(itemID, itemName, itemPrice, itemDescription, itemQuantity, itemType);
    }
    public Manufacturing (){
        init();
    }

    public void init(){
        Item manu1 = new Item(1,"table",200.0,"The most useful table in the world",5,"Manufacturing");
        Item manu2 = new Item(6,"Television",10000,"This television has very useful features",200,"Manufacturing");
        itemList.add(manu1);
        itemList.add(manu2);
        manulist.add(manu1);
        manulist.add(manu2);
    }
    public void getManu(){
        for (int i=0;i<manulist.size();i++){
            System.out.println(manulist.get(i));
        }
    }
    public void addManuItemToList(Item item){
        itemList.add(item);
        manulist.add(item);
    }
}
