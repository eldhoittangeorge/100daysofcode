#include<stdio.h>
#include<stdlib.h>
  struct node{
    int data;
    struct node* addr;
};
struct node* head;

void insertPosition(int data,int n){
    struct node* temp = (struct node*) malloc(sizeof(struct node));
    temp->data = data;
    temp->addr = NULL;
    if(n==1){
        temp->addr = head;
        head = temp;
        return;
    }
    struct node* temp1 = head;
    for(int i=1;i<n-1;i++){
        temp1 = temp1->addr;
    }
    temp->addr = temp1->addr;
    temp1->addr = temp;
}

void insert(int x){
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = x;
    temp->addr = NULL;
    if(head!=NULL){
        temp->addr = head;
    }
    head = temp;
}

void print(){
    struct node* temp = head;
    while(temp!=NULL){

        printf("%d",temp->data);
        temp = temp->addr;
    }
}

int main(){
    head = NULL;
    int n,i,x;
    printf("how many elements\n");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("enter the elements\n");
        scanf("%d",&x);
        insert(x);
        print();
    }
    insertPosition(1,1);
    insertPosition(2,2);
    insertPosition(3,3);
    print();
return 0;
}
