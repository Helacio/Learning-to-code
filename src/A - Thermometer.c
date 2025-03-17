//Hernán David Sánchez
//https://atcoder.jp/contests/abc397/tasks/abc397_a
//C

#include <stdio.h>

int main(){
    float X;
    scanf("%f", &X);
    if (X < 37.5){
        printf("%d", 3);
    }
    else if (X >= 37.5 &&  X < 38.0){
        printf("%d", 2);
    }
   else{
    printf("%d", 1);
   }
   return 0;
}