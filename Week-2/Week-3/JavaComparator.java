class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {

        // Higher score first
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

        // Same score -> alphabetical order
        return a.name.compareTo(b.name);
    }
}
