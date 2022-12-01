package adet_pos;

public class salesTable {
    private int id;
    private String date, status;
    private double subtotal;
    
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    public String getdate(){
        return date;
    }
    public void setdate(String date){
        this.date = date;
    }
    
    public String getstatus(){
        return status;
    }
    public void setstatus(String status){
        this.status = status;
    }
    
    public double getsubtotal(){
        return subtotal;
    }
    public void setsubtotal(double subtotal){
        this.subtotal = subtotal;
    }
}
