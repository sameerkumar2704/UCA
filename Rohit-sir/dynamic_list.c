#include<stdio.h>
#include<stdlib.h>
typedef struct {

   int *elements;
   int size;
   int capacity;


} List;

void initList (List *list){
   list->elements= (int*) calloc ( 5 , sizeof(int));

   list->size = 0;
   list->capacity = 5;
}
void addElement( List *list , int value) {
   if( list->size == list->capacity ){
	   int *temp = (int*) calloc (list->size*2 , sizeof(int));
	   for (int i = 0 ; i <list->size ; i++ ){
		   temp[i] = list->elements[i];
	   }
	   free(list->elements);
	   list->elements = temp;
	   list->capacity =list->capacity*2;


   }
   list->elements[list->size] = value;
   list->size++;


}

int compareAsc( int a , int b ){
  if(a>b) return 1;
  return 0;
}

int compareDesc( int a , int b ){
   if( a<b) return 1;
   return 0;

}
void sortList (List *list , int (*compare)(int , int)){
  
	int size = list->size;
	int *arr = list->elements;
	for ( int i =0 ; i < size-1 ; i++ ) {
	  for (int j = 1 ; j <size-i ; j++ ){
		  if( (*compare)(arr[j-1] , arr[j])){

			  int tem = arr[j];
			  arr[j] = arr[j-1];
			  arr[j-1] = tem;
		  }

	  }
	}

}
void printList (List *list){
  int n = list->size;
  for( int i = 0 ; i <n ; i++ ){
    printf(" %d" , list->elements[i]);
  }

}

int main(){
  
	List* arr;
	initList(arr);
	printf("\n capacity before add is %d \n" , arr->capacity);
	addElement(arr , 10);
	addElement(arr , 1);
	addElement(arr , 4);
	addElement(arr , 5);
	addElement(arr ,11);
	addElement(arr , 40);
	printf("\n capacity of list is %d \n" , arr->capacity);
	sortList(arr , compareDesc);
	printList(arr);
	free(arr->elements);


}

