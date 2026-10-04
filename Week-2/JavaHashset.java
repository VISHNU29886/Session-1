HashSet<String> pairs = new HashSet<>();

for (int i = 0; i < t; i++) {
    String pair = pair_left[i] + " " + pair_right[i];

    pairs.add(pair);

    System.out.println(pairs.size());
}
for (int i = 0; i < t; i++) {
    pair_left[i] = s.next();
    pair_right[i] = s.next();
}

// Write your code here

HashSet<String> pairs = new HashSet<>();

for (int i = 0; i < t; i++) {
    String pair = pair_left[i] + " " + pair_right[i];

    pairs.add(pair);

    System.out.println(pairs.size());
}
