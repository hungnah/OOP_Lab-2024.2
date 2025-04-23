package hust.soict.hedspi.aims.media;
import java.util.Comparator;
public abstract class Media {

	protected int id;
    protected String title;
    protected String category;
    protected float cost;
    
    // Thêm comparators làm thuộc tính static final
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
    // Constructor
    public Media() {
        // Default constructor
    }
    
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getCategory() {
        return category;
    }
    
    public float getCost() {
        return cost;
    }
    
    // Abstract methods that each media type must implement
    public abstract void display();
    
    // Method to check if title matches
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Media)) return false;
        Media media = (Media) obj;
        return this.title.equals(media.title);
    }
}
