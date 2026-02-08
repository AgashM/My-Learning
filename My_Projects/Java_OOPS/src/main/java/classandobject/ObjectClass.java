package classandobject;

import java.util.Objects;

class Book implements Cloneable{
    int bookId;
    String bookName;
    String authorName;

    public Book(int id, String bn, String an){
        this.bookId = id;
        this.bookName = bn;
        this.authorName = an;
    }

    @Override
    public Book clone() {
        try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, authorName);
    }
}

public class ObjectClass {
    public static void main(String[] args) {

        Book book = new Book(1001,"I too had a love story", "Ravinder Singh");
        System.out.println(book);

        Book anotherBook = book.clone();
        System.out.println(anotherBook);

        System.out.println(book.equals(anotherBook));

        System.out.println(book.hashCode());
        System.out.println(anotherBook.hashCode());

    }
}
