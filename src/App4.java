// import java.util.Scanner;

// public class App4 {

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scnr = new Scanner(System.in);
        
       
//         int num = scnr.nextInt();
        
//         if (isPrime(num)) {
//             System.out.println(isPrime(num));
//         } else {
//             System.out.println(isPrime(num));
//         }
        
//         scnr.close();
//     }
// }
// public class App4 {

  
//     public static int factorial(int num) {
//         int result = 1;
        
//         for(int i = 1; i <= num; i++) {
//             result *= i; 
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         int number = 6; 
//         int fact = factorial(number); 
        
//         System.out.println("Factorial of " + number + " is: " + fact);
//     }
// }
// public class App4 {

//     public static boolean isArmstrong(int num) {
//         int numCopy = num; 
//         int tempAms = 0; 
//        int powr = 0; 
//        if (num >= 1000 && num < 10000) {
//         powr = 4;
//     } else if (num >= 100 && num < 1000) {
//         powr = 3;
//     } else {
//         return false; 
//     }
//         while (num > 0) {
//             int ld = num % 10; 
//             tempAms += Math.pow(ld,powr); 
//             num /= 10; 
//         }
      
//         return tempAms == numCopy;
//     }

//     public static void main(String[] args) {
//         int num = 9474;
  

//         if (isArmstrong(num)) {
//             System.out.println(num + " is an Armstrong number.");
//         } else {
//             System.out.println(num + " is not an Armstrong number.");
//         }
//     }
// }


// import java.util.Scanner;
// public class App4 {
// public static void main(String[] args) {
//  Scanner scnr=new Scanner (System.in);

// int num = scnr.nextInt();
// if (num%2==0){
//     System.out.println("The number is a even number.");

// }
// else{
//     System.out.println("The number is an odd number.");
// }
// }
// }

// public class App4 {

//     public static int factorial(int num) {
//         int fact = 1;
//         if (num < 0) {
//             throw new IllegalArgumentException("Number must be non-negative");
//         }
//         if (num <= 1) {
//             return 1;
//         }
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }

//     public static int biCoe(int n, int k) {
//         return factorial(n) / (factorial(k) * factorial(n - k));
//     }

//     public static void main(String[] args) {
//         int num = 5;
//         int k = 3;  
//         int result = biCoe(num, k);
//         System.out.println(result);
//     }
// }
// public class App4 {

//     public static void PrintArray(int[] array){
//         for(int i=0; i<array.length; i++){
//             System.out.print(array[i]+" ");
//         }
        
//     }

//     public static void main(String[] args) {    
    

//         int arr1[]={1,2,3,4,5};
//         int arr2[]={3,4,5,6,7};
// PrintArray(arr2);
// System.out.println( " ");
// // Array as parameters
// PrintArray(new int[]{12,3,3,4,5,});


//     }
// }



public class App4{
    public static void main(String[] args) {

//         int array[] []={{1,2,3,3,},{4,5,6,7}};
//         int array12[][]=new int [3][3];
//         for (int[] array1 : array){
//             for (int array2 : array1){
//                 System.out.print(array2 + " ");
//             }
//             System.out.println();
//         }
//         // for (int[] array1 : array12){
//         //     for (int array2 : array1){
//         //         System.out.print(array2 + " ");
//         //     }
//         // //     System.out.println();
//         // // }

//         // int [][][] arr3d={
//         //     {{1,2,3},{4,5,6},{7,8,9}},
//         //     {{10,11,12},{13,14,15},{16,17,18}},
//         //     {{19,20,21},{22,23,24},{25,26,27}}
//         // };



int arrsid[]={-1,-2,-3,-34,-35};
int maximum=Integer.MIN_VALUE;               ///MIN_VALUE
for(int i: arrsid){
    if (i>maximum){
        maximum=i;
    }
}
System.out.println(maximum);










    }
}