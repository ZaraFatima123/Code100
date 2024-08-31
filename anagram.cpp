#include<iostream>
#include<string>
#include<algorithm>

using namespace std;



int main(){
    string str1,str2;
    cout << "Enter two strings: " << endl;
    cin >> str1 >> str2;

    
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());

    if(str1 == str2){
        cout<<"Anagram words";
    }
    else{
        cout<<"Not anagram words";
    }
return 0;
}
