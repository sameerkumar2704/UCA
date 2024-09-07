#include <stdio.h>
#include<stdlib.h>
typedef struct {
    int top;
    int* arr;
    int size;
    int capacity ;
} stack;
void init(stack*s){
    s->arr = (int*) calloc(5 , sizeof(int));
    s->top = 0;
    s->size = 0;
    s->capacity = 5;
}
void push (stack * s , int value){
    int top = s->top;
    int size = s->size;
    int capacity = s->capacity;
    if( size == capacity ){
        int *tem = (int*) calloc(size*2 , sizeof(int));
        for(int i =0 ; i <size ;i++){
            tem[i] = s->arr[i];
        }
        s->arr = tem;
        s->capacity = size*2;
    }

    s->arr[top] = value;
    s->top++;
    s->size++;
}
int isEmpty( stack *s){
    return s->size == 0 ;
}
int pop( stack* s ){
    if(s->size == 0 ) return -1;
    int value = s->arr[s->top-1];
    s->top--;
    s->size--;
    return value;
}
void printStack(stack*s ){
    while(!isEmpty(s)){
        printf("%d\n" , pop(s));
    }
}
int main(){
    stack* s;
    init(s);
    printf("capacity before overflow %d \n" , s->capacity);
    push(s , 10);
    push( s, 9);
    push(s , 8);
    push( s , 7);
    push( s , 6);
    push( s , 5);
    printStack(s);
    printf("capacity before overflow %d \n" , s->capacity);
    return 0;
}
