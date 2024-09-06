#include <stdio.h>
#include <stdlib.h>

#define MAX 100 // Maximum size of the stack


struct Stack {
    int arr[MAX];
    int top;
};


void Stack(struct Stack* s) {
    s->top = -1; // Stack is empty
}


int isFull(struct Stack* s) {
    return s->top == MAX - 1;
}


int isEmpty(struct Stack* s) {
    return s->top == -1;
}

void push(struct Stack* s, int value) {
    if (isFull(s)) {
        printf("Stack Overflow! Cannot push %d\n", value);
        return;
    }
    s->arr[++s->top] = value; // Increment top and add value
    printf("Pushed %d onto the stack.\n", value);
}

// Function to pop an element from the stack
int pop(struct Stack* s) {
    if (isEmpty(s)) {
        printf("Stack Underflow! Cannot pop from an empty stack.\n");
        return -1; // Return -1 to indicate failure
    }
    return s->arr[s->top--]; // Return top value and decrement top
}

// Function to display the elements of the stack
void display(struct Stack* s) {
    if (isEmpty(s)) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Stack elements:\n");
    for (int i = s->top; i >= 0; i--) {
        printf("%d\n", s->arr[i]);
    }
}

int main() {
    struct Stack stack;
    void Stack(stack); // Initialize the stack

    int choice, value;

    do {
        printf("\nMenu:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(&stack, value);
                break;
            case 2:
                value = pop(&stack);
                if (value != -1) {
                    printf("Popped %d from the stack.\n", value);
                }
                break;
            case 3:
                display(&stack);
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 4);

    return 0;
}


