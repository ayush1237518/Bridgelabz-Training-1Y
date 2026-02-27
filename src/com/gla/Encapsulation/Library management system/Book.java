
 class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;   
    }
    
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
        }
    }

    
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
