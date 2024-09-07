#include<stdio.h>

int compareAsc( int a, int b ){
  if( a > b) return 1;
  return 0;

}

int compareDesc( int a , int b ){
   if( a < b) return 1;

   return 0;
}

void swap ( int arr[] , int i , int j ){
     int tem = arr[i];
     arr[i] = arr[j];
     arr[j] = tem ;
}

void sort ( int arr[]  , int size , int (*handler) (int ,int ) ){
   for ( int i = 0 ; i <size-1 ; i++ ) {
	   for(int j = 1 ; j <size-i ; j++ ) {
	       if( (*handler)( arr[j-1] , arr[j])){
	            
		       swap( arr , j-1 ,j);
		    
	       }
	   }

   }
}
void printArray (int arr[] , int size ) {
   
	for(int i = 0 ; i <size ; i++ ) {
	  printf("%d " , arr[i]);
	}
}
int main(){
   int arr[] = { 4,5,2,1,10};
   int size = 5;
   sort( arr , size , compareAsc);
   printArray( arr , size );

}
