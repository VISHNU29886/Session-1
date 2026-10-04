public static String findDay(int month, int day, int year) {
    Calendar calendar = Calendar.getInstance();

    calendar.set(year, month - 1, day);

    return calendar.getDisplayName(
        Calendar.DAY_OF_WEEK,
        Calendar.LONG,
        Locale.ENGLISH
    ).toUpperCase();
}
