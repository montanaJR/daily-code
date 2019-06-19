package org.montanajr.lab07.zad02;

public class Demo {
    public InterpreterContext ic;

    public Demo(InterpreterContext i){
        this.ic=i;
    }

    public String interpret(String str){
        Expression exp = null;
        if(str.contains("Hexadecimal")){
            exp=new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else return str;

        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Hexadecimal";

        Demo ec = new Demo(new InterpreterContext());
        System.out.println(str1+"= "+ec.interpret(str1));
    }

}
