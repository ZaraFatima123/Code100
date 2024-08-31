#include<stdio.h>

int main(){
int n;

     printf("Enter the size of array A: ");
    scanf("%d", &n);
    int A[n];


    printf("Enter elements of Array A: ");
    for(int i=0;i<n;i++){
       scanf("%d",&A[i]);
    }

    int max1,max2;
    max1 = max2 = A[0];

    for(int i=0;i<n;i++){
        if(A[i]>max1){
            max2 = max1;
            max1 = A[i];
        }
        else if(A[i]>max2){
            max2 = A[i];
        }
    }
    printf("Max 1 is %d ",max1);
    printf("Max 2 is %d ",max2);



return 0;
}
