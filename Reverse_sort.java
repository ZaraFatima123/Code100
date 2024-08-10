public class Reverse_sort {
    public static void main(String[] args) {
        

        int arr[] = {5,8,7,10,1,2};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                
            }
            
        }
        System.out.println("\n");
        System.out.println("Sorted array in descending order: ");
    for(int x:arr){
        System.out.print(x +" ");
    }
    
}
}
