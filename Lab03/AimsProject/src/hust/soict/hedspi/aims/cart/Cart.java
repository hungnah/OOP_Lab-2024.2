package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    // Thêm phương thức để sắp xếp theo tiêu đề rồi giá
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    
    // Thêm phương thức để sắp xếp theo giá rồi tiêu đề
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    
    // Add media to cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added to the cart.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Add multiple media items
    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }
    
    // Remove media from cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed from the cart.");
        } else {
            System.out.println("The media was not found in the cart.");
        }
    }
    
    // Calculate total cost
    public double totalCost() {
        double total = 0.0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Simple print method
    public void prinCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty");
            return;
        }
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ": " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCost() + "$");
        }
    }

    // Detailed print method
    public void printCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("***********************CART***********************");
            System.out.println("The cart is empty");
            System.out.println("***************************************************");
            return;
        }
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

    // Search media by ID
    public void searchMediaByID(int id) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("No match is found.");
            return;
        }
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found: " + media.toString());
                return;
            }
        }
        System.out.println("No match is found.");
    }

    // Search media by title
    public void searchMediaByTitle(String title) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("No match is found.");
            return;
        }
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Found: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match is found.");
        }
    }
    public Media findByTitle(String title) {
        for (Media m : itemsOrdered) {
            if (m.isMatch(title)) return m;
        }
        return null;
    }

}