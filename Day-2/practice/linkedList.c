#include<stdio.h>
#include<malloc.h>
struct node
{
    int data;
    struct node *link;
}*start,*newnode,*temp;
void create(int n){
    newnode = (struct node*)malloc(sizeof(struct node));
    newnode-> data = n;
    newnode->link = NULL;
    if (start == NULL)
    {
        start = newnode;
    }else{
        temp = start;
        while (temp->link != NULL)
        {
            temp = temp->link;
        }
        temp->link = newnode;
    }
}
void display(){
    temp = start;
    if (temp == NULL)
    {
        printf("list is empty !");
    }else
    {
        while (temp != NULL)
        {
            printf("---->| %d |",temp->data);
            temp = temp->link;
        }   
    }
}
void insert(int pos,int n){
    int count=1;
    newnode = (struct node*)malloc(sizeof(struct node));
    newnode-> data = n;newnode->link = NULL;
    printf("%d",newnode->data);
    if (pos == 1)
    {
        newnode->link = start;
        start = newnode; 
    }else{
        temp = start; 
        while (count < pos-1)
        {
            temp = temp->link;
            count++;
        }
        newnode->link = temp->link;
        temp->link = newnode;
    }   
}
void delete(int pos){
    
}
int main(){
    int ch,n,pos,data;
    do
    {
        printf("Press 1 to create \n");
        printf("Press 2 to display \n");
        printf("press 3 to insert in bitween \n");
        scanf("%d",&ch);
        switch (ch)
        {
        case 1:
            printf("Enter data : ");
            scanf("%d",&n);
            create(n);
            break;
        case 2:
            display();
            break;
        case 3:
            printf("Enetr position : ");
            scanf("%d",&pos);
            printf("Enter data : ");
            scanf("%d",&data);
            insert(pos,data);
            break;
        case 4:
            printf("Enter position to delete : ");
            scanf("%d",&pos);
            delete(pos);
            break;
        default:
            break;
        }
        printf("enter 1 to continue : ");
        scanf("%d",&ch);
    } while (ch == 1);
    
}
