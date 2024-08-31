#include<stdio.h>

void insert_sort(int A[],int n){
    int i,j,x;

    for(int i=1;i<n;i++){
        j=i-1;
        x = A[i];

        while(j>-1 && A[j]>x){
            A[j+1] = A[j];
            j--;
        }
        A[j+1] = x;
    }
}

int main(){
    int n;

     printf("Enter the size of array A: ");
    scanf("%d", &n);
    int A[n];

    for(int i=0;i<n;i++){
       scanf("%d",&A[i]);
    }

    insert_sort(A,n);

    printf("Array after performing insert sort: ");

    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    }

return 0;
}
