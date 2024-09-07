#include <assert.h>
#include <stdio.h>
// using De Morgan's Theorems : ~(A+B) = ~(A).~(B)
int AndOperation(int a , int b){
    return ~(~a|~b);
}
int main(){
    int a  = 334;
    int b  = 200;
    assert((a&b) == AndOperation(a , b) );
    printf("Default - %d\nCustom - %d\n" , a&b , AndOperation(a , b));
}