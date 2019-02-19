package project;

import java.util.ArrayList;

public class electronics<item4> extends Item {
    ArrayList electroList = new ArrayList();
    public electronics(int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity, String itemType) {
        super(itemID, itemName, itemPrice, itemDescription, itemQuantity, itemType);
    }
    public electronics (){
        init();
    }
    public void init(){
    Item electro1 = new Item(4,"Mouse",45,"This mouse has very useful features",50,"Electronics");
    Item electro2 = new Item(5,"Keyboard",100,"This keyboard has very useful features",2000,"Electronics");
    Item electro3 = new Item(2,"computer",300.0,"The fastest computer in the world",6,"Electronics");

        itemList.add(electro1);
        itemList.add(electro2);
        itemList.add(electro3);
        electroList.add(electro1);
        electroList.add(electro2);
        electroList.add(electro3);
    }
    public void getElectro(){
        for (int i=0;i<electroList.size();i++){
            System.out.println(electroList.get(i));
        }
    }
    public void addElectroItemToList(Item item){
        itemList.add(item);
        electroList.add(item);
    }

}
