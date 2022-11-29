public class Main {
        public static void main(String[] args) {
            String firstName = "Иван";
            String middleName = "Иванович";
            String lastName = "Иванов";
            String separator = " ";
            String fullName = String.join(separator, lastName, firstName, middleName);
            System.out.println("ФИО сотрудника — " +fullName+ ".");
            String fullName1 = "Ivanov Ivan Ivanovich";
            System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName1.toUpperCase());
            fullName1 = "Иванов Семён Семёнович".replace("ё","е");
            System.out.println(fullName1);

        }
    }