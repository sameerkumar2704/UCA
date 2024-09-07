#include<stdio.h>
//A⊕B=(A⋅¬B)+(¬A⋅B)
int AndOperation(int a , int b){
    return ~(~a|~b);
}
int xorCustom(int a  , int b){
    int var_1 = AndOperation(a , ~b);
    int var_2 = AndOperation(~a , b);
    return var_1 | var_2;
}
int main(){
    int a = 10;
    int b = 33;
    printf("default xor - %d\ncustom xor - %d\n" , a^b , xorCustom(a , b));
}