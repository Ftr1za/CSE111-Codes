// Write a Java program that asks the user the length of an array (N) then takes N number of doubles as elements for the array as input. 
// First, remove the consecutive duplicate elements from the original array to form a new array. 
// Then print the number of elements removed from the original array. 

import java.util.Scanner;
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
