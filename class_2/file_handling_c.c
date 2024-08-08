#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>

int main(){
//     FILE *fptr ,*fptr_2 ;
//     fptr = fopen("./data.txt",  "r");
//     fptr_2 = fopen("./copy.txt" , "w");
//     if(fptr == NULL) printf("sorry something went wrong");
//     char first_word[100];
//     char* status;
//    while(status != NULL){
//          status = fgets( first_word,100, fptr);

//         if(status == NULL) break;

//         fputs(first_word , fptr_2);
//     }


//     fclose(fptr_2);
//     fclose(fptr);
  char* path = "./data.txt"  ;
  int f_1 = open(path, O_RDONLY);
  int f_2 = open("./copy.txt", O_WRONLY|O_TRUNC|O_CREAT);
  if(f_1 == -1) printf("Something Went wrong while opening file %s",path);
  char value[100];
  size_t count = sizeof(value) -1;
  size_t res = read(f_1 , value , count);
  value[res] = '\0';

  write(f_2, value , res);
  close(f_2);
  close(f_1);



    return 0;
}
