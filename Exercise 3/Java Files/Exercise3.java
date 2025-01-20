public class Exercise3 {
        public static void main(String[] args) {
            System.out.println("Hello, World!");

            //Car
            Car C2 = new Car("Ford","Red",2001);

            System.out.println("Original Name: "+C2.getName());
            C2.setName("Toyota");
            System.out.println("Updated Name: "+C2.getName()+"\n");


            //Book
            Book b1 = new Book();

            System.out.println("Origional book name: "+b1.getName());
            b1.setName("The Burning Bridge");
            b1.setPublished(2005);
            System.out.println("Updated book name: "+b1.getName());
        }
}