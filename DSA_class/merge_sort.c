#include<stdio.h>
// tim sort
//  merge sort - nlogn 
//  height of recurssion tree is log n
//  time take to merge two sorted array is n so its n * log n
//  number of subset is 2^n
//  size of each subset is n/(2^n)
//  worst.c n*logn 
//  best.c n*log n
//  avg.c n*log n

// merge_arr is use to cobine array
void merge_arr (int arr[] , int s , int e ){
   int mid = (s+e)/2;
   int tem[e-s+1];
   int i = s , j = mid+1 , k = 0;
   while( i<=mid && j<=e){
	   if(arr[i]<arr[j]){
	      tem[k] = arr[i];
	      i++;
	   }else{
              tem[k] = arr[j];
	      j++;
           }
	   k++;

   }
   while(i<=mid){
      tem[k] = arr[i];
      i++;
      k++;
   }
   while(j<=e){
   
    tem[k] = arr[j];
    j++;
    k++;
   }

   for(i = 0 ; i < e-s+1 ; i++){
    arr[s+i] = tem[i];
   }


}

// merge sort function
void merge_sort( int s , int e  ,int arr[]){
   if(s == e) return ;
   int mid = ( s + e )/2;
   merge_sort(s , mid , arr);
   merge_sort(mid+1 , e , arr);
   merge_arr(arr , s , e);


}
int main(){
	int arr[] = {6,7,3,4,2,1,3,5,6,69,0,3};

	int n = sizeof(arr)/sizeof(int);
	merge_sort(  0 , n-1,arr);
	for(int i = 0 ; i <n ; i++)
	{
	printf("%d " , arr[i]);
	};


    return 0;
}

