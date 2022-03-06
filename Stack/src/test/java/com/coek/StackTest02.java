package com.coek;

import java.util.Scanner;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-08 20:41:22
 */
public class StackTest02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayStack arrayStack=new ArrayStack(3);
        for (int i=0;i<3;i++){
            System.out.println("请输入3个数");
            arrayStack.push(s.nextInt());
        }
        //获取当前栈长度
        int arrayLength = arrayStack.length();
        for (int i=0;i<arrayLength;i++){
            if (!arrayStack.isEmpty()){
                char  pop = (char) arrayStack.pop();
                 String str = String.valueOf(pop);
                System.out.println(str);
            }
        }
    }
}
