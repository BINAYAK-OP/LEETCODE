void push(char stack[], int *top, char ch) {
    (*top)++;
    stack[*top] = ch;
}

char peek(char stack[], int top) {
    return stack[top];
}
bool isValid(char* s) {
    int n=strlen(s);
    if(n%2==1)
    return false;
    char stack[n];
    int top=-1;
    for(int i=0;i<n;i++)
    {
        char ch=s[i];
        if(ch=='(' || ch=='{' || ch=='[')
        {
        push(stack,&top,ch);
        }
        else 
        {
            
            if(top == -1)
                return false;

            char t = peek(stack, top);

            if(ch == '}' && t == '{') {
                top--;
            }
            else if(ch == ']' && t == '[') {
                top--;
            }
            else if(ch == ')' && t == '(') {
                top--;
            }
            else {
                return false;
        }
    }
    }
    return top==-1;
}
