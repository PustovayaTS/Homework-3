public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание №2");
        String uppercase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + uppercase);

        System.out.println("Задание №3");
        fullName = "Иванов Семён Семёнович";
        String replacement = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + replacement);


    }
}