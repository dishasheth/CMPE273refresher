package java_programs;

import java.util.Stack;

public class JavaStack {
Stack st;
int top;
JavaStack()
{
st=new Stack();	
top=0;
}
public void push(String x)
{
st.push(x);	
top++;
}
public String pop()
{
	return ""+st.pop();
}
public String peek()
{
return ""+st.peek();	
}

}
