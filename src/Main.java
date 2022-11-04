public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        mom.happyBirthday();

        System.out.println("У " + mom + " есть сын, " + son);

        boolean res = mom.hasAddress();
        boolean res2 = mom.hasAge();
        boolean res3 = son.hasAge();
        boolean res4 = son.hasAddress();


        System.out.println(res + " " + res2 + " " + res3 + " " + res4);


        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
