#include <stdio.h>

int addTwoNum (int a, int b) {
    return a+b;
}//function declaration
//Re-usability

int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    int sum1=addTwoNum(a,b); //function call
    printf("%d\n",sum1);

    int sum2=addTwoNum(100,500);
    printf("%d\n",sum2);

    int sum3=addTwoNum(1200,5400);
    printf("%d",sum3);
}

[10,20,4,5,22,6,9,89]
