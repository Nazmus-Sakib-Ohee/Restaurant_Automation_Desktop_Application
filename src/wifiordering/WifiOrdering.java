/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wifiordering;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nazmus_Sakib_Ohee
 */
public class WifiOrdering {
    private String orderno,tableno,orders,price,status;

      WifiOrdering(String porderno,String ptableno,String porders,String pprice,String pstatus){
      
      this.tableno=ptableno;
      this.orderno=porderno;
      this.price=pprice;
      this.orders=porders;
      this.status=pstatus;
      
      
      }
      
      public String getTableNo(){
      return tableno;
      }
      
      public String getOrderNo(){
      return orderno;
      }
      
      public String getPrice(){
      return price;
      
      
      }public String getOrders(){
      return orders;
      
      }public String getStatus(){
      return status;
      
      
      }
    
    
}
