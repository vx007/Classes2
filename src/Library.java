public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookName;
                break;
            }
        }
    }

    @Override
    public String toString(){
        String output = "Library:\n";
        for (Book element : books){
            output = output + element + "\n";
        }
        return output;
    }
}
