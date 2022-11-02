import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        int deposit = 15_000;
        int mounth = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            total = total + total/100;
            mounth++;
            if (total >= 2_459_000)
                System.out.println("1 Задача: Месяц: " + mounth + ", Сумма накоплений равна: " + total);
        }
        int i = 0;
        System.out.println("2 Задача: ");
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        int population = 12_000_000;
        int birth = 17 * 12_000;
        int death = 8 * 12_000;
        int rise = birth - death;
        int year = 0;
        while (year < 10){
            population = population + rise;
            year++;
            if (year == 10)
                System.out.println("\n3 Задача: Год " + year + " , численность населения составляет " + population);
        }
        int deposit2 = 15_000;
        int total2 = 0;
        int mounth2 = 0;
        while (total2 < 12_000_000) {
            total2 = total2 + deposit2;
            total2 = total2 + ((total2 / 100) * 7);
            mounth2++;
            if (mounth2 % 6 == 0)
                System.out.println("4, 5 Задача: Месяц: " + mounth2 + ", Сумма накоплений равна: " + total2);
        }
        int deposit3 = 15_000;
        int total3 = 0;
        int mounth3 = 0;
        while (mounth3 < 108){
            total3 = total3 + deposit3;
            total3 = total3 + ((total3 / 100) * 7);
            mounth3++;
            if (mounth3 % 6 == 0)
                System.out.println("6 Задача: Месяц: " + mounth3 + ", Сумма накоплений равна: " + total3);
        }
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int friday = scanner.nextInt();
        while (day < 31) {
            day++;
            if (day % 7 == friday)
                System.out.println("7 Задача: Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        int year2 = 0;
        int comet;
        int period = 79;
        while (year2 != 10000) {
            comet = period + year2;
            year2++;
            if (comet % 79 == 0 && year2 > 1800 && year2 < 2000)
                System.out.println("8 Задача: " + comet);
        }
        int naDva = 2;
        int chislo = 0;
        int ravno;
        while (chislo < 10){
            chislo++;
            ravno = naDva * chislo;
            System.out.println("9 Задача: " + naDva + " * " + chislo + " = " + ravno);
        }
    }
}