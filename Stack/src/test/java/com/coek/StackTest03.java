package com.coek;

import java.io.FileInputStream;

/**
 * @Author:MaakcoekVine
 * @Date:2022-02-22 22:09:14
 */


public class StackTest03 {
    public static void main(String[] args) {
//        fourBitBinary(15);
        eightBitBinary(30);
//        FileInputStream fis=new FileInputStream("s")

    }

    /**
     * 利用栈实现四个位的二进制转换
     */
    public static void fourBitBinary(int num){
        //假如num是10，则二进制为1010
        ArrayStack arrayStack=new ArrayStack(5);
        //入栈
        while (true){
            if (num==0){
                break;
            }
            int result=num%2;
            arrayStack.push(result);
            num=num/2;
        }

        //出栈
        StringBuilder str=new StringBuilder();
        while(!arrayStack.isEmpty()){
            int pop = arrayStack.pop();
            str.append(pop) ;

        }
        while(str.length()<4){
                str.insert(0,"0");
        }
        System.out.println(str);
    }

    public static void eightBitBinary(int num){
        ArrayStack arrayStack=new ArrayStack(10);
        while (true){
            if (num==0){
                break;
            }
            int result=num%2;
            //入栈
            arrayStack.push(result);
            num/=2;
        }
        StringBuilder sb=new StringBuilder();
        while (!arrayStack.isEmpty()){
            //出栈
            int pop = arrayStack.pop();
            sb.append(pop);
        }

        //往字符串前面追加0
        while (sb.length()<8){
            sb.insert(0,"0");
        }
        sb.insert(4," ");
        System.out.println(sb);
    }
}
