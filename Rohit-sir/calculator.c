#include<stdio.h>
int add( int a , int b ){

	return a+b;
}
int multiply( int a , int b ){
    return a*b;
}
int subtract( int a , int b ){
  return a-b;
}
int divide( int a , int b ){
 return a/b;

}

void performOperation( int a , int b , int (*handler) (int , int) , char * str ) {
    int result =  (*handler)( a, b );
    printf("%s %d\n" ,str, result); 
}



int main(){

	int a = 10;
	int b = 5;
	printf(" a is %d and b is %d\n\n" , a , b);
	performOperation( a , b , add , " addition = ");
	performOperation( a, b , subtract , " subtraction = ");
	performOperation( a, b , multiply , " mutliplication = ");
	performOperation(a , b , divide , " division = ");
}

