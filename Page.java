package project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Page extends Item{
        static book book = new book();
        static electronics electro = new electronics();
        static Manufacturing manu = new Manufacturing();
        static ArrayList<Item> Cart  = new ArrayList<>();
        public static Item item = new Item();
        static int id;
        static Scanner scan = new Scanner(System.in);

    public Page(int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity, String itemType) {
        super(itemID, itemName, itemPrice, itemDescription, itemQuantity, itemType);
    }
    public static void generalMenu(String type, String username){
            Scanner input = new Scanner(System.in);
            if (type.equals("admin")){
                // admin menu will come here
                System.out.println("*********ADMIN MENU*********");
                System.out.println(" 0 - LOG OUT");
                System.out.println(" 1 - Enter a product ");
                System.out.println(" 2 - Delete a product ");
                System.out.println(" 3 - List products and get description");
                System.out.println(" 4 - List registered users");
                System.out.println(" 99 -> EXIT");
                int selection = input.nextInt();
                switch (selection) {
                    case 0:
                        Menu.regOrLog();
                        break;
                    case 1:
                        printlistTypes();
                        int option = scan.nextInt();
                        switch (option){
                            case 1:
                                System.out.println("Please enter type");
                                String typeB  = input.next();
                                System.out.println("Please enter name of item");
                                String nameB = input.next();
                                System.out.println("Please enter price of item with double type");
                                double pricB = input.nextDouble();
                                System.out.println("Please enter items quantity");
                                int quantityB  = input.nextInt();
                                System.out.println("Please enter description of item");
                                String descB = input.next();
                                checkID();
                                Item tempNewItem = new Item(id,nameB,pricB,descB,quantityB,typeB);
                                System.out.println("item added to list successfully");
                                book.addBookItemToList(tempNewItem);
                                generalMenu("admin",username);
                            case 2:
                                System.out.println("Please enter type");
                                String typeE  = input.next();
                                System.out.println("Please enter name of item");
                                String nameE = input.next();
                                System.out.println("Please enter price of item with double type");
                                double priceE = input.nextDouble();
                                System.out.println("Please enter items quantity");
                                int quantityE  = input.nextInt();
                                System.out.println("Please enter description of item");
                                String descE = input.next();
                                checkID();
                                Item tempNewItem2 = new Item(id,nameE,priceE,descE,quantityE,typeE);
                                System.out.println("item added to list successfully");
                                electro.addElectroItemToList(tempNewItem2);
                                generalMenu("admin",username);
                            case 3:
                                System.out.println("Please enter type");
                                String typeM  = input.next();
                                System.out.println("Please enter name of item");
                                String nameM = input.next();
                                System.out.println("Please enter price of item with double type");
                                double priceM = input.nextDouble();
                                System.out.println("Please enter items quantity");
                                int quantityM  = input.nextInt();
                                System.out.println("Please enter description of item");
                                String descM = input.next();
                                checkID();
                                Item tempNewItem3 = new Item(id,nameM,priceM,descM,quantityM,typeM);
                                System.out.println("item added to list successfully");
                                manu.addManuItemToList(tempNewItem3);
                                default:
                                    System.out.println("Wrong");
                                    generalMenu("admin",username);
                        }
                        System.out.println("Please enter type");
                        String type2  = input.next();
                        System.out.println("Please enter name of item");
                        String name2 = input.next();
                        System.out.println("Please enter price of item with double type");
                        double price = input.nextDouble();
                        System.out.println("Please enter items quantity");
                        int quantity  = input.nextInt();
                        System.out.println("Please enter description of item");
                        String desc = input.next();
                        checkID();
                        Item tempNewItem = new Item(id,name2,price,desc,quantity,type2);
                        item.addItemToList(tempNewItem);
                        System.out.println("item added to list successfully");
                        Page.generalMenu("admin",username);
                    case 2:
                        for (Item i:itemList){
                            System.out.println("Item name : " + i.getName() );
                        }
                        System.out.println("which item do you want to remove");
                        String removeItem = input.next();
                        item.removeItem(removeItem);
                        System.out.println(removeItem + " is deleted");
                        Page.generalMenu("admin",username);
                    case 3:
                        printIDs();
                        System.out.println("Enter ID please");
                        int selectionId = input.nextInt();
                        item.getItemDescription(selectionId);
                        Page.generalMenu("admin",username);
                    case 4:

                        try {
                            BufferedReader bread = new BufferedReader(new FileReader("login2.txt"));
                            String[] userArray2 = bread.readLine().split("!");
                            for (int i=0;i<userArray2.length;i++){
                                System.out.println(userArray2[i]);
                            }

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Page.generalMenu("admin",username);
                    case 99:
                        System.exit(99);
                        break;
                    default:
                        break;
                }
            }
            else if (type.equals("user")){
                System.out.println("*********USER MENU*********");
                System.out.println(" 0 - LOG OUT");
                System.out.println(" 1 - List all products");
                System.out.println(" 2 - List products of type");
                System.out.println(" 3 - Get description for a product");
                System.out.println(" 4 - Add item to cart");
                System.out.println(" 5 - Cancel an item from cart");
                System.out.println(" 6 - Show my history");
                System.out.println(" 7 - List Items with type");
                System.out.println(" 8 - Buy itemes");
                System.out.println(" 99 -> EXIT");
                int selection = input.nextInt();
                switch (selection){
                    case 0:
                        Menu.regOrLog();
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 1:
                        item.getItemList();
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 2:
                        item.ListProductOfType();
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 3:
                        printIDs();
                        System.out.println("Enter product's ID please");
                        int selectionId = input.nextInt();
                        item.getItemDescription(selectionId);
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 4:
                        item.getItemList();
                        System.out.println("Enter item name please");
                        String optionName = input.next();
                        for (Item i:itemList){
                            if (i.getName().equals(optionName)){
                                Cart.add(i);
                            }
                        }
                        if (Cart.size() == 0) {
                            System.out.println("There is no item in cart");
                            generalMenu("user", username);
                        }
                        for (Item i:Cart){
                            System.out.println(i.getName() + " is added to your cart");
                        }
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 5:
                        if (Cart.size() == 0){
                            System.out.println("There is no item in cart");
                            generalMenu("user",username);
                        }else{
                            printCart();
                            System.out.println("Enter product's name please");
                            String selectionName = input.next();
                            for (int i=0;i<Cart.size();i++){
                                if (Cart.get(i).getName().equals(selectionName)){
                                    Cart.remove(i);
                                }
                            }
                            for (Item i:Cart){
                                System.out.println(i.getName());
                            }
                            System.out.println(selectionName + " is canceled ");
                            System.out.println("-------------");
                        }
                        generalMenu("user",username);
                    case 6:
                        System.out.println("Sürmeli Inc., the American auction company, is the largest auction site shopping \n" +
                                "website on the Internet. Sürmeli was founded on September 3, 1995 by Turkish entrepreneur \n" +
                                "Mehmet Eray Sürmeli \n " +
                                "in San José, California.");
                        System.out.println("-------------");
                        generalMenu("user",username);
                    case 7:
                        printlistTypes();
                        int option = scan.nextInt();
                        switch (option){
                            case 1:
                                book.getbook();
                            case 2:
                                electro.getElectro();
                            case 3:
                                manu.getManu();
                                default:
                                    System.out.println("Wrong");
                                    generalMenu("user",username);
                        }
                        generalMenu("user",username);
                    case 8:
                        for (Item i:Cart){
                            try {
                                BufferedWriter bwCart = new BufferedWriter(new FileWriter("cart.txt",true));
                                bwCart.write("Name : " + i.getName() + " ID : " + i.getID() + " Type : " + i.getItemType()
                                        + " Description : " + i.getDescription() +" Price : "+ i.getPrice() +
                                        " Quantity :" + i.getQuantity() + "*");
                                bwCart.newLine();
                                bwCart.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("You bought");
                        generalMenu("user",username);
                    case 99:
                        System.exit(99);
                        break;
                    default:
                        break;
                }
            }
            else{
                System.out.println("WRONG WAY");
            }
        }
        public static void printIDs(){
            for (Item i:itemList){
                System.out.println("Item ID : " + i.getID() + "  / " + " Item name : " + i.getName() );
            }
        }
        public static int checkID(){
            System.out.println("Please enter ID");
            int id  = scan.nextInt();
            for (Item temp : itemList) {
                if (temp.getID() == id) {
                    printIDs();
                    System.out.println("This id is already defined.Those are existed IDs.Please enter ID except for those IDs");
                    checkID();
                }
            }
            return id;
        }
        public static void printlistTypes(){
            System.out.println("***************");
            System.out.println(" 1 - Books ");
            System.out.println(" 2 - Electronics ");
            System.out.println(" 3 - Manufacturing ");
            System.out.println("Enter number");
        }
        public static void printCart(){
        for (int i=0;i<Cart.size();i++){
            System.out.println(Cart.get(i).getName()+ " product is in your cart now");
        }
        }
    }

