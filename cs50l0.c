#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};
struct node* head;

void print(){
    for(struct node* ptr = head;ptr!=NULL;ptr=ptr->next){
        printf("the num %d\n",ptr->data);
    }
}

void reverse(){
    struct node *current,*prev,*next;
    current = head;
    prev = NULL;
    while(current!=NULL){
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}

int main(){
    head = NULL;

    int i;
    do{
        struct node* temp = (struct node*)malloc(sizeof(struct node));
        printf("enter a number\n");
        scanf("%d",&i);
        if(i<0)
            break;
        temp->data = i;
        temp->next = NULL;

        if(head == NULL){
            head = temp;
        }else{
            temp->next = head;
            head = temp;
        }

    }while(i>=0);

    print();

    reverse();

    print();

    return 0;
}
