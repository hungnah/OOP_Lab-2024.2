package com.example.myapp;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // Thuộc tính lớp (Class Attribute)
    private static int nbDigitalVideoDiscs = 0;
    
    // Thuộc tính instance (Instance Attribute)
    private int id;
    
    public String getTitle() {
        return title;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDirector() {
        return director;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
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
    
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        
        // Cập nhật số lượng DVD và gán ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    
    public float getCost() {
        return cost;
    }
    
    // Method to get the total number of DVDs created
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    
    // Getter cho id
    public int getId() {
        return id;
    }
}