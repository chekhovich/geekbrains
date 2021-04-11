package Lesson5;

    public class Employee {
        String name;
        String position;
        String email;
        String tel;
        int pay;
        int age;

    public Employee(String name, String position, String email, String tel, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }


    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                    name, position, email, tel, pay, age);}

        // это метод вывода в консоль (как по заданию)
        public void print(){
            System.out.println(this);
        }

}



