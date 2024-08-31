#include<stdio.h>
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void selectionSort(int A[],int n){
    int i,j,k;

    for(int i=0;i<n-1;i++){
        for(int j=k=i;j<n;j++){
            if(A[j]<A[k]){
                k=j;
            }
        }
        swap(&A[i],&A[k]);
    }
    
}
int main(){
     int n,i;
    printf("Enter the size of array A: ");
    scanf("%d", &n);
    int A[n];

    printf("Enter the %d elements of array A:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &A[i]);  
    }

    selectionSort(A, n);

    printf("Sorted array after applying selection sort: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", A[i]);
    }
    printf("\n");

    return 0;

return 0;
}
