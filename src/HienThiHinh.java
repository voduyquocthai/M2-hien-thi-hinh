import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangles (4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print the isosceles triangle");
        System.out.println("0. Exit");
        while (choice!=0){
            System.out.println("Enter Your Choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++){
                        System.out.println();
                        for (int j = 0; j < 7; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    //tam giac vuong 1
                    for (int i = 0; i < 5; i++){
                        System.out.println();
                        for (int j =0; j <=i ; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    // tgv 2
                    for (int i = 0; i <= 4; i++){
                        System.out.println();
                        for (int j =5; j > i ; j--){
                            System.out.print("*");
                        }
                    }
                    // tgv 3

                    for (int i = 0; i <= 4; i++){
                        System.out.println();
                        for (int j =5; j > i ; j--){
                            System.out.print(" ");
                        }
                        for (int k =0; k <= i ; k++){
                            System.out.print("*");
                        }
                    }
                    // 4
                    System.out.println();
                    for (int i = 0; i <= 4; i++){
                        System.out.println();
                        for (int k =0; k <= i ; k++){
                            System.out.print(" ");
                        }
                        for (int j =5; j > i ; j--) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i <= 8; i += 2){
                        System.out.println();
                        for (int j =10; j > i ; j-=2){
                            System.out.print(" ");
                        }
                        for (int k =0; k <= i ; k++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No Choice!");
            }
        }
    }
}
