package com.coek;

/**
 * 栈的实现
 */
public class ArrayStack {
    /**
    栈顶指针top，默认为-1(栈底)
     */
    private int top=-1;

    /**
     * 用数组模拟栈
     */
    private int[] array;

    /**
     * 栈的最大容量
     */
    private int maxStack;

    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        this.array=new int[maxStack];
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty(){
        return top ==-1;
    }

    /**
     * 判断栈是否为满
     */
    public boolean isFull(){
        return top==maxStack-1;
    }

    /**
     * 压栈
     */
    public void push(int val){
        //栈满
        if (isFull()){
            throw new RuntimeException("栈已满，无法压栈");
        }
        //压栈
        this.top++;
        this.array[top]=val;
    }

    /**
     * 弹栈,用一个int接收弹出来的数据
     */
    public int pop(){
        //为空
        if (isEmpty()){
            throw new RuntimeException("栈空，无法弹栈");
        }
        //取出当前数据
        int data=this.array[top];
        this.top--;
        return data;
    }

    /**
     * 栈中元素的个数
     */
    public int length(){
        return top+1;
    }
}
