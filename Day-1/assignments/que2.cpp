#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node *next;
}*temp,*head;
void insert(int data){
    node* newnode = new node();
    newnode->data = data;
    newnode->next = NULL;
    if (head == NULL)
    {
        head = newnode;
    }else
    {
        temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
}
void display(){
    if (head == NULL)
    {
        cout<<"list is empty !";
    }else
    {
        temp = head;
        while (temp != NULL)
        {
            cout<<temp->data<<endl;
            temp = temp->next;
        }
    }
}
int main(){
    int n,data;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        cin>>data;
        insert(data);
    }
    display();
    return 0;
}