public class LibrarySystem {

    // Book Class
    static class Book {
        private String title;
        private String author;
        private String ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public void displayBook() {
            System.out.println("Book Title : " + title);
            System.out.println("Author     : " + author);
            System.out.println("ISBN       : " + ISBN);
        }
    }

    // Member Class
    static class Member {
        private String name;
        private int memberId;

        public Member(String name, int memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        public void displayMember() {
            System.out.println("Member Name : " + name);
            System.out.println("Member ID   : " + memberId);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", "123456");
        Member member1 = new Member("Sneha", 101);

        System.out.println("----- Book Details -----");
        book1.displayBook();

        System.out.println("\n----- Member Details -----");
        member1.displayMember();
    }
}