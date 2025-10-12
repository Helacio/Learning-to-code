#include<iostream>
using namespace std;

int main(){
    int result, cases, teams;

    cin>> cases;
    for(int i = 0; i < cases; i++){
        cin>> teams;
        cout<< 2 * teams - 2<< endl;
    }
    return 0;
}

