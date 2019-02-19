package project;

import java.io.*;
import java.util.Scanner;

public class Menu {

        static File file = new File("login2.txt");
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
            regOrLog();
        }
        public static void regOrLog() {
            System.out.println("Have you ever register before? y or n?");
            String option = input.next();
            if (option.equals("y")){
                loginCheck();
            }
            else if (option.equals("n")){
                register();
            }
        }
        public static void register(){
            // register
            System.out.println("Please enter your username");
            String username = input.next();
            System.out.println("Please enter your password");
            String password = input.next();
            System.out.println("Please enter your type ");
            String type = input.next();
            System.out.println(username + " " + password + " " + type);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                bw.write(username + ":" + password + ":" + type + "!");
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            regOrLog();
        }
        public static void loginCheck(){
            boolean check = false;
            try {
                System.out.println("Please enter your username");
                String username = input.next();
                System.out.println("Please enter your password");
                String password = input.next();
                BufferedReader br = new BufferedReader(new FileReader(file));
                String[] userArray = br.readLine().split("!");
                String[] personalArray;
                for(int i = 0;i<userArray.length;i++){
                    personalArray = userArray[i].split(":");
                    if (personalArray[0].equals(username) && personalArray[1].equals(password)){
                        if (personalArray[2].equals("admin")){
                            check = true;
                            Page.generalMenu("admin", username);
                        }
                        else {
                            check = true;
                            Page.generalMenu("user", username);
                        }
                    }
                }
                if (!check){
                    System.out.println("wrong login");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


