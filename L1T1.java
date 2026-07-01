import java.util.Scanner;
import java.util.Arrays;
public class L1T1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N:");
        int elementCount = sc.nextInt();
        double [] inputArray = new double[elementCount];
        System.out.println("Please enter the elements of the array:");
        for (int i= 0; i < inputArray.length; i++){
            inputArray[i]= sc.nextDouble();
        }
        sc.close();
        int duplicateElements = 0;
        for (int j= 1; j < inputArray.length; j++){

            if(inputArray[j]==inputArray[j-1]){
                    duplicateElements++;
                }

        }
        int uniqueLength = inputArray.length - duplicateElements;
        double [] uniqueArray = new double [uniqueLength];
        int uIndex =0;

        for(int l=1; l < inputArray.length; l++){
            if(inputArray[l]==inputArray[l-1]){
                continue;
            }
            else{
                uniqueArray[uIndex]=inputArray[l-1];
                uIndex++;
            }
        }
        uniqueArray[uIndex]=inputArray[inputArray.length-1];
        System.out.print("New Array: ");
        for(int m=0; m < uniqueArray.length; m++){
            System.out.print(uniqueArray[m]+ " ");
        }
        System.out.println();
        System.out.println("Removed elements: "+duplicateElements);
    }
}
