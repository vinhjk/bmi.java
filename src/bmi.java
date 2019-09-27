import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();
        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        float bmi = weight/(height*height);

        if (bmi<18.5) System.out.print("Your BMI is underweight");
        if (bmi>=18.5&&bmi<25) System.out.print("Your BMI is normal");
        if (bmi>=25&&bmi<30) System.out.print("Your BMI is overweight");
        if (bmi>=30) System.out.print("Your BMI is obese");
    }
}
