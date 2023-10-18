#include <iostream>
using namespace std;

void swap(string *a,string *b){
    //formal parameters
    cout<<a<<" "<<&a;
    string t=*a;
    *a=*b;
    *b=t;
}
int main(){
string a,b;
cout<<"Enter 1st num:"<<endl;
cin>>a;
cout<<"Enter 2nd num:"<<endl;
cin>>b;
cout<<&a<<endl;
cout<<&b<<endl;
swap(a,b); //actual parameters
cout<<"After Swap:"<<a<<" "<<b;
}