package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int Twelve = 12;
    public static final int MinusOne = -1;
    public static final int Eleven = 11;

    private int[] numbers = new int[Twelve];

    private int total = MinusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MinusOne;
    }

    public boolean isFull() {
        return total == Eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return MinusOne;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MinusOne;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
