
#include <stdio.h>
#include <limits.h>
#include <fcntl.h>
int  find_n_is_negtive_positve_zero(int value ){
   int a = value;
   int b = (~a)+1;

   int c= (a + (b-1)); //  difference -1;
   int d = (a + (b+1));// difference 1
   int a_l_m_bit = ((a>>31)&1); // right most bit of  a
   int b_l_m_bit = ((b>>31)&1);//  right most bit of b

   int is_zero = a_l_m_bit | b_l_m_bit; // is number zero

   int n_s = (c+a_l_m_bit)^-1; //  n_s  always will be -1
   int p_s = (d-a_l_m_bit)&(is_zero); // p_s always will be +1

   return  n_s|p_s;
}
int main() {
   int file = open("./copy.txt", O_WRONLY | O_TRUNC  );
   write(file , " THa fdsfa" , 11 );
   char arr[100];
   size_t count = sizeof(arr)-1;
   size_t res = read(file  , arr , count);
   write(STDOUT_FILENO , arr , res);
   close(file);

    return 0;
}
