import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String item;
    int price;
    int qty;
    int subtotal;
    
    public Item(String item, int price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
        this.subtotal = price * qty;
    }
}

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        
        
        items.add(new Item("Bag", 100000, 2));
        items.add(new Item("Hat", 20000, 2));
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Apakah ingin menambah item baru? (y/n): ");
        String choice = sc.nextLine();
         
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama item: ");
            String name = sc.nextLine();
             
            System.out.print("Masukkan harga: ");
            int price = sc.nextInt();
             
            System.out.print("Masukkan jumlah: ");
            int qty = sc.nextInt();
            sc.nextLine();
             
            items.add(new Item(name, price, qty));
             
            System.out.print("Tambah item lagi? (y/n): ");
            choice = sc.nextLine();
        }
        
        
        System.out.println("No    Item     Price     Qty   Subtotal");
        System.out.println("============================================");
            
        int total = 0;
        int no = 1;
             
        for (Item i : items) {
            System.out.printf("%-3d %-10s %-9d %-5d %-9d%n", 
                    no++, i.item, i.price, i.qty, i.subtotal);
            total += i.subtotal;
        }
        
        System.out.println("============================================");
        System.out.printf("Total %d%n", total);
            
        sc.close();
    }
}