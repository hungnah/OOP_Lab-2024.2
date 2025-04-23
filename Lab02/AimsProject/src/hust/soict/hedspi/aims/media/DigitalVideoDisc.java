package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Thuộc tính lớp (Class Attribute)
    private static int nbDigitalVideoDiscs = 0;
    
    // Constructors
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(nbDigitalVideoDiscs + 1, title, category, cost, length, director);
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
    }
    
    // Method to get the total number of DVDs created
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    
    //lab03
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }
    
    @Override
    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
    
    // Implement the abstract display() method from Media
    @Override
    public void display() {
        System.out.println("DVD - ID: " + getId());
        System.out.println("Tiêu đề: " + getTitle());
        System.out.println("Thể loại: " + getCategory());
        System.out.println("Đạo diễn: " + getDirector());
        System.out.println("Độ dài: " + getLength() + " phút");
        System.out.println("Giá: " + getCost() + " $");
    }
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    	}
}