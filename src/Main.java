import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        registration();

    }
    public static void registration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Зарегестрируйтесь в системе");
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите вашу дату рождения: ");
        String datebirth = scanner.nextLine();
        System.out.print("Сколько у вас кредитов на данный момент не погашенно: ");
        String creditOn = scanner.nextLine();
        System.out.print("Вы работаете на данный момент: ");
        String haveWork = scanner.nextLine();
        User user = new User(name, lastName, datebirth, creditOn, haveWork);
    }
    public static void info(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проверка статуса одобрения кредита.");
        System.out.print("Введите ваше имя и фамилию через пробел: ");
        String creditCheck = scanner.nextLine();
    }
}
