import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("+++Login+++");
        System.out.print("Username: ");
        String user =sc.nextLine(); 
        System.out.print("Password: ");
        String password =sc.nextLine(); 
        
            System.out.println("+++Customer+++");
            System.out.println("+Customer information+");
            System.out.print("Customer name: ");
            String cn =sc.nextLine();
            System.out.print("Customer address: ");
            String ca =sc.nextLine();
            System.out.print("Phone number: ");
            int pn =sc.nextInt();
            System.out.print("Are you a member? (yes or no): ");
            char mb = sc.next().charAt(0);

            System.out.println("+Pet information+");
            System.out.print("Pet name: ");
            String pet =sc.nextLine();
            System.out.print("Pet type (Dog or Cat): ");
            char pt = sc.next().charAt(0);
            System.out.print("Pet gender(male or female): ");
            char pg = sc.next().charAt(0);

           System.out.print("How old is your pet?: ");
            int py =sc.nextInt();
            System.out.print("How many months?: ");
            int pm =sc.nextInt();

            System.out.println("+++Pet service+++");
            if (pt == 'D' || pt == 'd'){
                System.out.println("DOGs");
                System.out.println("If you want any service, press y If you don't want any, press n");
                System.out.print("Bathing 150 baht: ");
                char b = sc.next().charAt(0);
                System.out.print("Spa 250 baht: ");
                char sp = sc.next().charAt(0);
                System.out.print("Short hair cut 300 baht: ");
                char sh = sc.next().charAt(0);
                System.out.print("Hair dressing 350 baht: ");
                char h = sc.next().charAt(0);
                System.out.print("Trim dog nails 50 baht: ");
                char t = sc.next().charAt(0);
                System.out.print("Tick repellent drops 150 baht: ");
                char tr = sc.next().charAt(0);

                int total = 0;
                if (b == 'y' || b == 'Y') {
                    total += 150;
                } if (sp == 'y' || sp == 'Y') {
                    total += 250;
                } if (sh == 'y' ||sh  == 'Y') {
                    total += 300;
                } if (h == 'y' || h == 'Y') {
                    total += 350;
                } if (t == 'y' || t == 'Y') {
                    total += 50;
                } if (tr == 'y' || tr == 'Y') {
                    total += 150;
                }
                System.out.print("Total expenses: ");
                System.out.println(total);
                System.out.print(" Baht");
                if(mb == 'y' || mb == 'Y'){
                 double i = total*0.1;
                 System.out.print("Discount: ");
                System.out.println(i);
                System.out.print(" Baht");
                System.out.print("Total: ");
                System.out.println(total-i);
                System.out.print(" Baht");
                System.out.print("Get money: ");
                int gm =sc.nextInt();
                System.out.print(" Baht");
                System.out.print("Give change: ");
                System.out.println(gm-(total-i));
                System.out.print(" Baht");
            }else{double i = 0;
                System.out.print("Discount: ");
               System.out.println(i);
               System.out.print(" Baht");
               System.out.print("Total: ");
               System.out.println(total-i);
               System.out.print(" Baht");
               System.out.print("Get money: ");
               int gm =sc.nextInt();
               System.out.print(" Baht");
               System.out.print("Give change: ");
               System.out.println(gm-(total-i));
               System.out.print(" Baht");
            }


            } else if (pt == 'C' || pt == 'c') {
                System.out.println("CATs");
                System.out.println("If you want any service, press y If you don't want any, press n");
                System.out.print("Bathing 100 baht: ");
                char bc = sc.next().charAt(0);
                System.out.print("Spa 100 baht: ");
                char spc = sc.next().charAt(0);
                System.out.print("Short hair cut 200 baht: ");
                char shc = sc.next().charAt(0);
                System.out.print("Hair dressing 250 baht: ");
                char hc = sc.next().charAt(0);
                System.out.print("Trim cat nails 50 baht: ");
                char tc = sc.next().charAt(0);
                System.out.print("Nail care drops 150 baht: ");
                char trc = sc.next().charAt(0);

                int total = 0;
                if (bc == 'y' || bc == 'Y') {
                    total += 100;
                } if (spc == 'y' || spc == 'Y') {
                    total += 100;
                } if (shc == 'y' || shc == 'Y') {
                    total += 200;
                } if (hc == 'y' || hc == 'Y') {
                    total += 250;
                } if (tc == 'y' || tc == 'Y') {
                    total += 50;
                } if (trc == 'y' || trc == 'Y') {
                    total += 150;
                }
                System.out.print("Total expenses: ");
                System.out.println(total);
                System.out.print(" Baht");
                if(mb == 'y' || mb == 'Y'){
                 double i = total*0.1;
                 System.out.print("Discount: ");
                System.out.println(i);
                System.out.print(" Baht");
                System.out.print("Total: ");
                System.out.println(total-i);
                System.out.print(" Baht");
                System.out.print("Get money: ");
                int gm =sc.nextInt();
                System.out.print(" Baht");
                System.out.print("Give change: ");
                System.out.println(gm-(total-i));
                System.out.print(" Baht");
            }else{double i = 0;
                System.out.print("Discount: ");
               System.out.println(i);
               System.out.print(" Baht");
               System.out.print("Total: ");
               System.out.println(total-i);
               System.out.print(" Baht");
               System.out.print("Get money: ");
               int gm =sc.nextInt();
               System.out.print(" Baht");
               System.out.print("Give change: ");
               System.out.println(gm-(total-i));
               System.out.print(" Baht");
            }
            }
            
          
    
}}