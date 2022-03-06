package com.coek;

import java.util.Scanner;

/**
 * @Author:MaakcoekVine
 * @Date:2022-01-08 20:09:12
 */
public class StackTest {

    public static void main(String[] args) {

        StackTest st=new StackTest();
        boolean aba = st.isPalindrome("aba");
        System.out.println(aba);
        /*
            实现回文：aba
         */
    }
    public boolean isPalindrome(String val){

        boolean flag=false;
        //获取字符串长度
        int strLength=val.length();
        //初始化
        ArrayStack arrayStack=new ArrayStack(strLength);
        for (int i=0;i<strLength;i++){
            //取出strLength中的每个字符
            char c = val.charAt(i);
            //压栈
            arrayStack.push(c);
        }
        String newStr="";
        //获取此时栈中元素个数
        int arraylength = arrayStack.length();
        for (int i=0;i<arraylength;i++){
            if (!arrayStack.isEmpty()){
                //弹栈
                char pop = (char) arrayStack.pop();
                newStr+=pop;
                //newStr+=pop;
            }
        }
        if (val.equals(newStr)){

            flag=true;
        }
        return flag;
    }

}
