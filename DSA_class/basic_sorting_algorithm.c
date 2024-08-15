#include<stdio.h>

void insertion_sort(int arr[]  , int n ){
   for( int i = 0 ; i < n ; i++ ){
	   int index = i;
    for(int j = i-1 ; j>-1 ; j-- ) {
        if(arr[index]<arr[j]){
		int tem = arr[index];
		arr[index] = arr[j];
		arr[j] =tem;
		index = j;
	}
    }
   }
}

void bubble_sort(int arr[]  , int n ){
	for(int i = 0; i <n  ;i++ ){
	  for(int  j = 1 ; j <n-i ; j++) {
	     if(arr[j-1]>arr[j]){
	       int tem  = arr[j-1];
	       arr[j-1] = arr[j];
	       arr[j] = tem;
	     }
	  }
	
}
}
void selection_sort(int arr[] , int n ){
   for(int i = 0 ; i <n ; i++ ){
	   for( int j = i+1 ;  j<n ; j++){
	      if( arr[i]>arr[j]){
	        int tem = arr[j];
		arr[j] = arr[i];
		arr[i] = tem;
	      }
	   }
   }
}
void printArray(int arr[] , int n ){
   for(int i = 0 ; i <n ; i++ ){
      printf(" %d" , arr[i]);
   }
   printf("\n");
}

int main(){ 
	int arr[] = { 5,3 ,4,2,10 , 1};
	int n = sizeof(arr)/sizeof(int);
	printArray(arr , n);
	insertion_sort(arr , n);
	printArray(arr , n);
	return 0;
}

