#include<stdio.h>

int add ( int a , int b ){
	
	return a+b;
}
int subtract( int a, int b ){
	return a-b;
}
int multiply ( int a , int b) {
  return a*b;
}

int divide ( int a , int b ){
 return a/b;
}

int abs( int value ){
   if( value >= 0) return value;
   value = (~value)+1;
   return value;
}


