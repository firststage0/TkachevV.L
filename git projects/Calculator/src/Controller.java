import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Controller {

    static double globalResult = 0;

    static void giveView(){
        View view = new View();
        System.out.println(view.View());
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    static void questionResult(){

        int question = getNumber();

        switch (question) {
            case 1 -> questionOne();
            case 2 -> questionTwo();
        }
    }

    static void questionOne(){
        System.out.println("Последний результат: " + globalResult);
    }

    static void questionTwo(){
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\t");
        System.out.println("Введите уравнение");
        String number = scanner.nextLine();

        /*Float[] numbers = numbersForCalc(number);
        String[] operands = operandsForCalc(number);

        for (int i = 0; i < numbers.length - 1; i++) {
            float first = numbers[i];
            float second = numbers[i+1];
            String operand = operands[i];
            result = forSwitch(first, second, operand);
            numbers[i+1] = result;

        }*/
        result = finalResult(number);

        globalResult = result;
        System.out.println(result);

        System.out.println("\t");

    }

    static Float[] numbersForCalc(String number){
        String regex = "[^0-9]";
        String regexedNumber = number.replaceAll(regex, " ");
        String[] mathOperation = regexedNumber.split("\\s++");
        Float[] numbers = new Float[mathOperation.length];
        for (int i = 0; i < mathOperation.length; i++){
            numbers[i] = Float.parseFloat(mathOperation[i]);
        }
        return numbers;
    }

    static String[] operandsForCalc(String number){
        String regex = "[^\\-+*/]";
        String regexedNumber = number.replaceAll(regex, "");
        String[] mathOperands = regexedNumber.split("");
        return mathOperands;
    }

    static float forSwitch(float first, float second, String operand){
        float result = 0;
        switch (operand){
            case "+" -> result = Model.summ(first, second);
            case "-" -> result = Model.subtract(first, second);
            case "/" -> result = Model.divide(first, second);
            case "*" -> result = Model.multiply(first, second);
        }
        return result;
    }


    static double finalResult(String number){

        double result = 0;

        Float[] numbers = numbersForCalc(number);
        String[] operands = operandsForCalc(number);

        ArrayList<Float> numbersList = new ArrayList<>();
        ArrayList<String> operandsList = new ArrayList<>();

        Collections.addAll(numbersList, numbers);
        Collections.addAll(operandsList, operands);

        if (operandsList.contains("*") || operandsList.contains("/")) {
            for (int i = 0; i < operandsList.size(); i++){
                if (operandsList.get(i).equals("*") || operandsList.get(i).equals("/")){
                    result = forSwitch(numbersList.get(i), numbersList.get(i + 1), operandsList.get(i));
                    operandsList.remove(i);
                    numbersList.remove(i);
                    numbersList.remove(i);
                    numbersList.add(i, (float) result);
                    i = 0;

                }
            }
        } for (int i = 0; i < operandsList.size(); i++){
            result = forSwitch(numbersList.get(i), numbersList.get(i + 1), operandsList.get(i));
            operandsList.remove(i);
            numbersList.remove(i);
            numbersList.remove(i);
            numbersList.add(i, (float) result);

            if (operandsList.size() == 1){
                result = forSwitch(numbersList.get(0), numbersList.get(1), operandsList.get(0));
            }
        }


        return result;
    }

}
