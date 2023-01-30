public class Main {
    public static void main(String[] args) {
        byte catW = 1;
        System.out.println("Значение переменной catW с типом byte равно " + catW);
        short catB = 3;
        System.out.println("Значение переменной catB с типом short равно " + catB);
        int catG = 5;
        System.out.println("Значение переменной catG с типом int равно " + catG);
        long catY = 100000000000L;
        System.out.println("Значение переменной catY с типом long равно " + catY);
        float catL = 2.5f;
        System.out.println("Значение переменной catL с типом float равно " + catL);
        double catP = 15.98765432;
        System.out.println("Значение переменной catP с типом double равно " + catP);

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Получились следующие данные: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ".");

        byte pupilLP = 23;
        byte pupilAS = 27;
        byte pupilEA = 30;
        int totalPupil = pupilLP + pupilAS + pupilEA;
        System.out.println("Всего учеников " + totalPupil);
        int paper = 480;
        int paperPupil = paper / totalPupil;
        System.out.println("На каждого ученика рассчитано " + paperPupil + " листов бумаги.");

        byte bottleIn_2minute = 16;
        int bottle_minute20 = bottleIn_2minute / 2 * 20;
        System.out.println("За 20 минут машина произвела " + bottle_minute20 + " бутылок.");
        int bottle_1Hour = bottle_minute20 * 3;
        System.out.println("За 1 час машина произвела " + bottle_1Hour + " бутылок.");
        int bottle_24Hours = bottle_1Hour * 24;
        System.out.println("За 24 часа машина произвела " + bottle_24Hours + " бутылок.");
        int bottle_3Days = bottle_24Hours * 3;
        System.out.println("За 3 дня машина произвела " + bottle_3Days + " бутылок.");
        int bottle_31Days = bottle_24Hours * 31;
        System.out.println("За 31 день машина произвела " + bottle_31Days + " бутылок.");

        byte jar = 120;
        byte jar_classroom1 = 6;
        byte jarWhite_classroom1 = 2;
        byte jarBrown_classroom1 = 4;
        int inTotal_classroom = jar / jar_classroom1;
        int inTotal_jarWhite = inTotal_classroom * jarWhite_classroom1;
        int inTotal_jarBrown = inTotal_classroom * jarBrown_classroom1;
        System.out.println("В школе, где " + inTotal_classroom + " классов, нужно " + inTotal_jarWhite + " банок белой краски и " + inTotal_jarBrown + " банок коричневой краски.");

        byte banana1 = 80;
        byte milk_ml100 = 105;
        byte plombir1 = 100;
        byte egg1 = 70;
        int cocktail_gr = banana1 * 5 + milk_ml100 * 2 + plombir1 * 2 + egg1 * 4;
        float coctail_kg = cocktail_gr / 1000f;
        System.out.println("1 коктейль будет весить " + cocktail_gr + " грамм. Если перевести в килограммы, то будет весить " + coctail_kg + " килограмм.");

        int excessWeight_kg = 7000;
        int minWightLoss = 250;
        int maxWightLoss = 500;
        double maxDays = (double) excessWeight_kg / minWightLoss;
        double minDays = (double) excessWeight_kg / maxWightLoss;
        double lossWeightPerDayAverage = (double) (minWightLoss + maxWightLoss) / 2;
        double averageNumberDays = (double) excessWeight_kg / lossWeightPerDayAverage;
        System.out.println("Если спорсмен будет сбрасывать 250 гр в день, то за " + maxDays + " дней спортсмен сможет войти в свою весовую категорию. Если по 500 грамм, то за " + minDays + " дней. В среднем у спортсмена может уйти " + averageNumberDays + " дней.");

        int salary_M = 67760;
        int salary_D = 83690;
        int salary_C = 76230;
        int salary_M_10p = salary_M / 10;
        int salary_D_10p = salary_D / 10;
        int salary_C_10p = salary_C / 10;
        int increasedMonthlySalary_M = salary_M + salary_M_10p;
        int increasedMonthlySalary_D = salary_D + salary_D_10p;
        int increasedMonthlySalary_C = salary_C + salary_C_10p;
        int annualIncome_M = 12 * salary_M;
        int annualIncome_D = 12 * salary_D;
        int annualIncome_C = 12 * salary_C;
        int annualIncome_withIncrease_M = 12 * increasedMonthlySalary_M;
        int annualIncome_withIncrease_D = 12 * increasedMonthlySalary_D;
        int annualIncome_withIncrease_C = 12 * increasedMonthlySalary_C;
        int incomeDifferenceYear_M = annualIncome_withIncrease_M - annualIncome_M;
        int incomeDifferenceYear_D = annualIncome_withIncrease_D - annualIncome_D;
        int incomeDifferenceYear_C = annualIncome_withIncrease_C - annualIncome_C;
        System.out.println("Маша теперь получает " + increasedMonthlySalary_M + " рублей. Годовой доход вырос на " + incomeDifferenceYear_M + " рублей.");
        System.out.println("Денис теперь получает " + increasedMonthlySalary_D + " рублей. Годовой доход вырос на " + incomeDifferenceYear_D + " рублей.");
        System.out.println("Кристина теперь получает " + increasedMonthlySalary_C + " рублей. Годовой доход вырос на " + incomeDifferenceYear_C + " рублей.");
    }
}