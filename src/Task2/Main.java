package Task2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(); //если есть конструктор по умолчанию, мы ничего здесь не задаем
        Content content = new Content();//если конструктора по умолчанию нет - Нужно задавать значение
        Title title = new Title();

        System.out.println("Initial book data:");

        Book book1 = new Book(author, content, title);
        book1.getAuthor().Show();
        book1.getContent().Show();
        book1.getTitle().Show();

        System.out.println();
        System.out.println("Amended book data:");
        book1.setAuthor(new Author("This is the new Author of the Book"));
        book1.getAuthor().Show();
        book1.setContent(new Content("This is the new Content of the Book"));
        book1.getContent().Show();
        book1.setTitle(new Title("This is the new Title of the book"));
        book1.getTitle().Show();
    }
}

