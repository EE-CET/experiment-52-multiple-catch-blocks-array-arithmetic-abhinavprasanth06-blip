import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        try{
            int index = sc.nextInt();
            int num2 = arr[index];
            int div = sc.nextInt();
            int answer = num2/div;
            System.out.println(answer);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(ArithmeticException E){
            System.out.println("Divide by zero error");
        }
    }
}
