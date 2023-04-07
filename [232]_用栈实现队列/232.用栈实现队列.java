/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    Stack<Integer> inStack;//输入栈
    Stack<Integer> outStack;//输出栈

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        //如果out栈为空，则将in栈全部弹出并压入out栈中，然后out栈.pop();
        if(outStack.isEmpty())
        {
            while(!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
        }
            return outStack.pop();
    }
    
    public int peek() {
        if(outStack.isEmpty())
        {
            while(!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

