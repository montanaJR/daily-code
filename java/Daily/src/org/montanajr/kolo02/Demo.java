package org.montanajr.kolo02;



public class Demo {


    public String interpret(String str){
        Expression exp = null;
        String result = "";
        InterpreterContext ic = null;
        if(str.length() == 12 ) {
            exp = new Interp(str);
            if(str.substring(str.length() - 1,str.length()).equalsIgnoreCase("M")){
                ic = new MenContext();
                result = exp.interpret(ic);

            } else if(str.substring(str.length() - 1,str.length()).equalsIgnoreCase("K")) {
                ic = new WomenContext();
                result = exp.interpret(ic);


            } else {
                System.out.println("UWAGA! Nieoznaczona plec.");
            }
        }

        return result ;
    }

    public static void main(String[] args) {
        String str1 = "H1.84W87L24M";
        String str2 = "J1.65W55L27K";
        String str3 = "A1.33W35L14K";
        String str4 = "G1.33W33L16N";

        Demo ec = new Demo();
        System.out.println(str1 +" = " + ec.interpret(str1));
        System.out.println(str2 +" = " + ec.interpret(str2));
        System.out.println(str3 +" = " + ec.interpret(str3));
        System.out.println(str3 +" = " + ec.interpret(str4));

    }
}
