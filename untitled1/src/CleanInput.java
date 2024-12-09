class CleanInput {
    public String fixString(String str) {
        if (str == null || str.isBlank()) {
            System.out.println("Вы ничего не ввели!");
        }
        return str.trim();
    }
}