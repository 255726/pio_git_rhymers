package edu.kis.vh.nursery;

/**
 * Klasa realizująca wyliczankę opartą na zasadzie FIFO (First In First Out).
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Przesłonięta metoda usuwająca i zwracająca element zgodnie z kolejką FIFO.
     * @return wartość usuniętego elementu
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
