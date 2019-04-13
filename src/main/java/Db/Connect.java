package Db;
import Models.Human;

import java.sql.*;


public class Connect {


    public static void winnerBD(Human winner){

        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            Statement myStatement= myConnection.createStatement();

            String query = "CREATE DATABASE IF NOT EXISTS torneo_de_frescas";
            myStatement.execute(query);

            query = ""
                    + "CREATE TABLE IF NOT EXISTS torneo_de_frescas.winners("
                    + "id_winner INT AUTO_INCREMENT,"
                    + "winner_name varchar(40),"
                    + "winner_age int,"
                    + "winner_weight int,"
                    + "CONSTRAINT pk_id_winner PRIMARY KEY (id_winner));";
            myStatement.execute(query);
            myConnection.close();


            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/torneo_de_frescas","root","");
            query = "INSERT INTO winners (winner_name,winner_age,winner_weight) VALUES (?,?,?);";
            PreparedStatement myStatement2 = myConnection.prepareStatement(query);


            myStatement2.setString(1,winner.getName());
            myStatement2.setInt(2,winner.getAge());
            myStatement2.setInt(3,winner.getWeight());
            myStatement2.execute();
            myConnection.close();


        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}



