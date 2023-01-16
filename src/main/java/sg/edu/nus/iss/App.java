package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */



    public static void main(String[] args) {
        System.out.println("Hello World!");

        String dirPath="//data2";
        String fileName="";

        File newDirectory =new File(dirPath);

        if(newDirectory.exists()){
            System.out.println("Directory already exist");
        }else {
            newDirectory.mkdirs();
        }

        System.out.println("Welcome to my shopping cart");
        List<String>cartItems= new ArrayList<String>();

        Console con=System.console();
        String input= "";

        while(!input.equals("quit")){
            input=con.readLine("Waht do you want to perform? (Type 'quit'to quit program)");
            switch(input){
                case "help":
                    dispalyMessage("'List' to list items inside your shopping cart");
                    dispalyMessage("login <name> to access your shopping cart");
                    dispalyMessage("add <items> to add items into your shopping cart");
                    dispalyMessage("delete <item> to delete items in your cart");
                    dispalyMessage("quit to exit this program");
                    break;
                case "list":
                    if(cartItems.size()>0){
                        for(String item: cartItems){
                            System.out.printf("%s ",item);
                        }
                    }else {
                        dispalyMessage("Your cart is empty");
                    }
                    break;
                case "add":

                    break;
                case "delete":

                    break;
                default:


            
            }

            if(input.startsWith("add")){
                input=input.replace(","," ");

                String strValue;
                Scanner scanner=new Scanner(input.substring(4));

                while(scanner.hasNext()){
                    strValue=scanner.next();
                    cartItems.add(strValue);
                }

            }

        }

    }

    public static void dispalyMessage(String message){
        System.out.println(message);
    }


}
