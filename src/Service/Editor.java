package Service;

import Interface.App;
import Model.Details;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Editor implements App {
   private Scanner scanner = new Scanner(System.in);
    int v;
    Details user[];

    Details details;

    @Override
    public void insertDetails() throws RuntimeException{
        Boolean flag=true;
        System.out.println("How much Bikes details you want to add");
        v = scanner.nextInt();
        user=new Details[v];
        for (int i = 0; i < user.length; i++) {
            details= new Details();
            System.out.println("Enter the Brand name");
            String brandName= scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}",brandName)) {
                details.setBrandName(brandName);
            }else {
                throw new RuntimeException("brand name type char is not Same");
//                System.out.println("brand name type char is not Same");
//                flag=false;
//                break;
            }
            System.out.println("Enter the Bike Name");
            String bikeName=this.scanner.next();
            if (Pattern.matches("[A-Z]{1,}[1-9]",bikeName)) {
                details.setBikeName(bikeName);
            }else {
                System.out.println("Bike name type char is not Same");
                flag=false;
                break;
            }
            System.out.println("Enter the Model Name");
            String modelName=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}[1-9]",modelName)) {
                details.setModelName(modelName);
            }else {
                System.out.println("Model name type char is not Same");
                flag=false;
                break;
            }
            System.out.println("Enter the fuel type");
            String fuelType=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}",fuelType)) {
                details.setFuelType(fuelType);
            }else {
                System.out.println("Model name type char is not Same");
                flag = false;
                break;
            }

            System.out.println("Enter the Colour type");
            String colour=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}",colour)) {
                details.setColour(colour);
            }else {
                System.out.println("Model name type char is not Same");
                flag = false;
                break;
            }

            System.out.println("Enter the Mobile Number");
            String mobileNumber=this.scanner.next();
            if (Pattern.matches("[0-9]{1,}",mobileNumber)) {
                details.setMobileNumber(mobileNumber);
            }else {
                System.out.println("Mobile Number type char is not Same");
                flag = false;
                break;
            }

        user[i]=details;
        }
        if (flag == false) {
         return;
        }
        System.out.println("Bikes details added");
    }

    @Override
    public void showDetails(){
        for (int i = 0; i < user.length ; i++) {
            System.out.println(user[i].toString());
        }
    }

    @Override
    public void editDetails(){
        Boolean flag=true;
        System.out.println("which Bikes details you want to edit");
        int a= scanner.nextInt();
        int c=a-1;
        for (int i =c; i <a; i++) {
            details=user[c];
            System.out.println("Enter the Brand name");
            String brandName= scanner.next();
            if (Pattern.matches("[a-zA-Z]",brandName)) {
                details.setBrandName(brandName);
            }else {
                throw new RuntimeException("brand name type char is not Same");
//                System.out.println("brand name type char is not Same");
//                flag=false;
//                break;
            }
            System.out.println("Enter the Bike Name");
            String bikeName=this.scanner.next();
            if (Pattern.matches("[a-zA-Z0-9]",bikeName)) {
                details.setBikeName(bikeName);
            }else {
                System.out.println("Bike name type char is not Same");
                flag=false;
                break;
            }
            System.out.println("Enter the Model Name");
            String modelName=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}[1-9]",modelName)) {
                details.setModelName(modelName);
            }else {
                System.out.println("Model name type char is not Same");
                flag=false;
                break;
            }
            System.out.println("Enter the fuel type");
            String fuelType=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}",fuelType)) {
                details.setFuelType(fuelType);
            }else {
                System.out.println("Model name type char is not Same");
                flag = false;
                break;
            }

            System.out.println("Enter the Colour type");
            String colour=this.scanner.next();
            if (Pattern.matches("[A-Z]{1}[a-z]{1,}",colour)) {
                details.setColour(colour);
            }else {
                System.out.println("Model name type char is not Same");
                flag = false;
                break;
            }

            System.out.println("Enter the Mobile Number");
            String mobileNumber=this.scanner.next();
            if (Pattern.matches("[0-9]",mobileNumber)) {
                details.setMobileNumber(mobileNumber);
            }else {
                System.out.println("Mobile Number type char is not Same");
                flag = false;
                break;
            }
        }
        if (flag == false) {
            return;
        }
        System.out.println("Bikes details edited");
    }

    @Override
    public void deleteDetails(){
        System.out.println("which Bikes details you want to Delete");
        int a= scanner.nextInt();
        int c=a-1;
        for (int i =c; i <a; i++) {
            details=user[c];
            details.setBrandName(null);
            details.setBikeName(null);
            details.setModelName(null);
            details.setFuelType(null);
            details.setColour(null);
            details.setMobileNumber(null);
        }
        System.out.println("Bikes details Deleted");
    }
}
