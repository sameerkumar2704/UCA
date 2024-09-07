#include <stdio.h>
int checkValue(int x, int y , int z){
    int mask_1 = !x;
    printf("%d\n" , mask_1);
    return ((!mask_1)&y)^(mask_1&z);
}
int main (){
  int x = 1;
  int y = 8;
  int z = 10;
  printf("x is present than ans is %d\n" ,checkValue(x ,y , z) );  
  x = 0;
  printf("x is not present than ans is %d\n" ,checkValue(x ,y , z) );   
}