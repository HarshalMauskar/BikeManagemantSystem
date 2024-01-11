package Controller;

import Interface.App;
import Service.Editor;

import java.util.Scanner;

public class AppRunner {

    public static void main(String[] args) {

        boolean choice=true;
        App app =new Editor();
        Scanner scanner=new Scanner(System.in);
        while (choice) {
            System.out.println("======menu======\n" +
                    "1:Insert the data\n" +
                    "2:Show the data\n"+
                    "3:Edit the data\n"+
                    "4:Delete the data\n"+
                    "5:Exit the app");
            System.out.println("Select your option:");
            int value = scanner.nextInt();

            switch (value){
                case 1:
                    try {
                        app.insertDetails();
                    }catch (RuntimeException e){
                        System.out.println("Detail not Insert Properly : "+e.getMessage());
                        app.insertDetails();
                    }finally {
                        System.out.println("I am Inside Finally");
                    }
                    break;
                case 2:
                    try{
                        app.showDetails();
                    }catch (NullPointerException e){
                        System.out.println("There is NO Value to Show");
                    }
                    break;
                case 3:
                    try {
                        app.editDetails();
                    }catch (RuntimeException e){
                        System.out.println("Detail not Insert Properly : "+e.getMessage());
                        app.editDetails();
                    }//finally {
//                        System.out.println("I am Inside Finally");
//                    }
                    break;
                case 4:
                    try {
                        app.deleteDetails();
                    }catch (NullPointerException n){
                        System.out.println("Value Is Not Present To Delete");
                    }
                    break;
                case 5:
                    choice=false;
            }
        }

    }
}
