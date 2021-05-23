import java.util.Arrays;

public class User {
    private String firstName;
    private static String lastName;
    private static int userAge;
    private static String creditStoryPersent;
    private static String date;
    private static String jobAvailability;
    private int idClient;
    private static int clientCount = 0;
    public User(String firstName, String lastName, String date, String creditStoryPersent, String jobAvailability){
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.userAge = ageCalculating(date);
        this.creditStoryPersent = creditStoryPersent;
        this.jobAvailability = jobAvailability;
        this.idClient = clientCount++;
    }
    public void printperson(){
        System.out.println("Имя:" + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + userAge);
        System.out.println("Наличие работы: " + jobAvailability);
        System.out.println("Кредитная история: " + creditStoryPersent);
    }
    private int ageCalculating(String dateOfBirth){ //Функция работает
        int nowDate = 2021;
        date.split(".");
        int age = nowDate - Integer.parseInt(date.substring(6));
        return age;
    }
    
}
