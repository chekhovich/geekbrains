package Lesson5;

public class User_HomeWork {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Иванов Иван Иванович";
        user.position = "Инженер";
        user.email = "ivanov@yandex.ru";
        user.tel = "89173654527";
        user.pay = 100000;
        user.age = 35;
        System.out.println("Сотрудник: " + user.name);
        System.out.println("Должность: " + user.position);
        System.out.println("email: " + user.email);
        System.out.println("Телефон: " + user.tel);
        System.out.println("Зарплата: " + user.pay);
        System.out.println("Возраст: " + user.age);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван", "Инженер", "ivanov@yandex.ru", "89161111111", 90000, 35);
        persArray[1] = new Employee("Баранов Руслан", "Директор", "baranov@yandex.ru", "89162111111", 190000, 45);
        persArray[2] = new Employee("Зайцева Лидия", "Секретарь", "zaiceva@yandex.ru", "89161141111", 60000, 25);
        persArray[3] = new Employee("Кириллов Олег", "Заместитель директора", "kirillov@yandex.ru", "89161135111", 150000, 41);
        persArray[4] = new Employee("Иванова Наталия", "Разработчик", "ivanova@yandex.ru", "89161198711", 130000, 37);
        int persArrayLenght = persArray.length;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }
    }

}

