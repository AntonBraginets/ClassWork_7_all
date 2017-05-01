package Task2;

class Author {
    String author = "This is the name of Book's Author";

    public Author(String author) {//конструктор
        this.author = author;
    }

    Author() {//конструктор по умолчанию
    }

    void Show() {
        System.out.println(author);
    }
}
