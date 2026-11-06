package library.service;
 
import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;
 
public class Library {
    private List<Lendable> items;
 
    public Library() {
        items = new ArrayList<>();
    }
 
    public void addItem(Lendable item) {
        items.add(item);
    }
 
    public void removeItem(Lendable item) {
        items.remove(item);
    }
 
    // Méthode volontairement incorrecte pour TP SonarQube (inchangée)
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();
        for (Lendable item : items) {
            availableItems.add(item); // ne tient pas compte de l'état borrowed
        }
        return availableItems;
    }
 
    // Plus de instanceof ni de cast vers Book : on dépend seulement de Lendable
    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item.getDescription());
        }
    }
}