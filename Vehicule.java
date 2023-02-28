public abstract class Vehicule {
  
    // attributes
    private String brand;  
    private int kilometers;  
  
    // constructors
    public Vehicule(String brand) {  
        this.brand = brand;  
        this.kilometers = 0;  
    }  
  
    // getters and setters
    public String getBrand() {  
        return this.brand;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public int getkilometers() {  
        return this.kilometers;  
    }  
  
    public void setkilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();
}
