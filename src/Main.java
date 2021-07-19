import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // GPA = grade point average
        System.out.println("Hello");

        int age = 26;
        String name = "Philipp Jungreithmayr";
        double gpa = 1.6;
        LocalDate birthday = LocalDate.of(1995, 6, 5);
        boolean married = false;
        char sex = 'm';

        System.out.println("Mein Name ist " + name + "! Ich bin " + age + " Jahre alt und bin am " + birthday + " geboren.");
        System.out.print("Ich habe mich für das Geschlecht ");
        if (sex == 'm') {
            System.out.println("männlich entschieden!");
        }else if(sex == 'w') {
            System.out.println("weiblich entschieden!");
        }else{
            System.out.println("1 von vielen entschieden");
        }
        System.out.println("Mein Notendurchschnitt in der Schule lag bei " + gpa);

        if (married = false) {
            System.out.println("Ich bin nicht verheiratet!");
        }else {
            System.out.println("Ich bin verheiratet!");
        }
    }
}