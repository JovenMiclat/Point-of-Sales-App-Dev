package adet_pos;

public class productTable {
    private int pcode, quantity;
    private String product_name, description;
    private double price;
    
    public int getpcode(){
        return pcode;
    }
    public void setpcode(int pcode){
        this.pcode = pcode;
    }
    
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getproduct_name(){
        return product_name;
    }
    public void setproduct_name(String product_name){
        this.product_name = product_name;
    }
    
    public String getdescription(){
        return description;
    }
    public void setdescritpion(String description){
        this.description = description;
    }
    
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price = price;
    }
}
