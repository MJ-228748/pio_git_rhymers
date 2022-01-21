package edu.kis.vh.nursery;

/**
 * Klasa obsługuje grę w wyliczankę
 */
public class DefaultCountingOutRhymer {




    private static final int FULL = 11;
	private static final int SIZE = 12;
	private static final int COUNTER = -1;
	private final int[] numbers = new int[SIZE];
    public int total = COUNTER;

    public int getTotal() {
        return total;
    }

    /**
     * Funkcja wprowadza liczbę do tablicy
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Funkcja sprawdza czy są elementy w tablicy
     * @return
     */
    public boolean callCheck() {
        return total == COUNTER;
    }

    /**
     *Funkcja sprawdza czy tablica jest pełna
     * @return
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     *Funkcja zwraca ostatnią liczbę
     * @return
     */

    int peekaboo() {
        if (callCheck())
            return COUNTER;
        return numbers[total];
    }

    /**
     *Funkcja usuwa ostatnią liczbę
     * @return
     */
    public int countOut() {
        if (callCheck())
            return COUNTER;
        return numbers[total--];
    }

}
