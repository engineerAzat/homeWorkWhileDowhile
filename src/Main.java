public class Main {
    public static void main(String[] args) {

        // Первое задание

        System.out.println("\nTask 1\n");
        int sum = 0;
        int month = 1;
        while (sum < 2_459_000) {
            sum = sum + 15_000;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");

        // Второе задание

        System.out.println("\nTask 2\n");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");

        }

        // Третье задание

        System.out.println("\n\nTask 3\n");
        int populationOfTheCountry = 12_000_000;     // Население страны Y
        int populationGrowth = 17;     // Рождаемость населения на 1000 человек
        int populationDecline = 8;   // Убыль населения на 1000 человек
        int totalGrowth = populationGrowth - populationDecline;    // Прирост населения на 1000 человек
        for (i = 1; i<=10; i++) {       // цикл for
            populationOfTheCountry = (populationOfTheCountry + (totalGrowth * (populationOfTheCountry / 1000)));
            System.out.println("Год " + i + ", численность населения составляет" + populationOfTheCountry);
        }

        // Четвертое задание

        System.out.println("\nTask 4\n");
        double sumOne = 15_000;  // Ежемесячный вклад
        int monthOne = 1;   // месяцы
        while (sumOne < 12_000_000) {
            sumOne = sumOne + sumOne * 0.07;
            monthOne ++;
            System.out.println("В " + monthOne + " месяц накоплено " + sumOne );
        }

        // Пятое задание

        System.out.println("\nTask 5\n");
        double sumTwo = 15_000;  // Ежемесячный вклад
        int monthTwo = 1;   // месяцы
        while (sumTwo < 12_000_000) {
            sumTwo = sumTwo + sumTwo * 0.07;
            monthTwo++;
            if (monthTwo % 6 == 0) {
                System.out.println("В " + monthTwo + " месяц накоплено " + sumTwo);
            }
        }


        // Шестое задание

        System.out.println("\nTask 6\n");
        double sumThree = 15_000;  // Ежемесячный вклад
        int monthThree = 1;   // месяцы
        for (; monthThree <= 108; monthThree++) {
            sumThree = sumThree + sumThree * 0.07;
                if (monthThree % 6 == 0) {
                System.out.println("В " + monthThree + " месяц накоплено " + sumThree);
            }
        }

        // Седьмое задание

        System.out.println("\nTask 7\n");
        for (int day = 2; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        // Восьмое задание

        System.out.println("\nTask 8\n");
        int start = 1824;
        int finish = 2124;
        for (int Year = 0; Year <= 2124; Year += 79){
            if (Year >= start && Year <= finish) {
                System.out.println(Year);
            }

        }






    }
}