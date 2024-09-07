#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
typedef struct QueueNode
{
    /* data */
    int data;
    struct QueueNode *next_element;
} QueueNode;

QueueNode *frontPointer = NULL;
QueueNode *rarePointer = NULL;

QueueNode* createNode( int value ){
    QueueNode* tem =  malloc(sizeof(QueueNode));
    tem->data = value;
    return tem;
}
void enqueue(QueueNode *new_element)
{
    if (frontPointer == NULL)
    {
        frontPointer = new_element;
        rarePointer = new_element;
    }
    else
    {
        rarePointer->next_element = new_element;
    }
    rarePointer = new_element;
}

int dequeue()
{
   if(frontPointer == NULL) return -1;
   int value = frontPointer->data;
   frontPointer = frontPointer->next_element;
   return value;
}

int main(){
    int arr[] = {1,2,3,4,5};
    int size = sizeof(arr)/sizeof(int);
    for( int i = 0 ; i < size ; i++ ){
        QueueNode*new_node = createNode(arr[i]);
        enqueue(new_node);
    }
    int i= 0;
    while(frontPointer!=NULL){
        int value = dequeue();
        printf("element - %d\n" , value);
        assert(arr[i] == value);
        i++;
    }
    return -1;
}