#include <stdio.h>

int main() {
    FILE *file;
    char name[] = "sameer kuamrfsdajfdhk"; 

   
    file = fopen("name_output.bin", "wb+");
    if (file == NULL) {
        perror("Error opening file");
        return 1;
    }

    
    size_t writtenElements = fwrite(name, sizeof(char), sizeof(name), file);
    if (writtenElements != sizeof(name)) {
        perror("Error writing to file");
        fclose(file);
        return 1;
    }

  rewind(file);
 
    char read[10];
  fread(read , sizeof(int) , sizeof(read)/sizeof(int) , file);
    printf("data in file %x\n"    ,read);
       fclose(file);

    
    return 0;
}
