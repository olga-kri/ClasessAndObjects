public class Main {
    public static void main(String[] args) {
        Author sapkovsky = new Author("Анджей", "Сапковский");
        Author lukyanenko = new Author("Сергей","Лукьяненко");
        Book vedmak = new Book("Ведьмак", sapkovsky, 2022);
        Book sumerecnyiDozor = new Book("Сумеречный дозор", lukyanenko, 2004);
        vedmak.setYearOfPublication(1998);
        System.out.println(sapkovsky.getName() + " "+ sapkovsky.getLastName()+ ", " + vedmak.getBookTitle() + ", " + vedmak.getYearOfPublication());
        System.out.println(lukyanenko.getName() + " "+ lukyanenko.getLastName()+ ", " + sumerecnyiDozor.getBookTitle() + ", " + sumerecnyiDozor.getYearOfPublication());

    }
}