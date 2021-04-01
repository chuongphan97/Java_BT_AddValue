import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i] = (int) Math.round(Math.random()*100+1);

        }
        System.out.println();

        System.out.print("Elements of array: ");
        for (int i : arr
             ) {
            System.out.print(i + "\t");
        }
        System.out.println("Enter value you want add ");
        int addValue = scanner.nextInt();

        System.out.println("Enter index you want put value in");
        int index = scanner.nextInt();
        int[] newArr = addValue(addValue,arr,index);

        System.out.print("Elements of new array: ");
        for (int i : newArr
        ) {
            System.out.print(i + "\t");
        }

    }
    public  static int[] addValue(int value, int[] arr, int index){
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i <= index; i++) {
            if (i == index) newArray[i] = value;
            else newArray[i] = arr[i];

        }
        for (int j = index +1; j < newArray.length; j++){
            newArray[j] = arr[j-1];
        }
        return newArray;
    }
}
