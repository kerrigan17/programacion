package ejercicio4;

class Item {
    String title;
    String type;

    public Item(String title, String type){
        this.title=title;
        this.type=type;
    }

    public String toString() {
        return "Tipo: " + type + "\n Titulo: " + title;
    }
}
