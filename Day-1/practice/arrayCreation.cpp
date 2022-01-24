#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter size of array you want :";
    cin>>n;//size of array
    int arr[n];//decleration
    cout<<"enter elements :";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];//additing elements
    }
    cout<<"your rray is : ";
    for (int i = 0; i < n; i++)
    {
        cout<<"\t"<<arr[i];
    }  
    return 0;  
}