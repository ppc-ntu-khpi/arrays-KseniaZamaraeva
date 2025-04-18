package domain;

/**
 * Клас для обчислення кількості "щасливих" трамвайних квитків.
 * Щасливий квиток — це такий, у якого сума перших трьох цифр дорівнює сумі останніх трьох цифр.
 */
public class Exercise {

    /**
     * Обчислює кількість щасливих квитків з номерами від 000000 до 999999.
     * Щасливий квиток - це такий, у якого сума перших трьох цифр дорівнює сумі останніх трьох.
     * 
     * @return кількість щасливих квитків
     */
    public static int countLuckyTickets() {
        int luckyTicketCount = 0;

        // Перебір всіх можливих номерів квитків (від 000000 до 999999)
        for (int ticketNumber = 0; ticketNumber <= 999999; ticketNumber++) {
            // Перетворення номеру квитка на рядок з 6 символів
            String ticket = String.format("%06d", ticketNumber);

            // Розподіляємо на дві частини: перші 3 цифри та останні 3 цифри
            int firstSum = 0;
            int secondSum = 0;

            for (int i = 0; i < 3; i++) {
                firstSum += ticket.charAt(i) - '0';  // Перша частина
                secondSum += ticket.charAt(i + 3) - '0';  // Друга частина
            }

            // Якщо суми рівні, квиток щасливий
            if (firstSum == secondSum) {
                luckyTicketCount++;
            }
        }

        return luckyTicketCount;
    }
}
