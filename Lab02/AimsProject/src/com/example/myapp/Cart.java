package com.example.myapp;

public class Cart {
    private DigitalVideoDisc[] itemsOrdered;
    private int qtyOrdered = 0;
    private static final int MAX_NUMBERS_ORDERED = 20;

    // Phương thức thêm đĩa
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            if (itemsOrdered == null) {
                itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            }
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Phương thức xóa đĩa
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered != null && qtyOrdered > 0) {
            int indexToRemove = -1;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] != null && itemsOrdered[i].equals(disc)) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != -1) {
                for (int i = indexToRemove; i < qtyOrdered - 1; i++) {
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
            } else {
                System.out.println("The disc is not found in the cart");
            }
        } else {
            System.out.println("The cart is empty");
        }
    }

    // Phương thức tính tổng chi phí
    public double totalCost() {
        double total = 0.0;
        if (itemsOrdered != null) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] != null) {
                    total += itemsOrdered[i].getCost();
                }
            }
        }
        return total;
    }
    
    //Phuong thuc in thanh phan disc
    public void prinCart() {
    	for(int i =0;i<qtyOrdered ;i++) {
    		System.out.println( (i+1)+ "   " + itemsOrdered[i].getTitle() + "   " + itemsOrdered[i].getCost() );
    	}
    }
    
    // method overloading phuong thuc 1 ( them mang trong add )
    // => ưu điểm là không phải tạo mảng chứa các dvd mà được hoàn toàn tự động nhưng thế cx là
    // nhược điểm tại không điểm soát được, dễ bị overhead nhỏ
 	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
 	    for (DigitalVideoDisc dvd : dvdList) {
 	        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
 	            itemsOrdered[qtyOrdered] = dvd;
 	            qtyOrdered++;
 	            System.out.println("The disc has been added: " + dvd.getTitle());
 	        } else {
 	            System.out.println("The cart is full. Cannot add " + dvd.getTitle());
 	            break;
 	        }
 	    }
 	}
 	
 	// method overloading phuong thuc 2 ( theo 2 dvds ) 
 	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
 	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
 	        itemsOrdered[qtyOrdered] = dvd1;
 	        qtyOrdered++;
 	        System.out.println("The disc has been added: " + dvd1.getTitle());
 	    } else {
 	        System.out.println("The cart is full. Cannot add " + dvd1.getTitle());
 	        return; // Không thêm tiếp nếu giỏ hàng đã đầy
 	    }

 	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
 	        itemsOrdered[qtyOrdered] = dvd2;
 	        qtyOrdered++;
 	        System.out.println("The disc has been added: " + dvd2.getTitle());
 	    } else {
 	        System.out.println("The cart is full. Cannot add " + dvd2.getTitle());
 	    }
 	}

}



