import java.util.*;

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {

        // Score decreasing order
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

        // Name alphabetical order
        return a.name.compareTo(b.name);
    }
}

class Player{
