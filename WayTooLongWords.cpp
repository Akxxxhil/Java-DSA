//difficulty-800

#include<iostream>
#include<string>
using namespace std;

string newword (string s){
    if(s.size()<=10){
        return s;
    }
    else {
        string ans=s[0]+to_string(s.size()-2)+s[s.size()-1];
        return ans;
    }

}
int main (){
    int n;
    cin>>n;
for (int i=0;i<n;i++){
    string s;
    cin>>s;

    string output=newword(s);
    cout<<output<<endl;
}
    


}