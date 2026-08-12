package week1.day1;

public class SalaryBonus {
    public static void main(String[] args) {
        int salary = 8500;
        int bonus;

        if (salary > 10000) {
            bonus = 2000;
        } else if (salary > 7000) {
            bonus = 1000;
        } else {
            bonus = 500;
        }

        System.out.println("Salary: " + salary + ", Bonus: " + bonus);
    }
}