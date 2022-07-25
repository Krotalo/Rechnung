import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите уравнение: ");
        String input = in.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input){
        String [] element = input.split(" ");
        if (element.length != 3) {return "throws Exception";}
        try {
            int erst = Integer.parseInt(element[0]);
            int zwei = Integer.parseInt(element[2]);
            if (erst < 1 || erst > 10) {return "throws Exception";}
            if (zwei < 1 || zwei > 10) {return "throws Exception";}
            int result = 0;
            switch (element[1]){
                case "+" :
                    result = erst + zwei;
                    break;
                case  "-" :
                    result = erst - zwei;
                    break;
                case "*" :
                    result = erst * zwei;
                    break;
                case "/" :
                    result = erst / zwei;
                    break;
            }
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            String [] romanic = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            int erst = 0;
            int zwei = 0;
            for (int i = 0; i < romanic.length; i++) {
                if (romanic[i].equals(element[0])) {erst = i + 1;}
                if (romanic[i].equals(element[2])) {zwei = i + 1;}
            }
            if (erst == 0 || zwei == 0) {
            return "throws Exception";}
            int result = 0;
            switch (element[1]){
                case "+" :
                    result = erst + zwei;
                    break;
                case  "-" :
                    result = erst - zwei;
                    break;
                case "*" :
                    result = erst * zwei;
                    break;
                case "/" :
                    result = erst / zwei;
                    break;
            }
            if (result < 1) {return "throws Exception";}
            String getLos = "";
            if (result == 100) {return "C";}
            if (result > 89) {getLos = "XC"; result = result - 90;}
            if (result > 49) {getLos = "L"; result = result - 50;}
            if (result > 39) {getLos = "XL"; result = result - 40;}
            for (int i = 0; i < 3; i++) {
                if (result > 9) {getLos = getLos + "X"; result = result - 10;}
            }
            if (result > 0) {
                    getLos = getLos + romanic[result-1];}
            return getLos;
        }
    }
    }