public class Inventory {
    
    public void useItem(Hero h, String item){
        if(item.equalsIgnoreCase("Health Potion")){
            System.out.println("You used a potion and restored health!");
        }else{
            System.out.println("Item not recognized.");
        }
    }

    public void useItem(Hero h, int healAmount) {
        h.health += healAmount;
        System.out.println(h.name + " heals for " + healAmount + " points! Current health: " + h.health);
    }
}
