package ad.java_level_1;

public class Main {

    public static void main(String[] args) {
        char chr = 'a';
        String str1 = "text1";
        int nine = 9;
        float dsz = 12345.56F;
        boolean yes = true;
        byte hts = -120;
        short dsz1 = 30127;
        long dsz2 = 18L;
        double fs = 5.7D;
        CalcExpression(1.564F, 3.1F, 4.3F, 3.3F);
        CheckInteger(12, 18);
        System.out.println(CheckPosNeg(5));
        System.out.println(CheckBolNum(-4));
        System.out.println("Привет, " + PrivetM("Ivanopulo") + "!");
        CheckLeapYear(2400);
    }

    static void CalcExpression(float a, float b, float c, float d) {
        float result = a * (b + c / d);
        System.out.println("Result: " + result);
    }

    static void CheckInteger(int FirstI, int SecondI) {
        boolean result = FirstI + SecondI >= 10 && FirstI + SecondI <= 20;
        System.out.println(result);
    }

    static String CheckPosNeg(int Chislo) {
        String result;
        if (Chislo >= 0) {
            result = "Positive Number";
        } else {
            result = "Negative number";
        }

        return result;
    }

    static boolean CheckBolNum(int TselCh) {
        boolean result = TselCh >= 0;
        return result;
    }

    static String PrivetM(String nname) {
        return nname;
    }

    static void CheckLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " non-leap year");
        }

        }
    }

