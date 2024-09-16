public class App1 {
    public static void main(String[] args) {
        int n=4;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// public class App1 {
//     public static void main(String[] args) {

//         int n=4;
//         for (int i=0; i<n; i++){
//            String inc=" ";
//             for (int j=n; j<=i; j++){
//                 int n2=j;
//                 System.out.print(inc+=n2);
//                 System.out.print(n2);
//             }
//             System.out.println();
//         }
//     }
// }
// public class App1 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             String inc = ""; 
//             for (int j = n; j > i; j++) {
//                 inc += j;
//             }
//             System.out.println(inc); 
//         }
//     }
// }
