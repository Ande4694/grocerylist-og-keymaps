import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    ArrayList<GroceryItemOrder> items = new ArrayList<>();
    GroceryItemOrder[] grocList = new GroceryItemOrder[10];


    // add items til grocList, med ++quantity

    public int antiJarl(){
        Scanner sc = new Scanner (System.in);
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("please select an int");
        }
        return sc.nextInt();
    }



    public void addItem(){
        boolean run = true;
        int option;
        int count = 0;

            System.out.println("which item do you want to add to your grocery list?");
            for (int i = 0; i<items.size();i++){
                System.out.println(i+1+": "+items.get(i));
            }
            while(run){
                option = antiJarl();

                switch (option){

                    case 1:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(0).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(0);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(0).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(1+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 2:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(1).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(1);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(1).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(2+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 3:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(2).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(2);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(2).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(3+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 4:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(3).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(3);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(3).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(4+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 5:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(4).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(4);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(4).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(5+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;


                    case 6:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(5).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(5);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(5).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(6+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 7:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(6).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(6);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(6).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(7+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 8:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(7).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(7);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(7).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(8+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 9:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(8).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(8);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(8).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(9+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    case 10:
                        for(int i = 0; i<grocList.length;i++){
                            if(grocList[i]==null){
                                System.out.println("How many/much "+items.get(9).getName()+" do you want to add?");
                                int tempInt = antiJarl();
                                grocList[i]=items.get(9);
                                grocList[i].setQuantity(tempInt);
                                System.out.println(tempInt+"x "+items.get(9).getName()+" added to grocery list.");
                                count ++;
                                System.out.println(count+"/10 of the grocery list is used.");
                                if(count>=10){
                                    System.out.println("Grocery list is now full, exiting grocery list");
                                    run = false;
                                } else {
                                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                                    for (int j = 0; j<items.size();j++){
                                        System.out.println(10+": "+items.get(j));
                                    }
                                    break;
                                }
                            }
                        }
                        break;

                    default:
                        System.out.println("You only have 9 options");
                        break;

                    case 0:
                        System.out.println("exiting grocery list.");
                        run = false;
                }
            }

    }



    public void showGrocList ()throws NullPointerException{
        int price = 0;
        for(int i=0;i< grocList.length;i++){
            price += (grocList[i].getQuantity()*grocList[i].getPrice());
        }
        System.out.println("total price of all items on your grocery list is: "+price);
    }


    public void readlist()throws FileNotFoundException {

        File f = new File("src/Items.txt");
        Scanner scan = new Scanner(f);
        while (scan.hasNext()&&f.canRead()){
            String temp = scan.next();
            int price = scan.nextInt();
            GroceryItemOrder item = new GroceryItemOrder(price,temp);
            System.out.println("New item created: "+item);
            items.add(item);
        }
    }
}
