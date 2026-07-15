package com.examples.Collection;

public class VarArgs {
    public static String concatenateString(String ...str){
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenateString("hello"));
        System.out.println(concatenateString("I'm","about","to"));
        System.out.println(concatenateString("get","rich"));
    }
}
