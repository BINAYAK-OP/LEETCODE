
#define max 30000

typedef struct {
    int stack [max];
    int minstack [max];
    int top;
    
} MinStack;


MinStack* minStackCreate() {
    MinStack* obj = malloc(sizeof(MinStack));
    obj->top = -1;
    return obj;
}

void minStackPush(MinStack* obj, int value) {
    obj->top++;
    obj->stack[obj->top]=value;
    if(obj->top==0)
    obj->minstack[obj->top]=value;
    else
    {
        if(value < obj->minstack[obj->top-1])
        obj->minstack[obj->top] = value;
        else
            obj->minstack[obj->top] = obj->minstack[obj->top - 1];
    }

}

void minStackPop(MinStack* obj) {
    obj->top--;
}

int minStackTop(MinStack* obj) {
    return obj->stack[obj->top];
}

int minStackGetMin(MinStack* obj) {
    return obj->minstack[obj->top];
}

void minStackFree(MinStack* obj) {
    free(obj);
}

/**
 * Your MinStack struct will be instantiated and called as such:
 * MinStack* obj = minStackCreate();
 * minStackPush(obj, value);
 
 * minStackPop(obj);
 
 * int param_3 = minStackTop(obj);
 
 * int param_4 = minStackGetMin(obj);
 
 * minStackFree(obj);
*/