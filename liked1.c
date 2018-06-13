#include<stdio.h>
#include<stdlib.h>
  struct node{
    int data;
    struct node* addr;
};
struct node* head;
void insert(int x){
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = x;
    //temp->addr = NULL;
    //if(head!=NULL){
        temp->addr = head;
    //}
    head = temp;
}

void print(){
    struct node* temp = head;
    // while(temp!=NULL){

    //     printf("%d\n",temp->data);
    //     temp = temp->addr;
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
return 0;
}
