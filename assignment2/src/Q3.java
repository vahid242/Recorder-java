// wap to display BMI
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        float weight, height, bmi;
        String result="";
        Scanner input = new Scanner(System.in);
//        prompt user enter input
        System.out.println("enter weight(lb): ");
        weight = input.nextFloat();
        System.out.println("enter height(in): ");
        height = input.nextFloat();

//        process
        bmi = (weight / (int) Math.pow(height,2)) * 703.0f;
        if(bmi < 15){
            result = "Very severely underweight";
        }
        else if(bmi>=15 && bmi < 16){
            result = "Severely underweight";
        }
        else if(bmi>=16 && bmi < 18.5){
            result = "Underweight";
        }
        else if(bmi>=18.5 && bmi < 25){
            result = "Normal (healthy weight)";
        }
        else if(bmi>=25 && bmi < 30){
            result = "Overweight";
        }
        else if(bmi>=30 && bmi < 35){
            result = "Moderately obese";
        }
        else if(bmi>=35 && bmi < 40){
            result = "Severely obese";
        }
        else if(bmi>=40){
            result = "Very severely obese";
        }

//        print output

        System.out.println(result);
    }
}
