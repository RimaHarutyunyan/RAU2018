package durak_game;

public class Rank {

    private static final int RANK_OFFSET = 11;
    private static final int MAX_RANK = 14;

    private final int rankInt;

    public Rank(int rankInt) {
        if (rankInt > 0 && rankInt <= MAX_RANK) {
            this.rankInt = rankInt;
        } else {
            throw new IllegalArgumentException("Illegal rank number.");
        }
    }

    public int getRankInt() {
        return rankInt;
    }

    public static int getMaxRank() {
        return MAX_RANK;
    }

    public static int getRankOffset() {
        return RANK_OFFSET;
    }

    public int compareTo(final Rank that) {
        return this.rankInt - that.getRankInt();
    }

    public boolean equals(final Rank that) {
        return this.rankInt == that.getRankInt();
    }

    public String toString() {
        if (rankInt < RANK_OFFSET) {
            return String.valueOf(rankInt);
        }
        return String.valueOf("JQKA".charAt(rankInt - RANK_OFFSET));
    }
}
