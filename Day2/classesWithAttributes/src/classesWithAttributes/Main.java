package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
//		product.setName ("Laptop");
//		product.setId(1);
//		product.setDescription ( "Asus Laptop");
//		product.setPrice (5000);
//		product.setStockAmount (3);
		//product.setRenk="mavi";

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		//productManager.Add2(1, "", "", 2, 200); //productmanagerda belirttiğim gibi yanlış olan kullanım biçimini kullanırsan burada yaptığın her şeyi tek tek değiştirmen gerekicek.
	

	}

}
