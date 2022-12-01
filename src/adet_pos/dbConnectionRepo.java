package adet_pos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class dbConnectionRepo {
    private String conString = "jdbc:mysql://localhost:3306/adet?user=root&password=&autoReconnect=true&useSSL=false";
    private String driver =  "com.mysql.cj.jdbc.Driver";
    
    public dbConnectionRepo(){
        try{
            Class.forName(driver);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
    }
    
    public boolean adminLoginDao(String username, String password){
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from admin_login where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    
    public boolean empLoginDao(String username, String password){
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from employee_login where username=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public int product_AddDAO(int pcode, String product_name, String description, double price, int quantity){
        int status = 0;
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "INSERT INTO product (pcode, product_name, description, price, quantity) VALUES ('" + pcode + "', '" + product_name + "', '" + description + "', '" + price + "', '" + quantity + "')";
            PreparedStatement ps = con.prepareStatement(sql);  
	    status = ps.executeUpdate();  
            JOptionPane.showMessageDialog(null, "Added successfully!");
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
    
    public int product_UpdateDAO(int pcode, String product_name, String description, double price, int quantity){
        int status = 0;
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "update product set pcode = '" + pcode + "', product_name = '" + product_name + "', description = '" + description + "', price = '" + price + "', quantity = '" + quantity + "' where pcode = '" + pcode + "'";
	    PreparedStatement ps=con.prepareStatement(sql);  
	    status = ps.executeUpdate();  
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
    
    public int product_DeleteDAO(int pcode){
        int status = 0;
        try (Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "delete from product where pcode = '" + pcode + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            status = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            con.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
    
    public List<productTable> product_GetRecordsDAO(){
        List<productTable> list = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from product";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                productTable u = new productTable();
                u.setpcode(rs.getInt(1));
                u.setproduct_name(rs.getString(2));
                u.setdescritpion(rs.getString(3));
                u.setprice(rs.getDouble(4));
                u.setquantity(rs.getInt(5));
                list.add(u);
            }
            con.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public int sales_AddDAO(String date, double subtotal, double cash, double change, String status){
        int lastid = 0;
        try(Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "INSERT INTO sales (date, subtotal, cash, balance, status) VALUES (?,?,?,?, ?)";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);  
            ps.setString(1, date); ps.setDouble(2, subtotal); ps.setDouble(3, cash); ps.setDouble(4, change); ps.setString(5, status);
            ps.executeUpdate();  
            ResultSet generatedKeyResult = ps.getGeneratedKeys();
            if(generatedKeyResult.next()){
                lastid = generatedKeyResult.getInt(1);
            }
            con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return lastid;
    }
    
    public List<salesTable> sales_GetRecordsDAO(){
        List<salesTable> list = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(conString);)
        {
            String sql = "select * from sales";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                salesTable u = new salesTable();
                u.setid(rs.getInt(1));
                u.setdate(rs.getString(2));
                u.setstatus(rs.getString(6));
                u.setsubtotal(rs.getDouble(3));
                list.add(u);
            }
            con.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
}
