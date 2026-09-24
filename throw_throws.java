class UserdefinedException extends Exception {
    UserdefinedException() {
        super("User defined exception");
        System.out.println("User defined exception");
    }
}