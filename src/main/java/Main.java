//fixses #6 close
public class Main {
    public static void main(String[] args) {
        Burger chefBurger = new Burger();
        chefBurger.name = "chef";
        chefBurger.id = 2384;
        chefBurger.price = 129;
        chefBurger.weight = 213;
        chefBurger.kcal = 236;
        System.out.println(chefBurger.id);


        Burger longerBBQ = new Burger();
        longerBBQ.id = 1018;
        longerBBQ.price = 50;
        longerBBQ.weight = 107;
        longerBBQ.kcal = 236;
        System.out.println(longerBBQ.weight);


        Burger chefBurgerJunior = new Burger();
        chefBurgerJunior.id = 2962;
        chefBurgerJunior.price = 99;
        chefBurgerJunior.weight = 174;
        chefBurgerJunior.kcal = 244;
        System.out.println(chefBurgerJunior.kcal);


    }
}
