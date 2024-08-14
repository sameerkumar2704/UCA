#include<stdio.h>


void quick_sort( int s , int e , int arr[] ){
   if(s>=e) return ;

   int j = e;
   for( int i = e ; i >s ; i-- ){
     if( arr[s] < arr[j] ){
        int tem = arr[j];
	arr[j] = arr[i];
	arr[i] = tem;
	j--;
     }
   }
   int tem = arr[s];
   arr[s] = arr[j];
   arr[j] = tem;
   quick_sort( s , j-1 , arr);
   quick_sort( j+1 , e , arr);
}

void printArray( int arr[] , int size , char*str ){
	printf(" %s \n" , str);

  for( int i = 0 ; i < size ; i++ ) {
    printf(" %d" , arr[i]);
  }
  printf("\n");

}
int main(){
	int arr[] = {5 , 4 , 2 , 1 , 3};
	int n = sizeof(arr)/sizeof(int);
	printArray(arr , n , "Array Before : ");
	quick_sort( 0 , n-1 , arr);
	printArray(arr , n , "After Array : ");
  return 0;
}

