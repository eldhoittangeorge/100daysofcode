#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node* addr;
};
struct node* head;

void delete(int n){
    struct node* temp = head;
    if(n==1){
        head = temp->addr;
        free(temp);
        return;
    }int i;
    for(i=0;i<n-2;i++){
        temp = temp->addr;
    }
    struct node* temp1 = temp->addr;
    temp->addr = temp1->addr;
    free(temp1);
}

void insert(int data){
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->addr = NULL;
    if (head!=NULL)
    {
        temp->addr = head;
    }
    head = temp;
}

void Print(){
    // struct node* temp1 = head;
    // while(temp1!=NULL){
         printf("%d\n",head->data);
    //     temp1 = temp1->addr;
    // }
}

int main(){
    head = NULL;
    insert(4);
    insert(6);
    insert(3);
    insert(5);
    Print();
    // delete(2);
    // Print();
    // return 0;
}
