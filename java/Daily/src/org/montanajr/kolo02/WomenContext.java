package org.montanajr.kolo02;

public class WomenContext implements InterpreterContext {
    @Override
    public String launchDecoder(String code) {
        if(code.isEmpty()){
            return "-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(code.substring(1, 5));
        sb.append("cm wzrostu, ");
        sb.append(code.substring(6, 8));
        sb.append("kg wagi, ");
        sb.append(code.substring(9, 11));
        sb.append("lata, kobieta");

        return sb.toString();
    }
}
