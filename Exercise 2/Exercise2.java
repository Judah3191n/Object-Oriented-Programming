public class Exercise2 {
        public static void main(String[] args) {
            System.out.println("Hello, World!");

            //Books
            Book book = new Book();
            System.out.println(book.publicBooks[1]);
            System.out.println(book.protectedBooks[1]);


            //Car
            Car C1 = new Car();
            C1.name = "Tesla";
            C1.color = "red";
            C1.model = 2025;
            
            Car C2 = new Car();
            C2.name = "Kia";
            C2.color = "Green";
            C2.model = 2023;
            
            System.out.println(C2.getName());
            C2.setName("Toyota");
            System.out.println(C2.getName());

        }
}