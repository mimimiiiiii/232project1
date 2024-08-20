import java.util.ArrayList;
public class Student {
    String name;
    int score;

    //input is assigned to a name
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    //gets average
    public static int calcAverage(ArrayList<Integer> numbers){
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return sum / numbers.size();
    }

    // sees what grade they get
    public static void calcGrade(String name, int score) {
        if (score >= 90 && score <=100){
            System.out.println(name + " A");
        } else if (score >= 80 && score <=89) {
            System.out.println(name + " B");
        } else if (score >= 70 && score <=79) {
            System.out.println(name + " C");
        } else if (score >= 60 && score <=69) {
            System.out.println(name + " D");
        } else {
            System.out.println(name + " F");
        }
    }
}