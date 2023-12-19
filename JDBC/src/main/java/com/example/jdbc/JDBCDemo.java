package com.example.jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        String dbUrl = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "MSgiri0704@-_";

        String query = "Select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(dbUrl,userName,password);

//        Statement st = con.createStatement();


        //------------->>>>>>>>>>// it is used ot select
       // ResultSet rs = st.executeQuery(query);
        //rs.next(); // initialy it is pointing the
        //System.out.println(rs.getString("name"));
        //System.out.println(rs.next());  // it gives the boolean value

//        while (rs.next())
//        {
//            System.out.println(rs.getString("name")+" "+rs.getString(1));
//        }

        //---------------------------------->>>>>>>>>>>>>>>>>>>>
                               ////////// insert

//        String insert = "insert into student values(4,'prem')";
//        boolean status = st.execute(insert);
//        System.out.println(status);

        //---------------------------------->>>>>>>>>>>>>>>>
                                            ////////// update
//        String update = "update student set name = 'hari' where id = 3";
//        st.execute(update);

//        -------------------------->>>>>>>>>>>>>>>
                           /////////delete
//        String delete = "delete from student where name = 'hari'";
//        st.execute(delete);


//        ---------------->>>>>>>>>>>>>>>>>>>>
                          //prepared statement
                          // comment line no 16 while using prepared statement
        String name = "venkat";
        int id = 6;
        String prepareStatement = "insert into student value(?,?)";

        PreparedStatement ps = con.prepareStatement(prepareStatement);

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.execute();
        System.out.println("connection established");



        con.close();
    }
}
