import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {

    ArrayList<GroceryItemOrder> items = new ArrayList<>();
    GroceryItemOrder[] grocList = new GroceryItemOrder[10];
    int count = 0;
    boolean run = true;


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


            System.out.println("which item do you want to add to your grocery list?");
            for (int i = 0; i<items.size();i++){
                System.out.println(i+1+": "+items.get(i));
            }
            System.out.println("11: view grocery list.");
            System.out.println("12: price of grocery list.");
            System.out.println("0: exit");
            while(run){
                option = antiJarl();
                //////////////////undgå case - del kode op så det er lettere læsligt, max 10 linier per metode
                if (option == 11){
                    showGrocList();
                }
                else if (option == 12){
                    showGrocListPrice();
                } else if (option == 0){
                    System.out.println("exiting grocery list.");
                    showGrocListPrice();
                    showGrocList();
                    run = false;
                }else if (option <0 && option >12){
                    System.out.println("you only have 10 options");

                } if (option >0 && option <11){
                    addSelectItem(option);
                }


            }

    }



    public void showGrocListPrice()throws NullPointerException{
        int price = 0;
        for(int i=0;i< count;i++){
            price += (grocList[i].getQuantity()*grocList[i].getPrice());
        }
        System.out.println("total price of all items on your grocery list is: "+price);
    }

    public void showGrocList(){
        for(int i =0;i<count;i++){
            System.out.println(grocList[i].getName()+" "+"x"+grocList[i].getQuantity());
        }
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

    public void addSelectItem(int select){
        for(int i = 0; i<grocList.length;i++){
            if(grocList[i]==null){
                System.out.println("How many/much "+items.get(select-1).getName()+" do you want to add?");
                int tempInt = antiJarl();
                grocList[i]=items.get(select-1);
                grocList[i].setQuantity(tempInt);
                System.out.println(tempInt+"x "+items.get(select-1).getName()+" added to grocery list.");
                count ++;
                System.out.println(count+"/10 of the grocery list is used.");
                if(count>=10){
                    System.out.println("Grocery list is now full, exiting grocery list");
                    showGrocListPrice();
                    showGrocList();
                    run = false;
                    break;
                } else {
                    System.out.println("which item do you want to add to your grocery list? If you are done adding items press 0.");
                    for (int j = 0; j<10;j++){
                        System.out.println(j+1+": "+items.get(j));
                    }
                    break;
                }
            }
        }
    }
}
