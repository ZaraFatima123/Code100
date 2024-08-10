public class Transpose {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int B[][] = new int [3][3];
        System.out.println("The original array A is: ");
        for(int i=0;i<A.length;i++){
             for(int j=0;j<A[0].length;j++){
        System.out.print(A[i][j]+" ");
       }
       System.out.println(" ");
      }

        System.out.println("Transpose of A: ");

        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
            B[i][j] = A[j][i];
        
     }
    }

for(int i=0;i<B.length;i++){
    for(int j=0;j<B[0].length;j++){
        System.out.print(B[i][j]+" ");
    }
    System.out.println(" ");
}
    
}
}
