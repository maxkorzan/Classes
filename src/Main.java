public class Main {
    public static void main(String[] args) {
        Burrito b = new Burrito();
        Veggies v = new Veggies();

        b.setBean("Black Beans");
        b.setMeat("Chicken");
        b.setRice("White Rice");
        v.setFajitas(false);  //do we want lettuce or fajitas in our burrito?
        v.setLettuce(true);
        b.setVeggies(v);

        System.out.println(b.getBean());
        System.out.println(b.getMeat());
        System.out.println(b.getRice());

        System.out.println("Fajitas: "+ b.getVeggies().isFajitas());
        System.out.println("Lettuce: "+ b.getVeggies().isLettuce());

    }
}
