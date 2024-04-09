/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jr05.repository;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jr05.domain.City;

/**
 *
 * @author student2
 */
public class CityRepository {
    
    
    public List<City> returnCities() throws Exception{
        
        List<City> cities = new ArrayList<>();
        String url="jdbc:mysql://localhost:3306/java_radionica2";
        String user ="root";
        String password="";
        
        try {
            Connection konekcija = DriverManager.getConnection(url, user, password);
            System.out.println("Uspesno povezano");

            String query = "SELECT * FROM CITY ORDER BY name";
            java.sql.Statement s = konekcija.createStatement();
            java.sql.ResultSet rs = s.executeQuery(query);

            while (rs.next()){
                //uzima po tipu podatka i po imenu kolone u bazi
                int zipcode = rs.getInt("zipcode");            
                String name = rs.getString("name");
                   City city = new City(zipcode, name);
                   cities.add(city);
            }

            rs.close();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CityRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cities;
    }
    
    public void saveCity() {
        
    }
    
    public void deleteCity() {
        
    }
    
    public void updateCity() {
        
    }
}
