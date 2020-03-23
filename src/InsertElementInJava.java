import java.util.Scanner;

public class InsertElementInJava {
    public static void main(String[] args) {
        int[] arrayNumber = {1,2,3,4,5,6};
        int insertValue;
        int insertPosition;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to insert: ");
        insertValue = scanner.nextInt();
        do {
            System.out.println("Enter position to insert: ");
            insertPosition = scanner.nextInt();
            if (insertPosition <= 1 || insertPosition > arrayNumber.length - 1){
                System.out.println("Insert Position not found");
            }
        } while (insertPosition <= 1 || insertPosition > arrayNumber.length - 1);
        int[] newArrayNumber = new int[arrayNumber.length+1];
        for (int i = 0; i < arrayNumber.length; i++){
            newArrayNumber[i] = arrayNumber[i];
        }
        for (int i = newArrayNumber.length-1; i >= insertPosition; i--){
            newArrayNumber[i] = newArrayNumber[i-1];
        }
        newArrayNumber[insertPosition] = insertValue;
        System.out.println("Your new array: ");
        for (int i = 0; i < newArrayNumber.length; i++){
            System.out.print(+ newArrayNumber[i] + " ");
        }
    }
}
