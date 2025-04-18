package test;

    import domain.Exercise;

    /**
     * Клас для тестування підрахунку кількості щасливих квитків.
     */
    public class TestResult {

        public static void main(String[] args) {

            // Виводимо кількість щасливих квитків
            System.out.println("Кількість щасливих трамвайних квитків: " + Exercise.countLuckyTickets());
        }
    }
