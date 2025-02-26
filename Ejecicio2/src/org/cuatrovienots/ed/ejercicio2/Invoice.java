package org.cuatrovienots.ed.ejercicio2;

public class Invoice {
	class Invoice {
	    private String customer;
	    private List<Product> products; 


	    public Invoice(String customer) {
	        this.customer = customer;
	        this.products = new ArrayList<>();
	    }


	    public void add(Product product) {
	        products.add(product);
	    }

	    public void remove(int index) {
	        if (index >= 0 && index < products.size()) {
	            products.remove(index);
	        } else {
	            System.out.println("Índice fuera de rango.");
	        }
	    }

	    public float total() {
	        float sum = 0;
	        for (Product product : products) {
	            sum += product.total();
	        }
	        return sum;
	    }

	    @Override
	    public String toString() {
	        
	    }
	}

}
