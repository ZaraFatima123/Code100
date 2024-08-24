#include<stdio.h>
int temp;
int sorted = 0;

 void bubblesort(int *A,int n){
    for(int i=0;i<n-1;i++){        // for no. of passes
        printf("Working on pass number %d\n",i+1);
        for(int j=0;j<n-i-1;j++){
            if(A[j]>A[j+1]){
            temp = A[j];
            A[j] = A[j+1];
            A[j+1]= temp;
            sorted = 0;
            }

        }
    if (sorted) {
            break;
        }
    }
}

int main(){
    int n;
    printf("Enter the size of array: ");
    scanf("%d",&n);
    int A[n];

    printf("Enter the %d elements of array: ",n);
    for(int i=0;i<n;i++){
        scanf("%d ",&A[i]);
    }



     printf("Array before Sorting:");

    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    }

    bubblesort(A,n);
    printf("Array after Sorting:");

    for(int i=0;i<n;i++){
        printf("%d ",A[i]);
    }


}
