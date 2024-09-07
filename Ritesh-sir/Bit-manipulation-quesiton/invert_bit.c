#include <stdio.h>

int  invertNumberBitAfterP(int number , int n , int p){
   int toggle_bits  = ~number;
   int mask_bit  = -1<<p;

   return  toggle_bits ^ mask_bit;
}
int main(){
    int n = 10;
    printf("before - %d\n" , n);
    printf("after - %d\n" , invertNumberBitAfterP(n , 4 , 2));
}