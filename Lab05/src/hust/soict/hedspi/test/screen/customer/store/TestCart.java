package hust.soict.hedspi.test.screen.customer.store;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCart extends Application {
	Store store = new Store();
    Cart cart = new Cart();
    @Override
    public void start(Stage primaryStage) throws Exception {
    	final String CART_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Cart.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH));
		CartController cartController = new CartController(store,cart);
		fxmlLoader.setController(cartController);
		Parent root	= fxmlLoader.load();
		
		primaryStage.setTitle("Cart");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
     

        Media media1 = new GenericMedia(1, "The Lion King", "Animation", 19.95f);
        Media media2 = new GenericMedia(2, "Star Wars", "Science Fiction", 24.95f);
        Media media3 = new GenericMedia(3, "Inception", "Thriller", 18.99f);
        Media media4 = new GenericMedia(4, "The Avengers", "Action", 22.50f);
        Media media5 = new GenericMedia(5, "Thriller", "Pop", 15.95f);
        Media media6 = new GenericMedia(6, "Abbey Road", "Rock", 16.99f);
        Media media7 = new GenericMedia(7, "The Hobbit", "Fantasy", 12.99f);
        Media media8 = new GenericMedia(8, "To Kill a Mockingbird", "Classic", 9.99f);
        Media media9 = new GenericMedia(9, "Clean Code", "Technical", 32.50f);
        Media media10 = new GenericMedia(10, "Design Patterns", "Technical", 39.99f);

        // Add media items to the store
        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);
        store.addMedia(media6);
        store.addMedia(media7);
        store.addMedia(media8);
        store.addMedia(media9);
        store.addMedia(media10);

        // Thêm một số media vào giỏ hàng (ví dụ)
        cart.addMedia(media1);
        cart.addMedia(media3);
        cart.addMedia(media5);

    }

    public static void main(String[] args) {
        launch(args);
    }
}