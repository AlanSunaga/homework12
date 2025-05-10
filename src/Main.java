//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Андрей", "Платонов ");

        Author author2 = new Author("Антон", "Чехов");

        Book book1 = new Book("Маленький солдат", author1, 1943);
        Book book2 = new Book("Степь", author2, 1888);


        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        book2.setYearPub(2005);
        System.out.println("Измененный год публикации: " + book2.getYearPub());
    }
}