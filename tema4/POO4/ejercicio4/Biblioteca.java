package ejercicio4;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> items;

    public Biblioteca(){
        items = new ArrayList<>();
    }

    public void addItem(String title){
        items.add(new Item(title));
        System.out.println("Item creado");
    }

    public void buscarItem(String title){
        boolean found = false;

        for(Item item : items){
            if (item.title.equalsIgnoreCase(title)) {
                System.out.println("Item encontrado!! " + "\n"+item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ítem no encontrado.");
        }
    }

    public void deleteItem (String title){
        for (int i =0; i<items.size(); i++){
            if(items.get(i).title.equalsIgnoreCase(title));
            items.remove(i);
            System.out.println("Item eliminado");
            return;
        }
        System.out.println("Ítem no existe.");
    }
    public void listItems(){
        System.out.println("Lista de items:");
        for(Item item : items){
            System.out.println(item);
        }
    }
}
