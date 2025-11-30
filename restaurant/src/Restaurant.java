public class Restaurant {
    private final String name;
    private boolean isOpen;

    Restaurant(String name) {
        this.name = name;
        this.isOpen = false;
    }

    public String getName(){
        return this.name;
    }
    public void openRestaurant(){
        this.isOpen = true;
        System.out.println(name + " is now open!");
    }

    public void closeRestaurant(){
        this.isOpen = false;
        System.out.println(name + " is now closed! See you next time!");
    }
}
