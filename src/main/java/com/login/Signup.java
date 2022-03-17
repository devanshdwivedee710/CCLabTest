package com.login;

import java.io.*;

import java.sql.*;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;

public class Signup extends HttpServlet {

       public void doPost(HttpServletRequest request, HttpServletResponse response)

                     throws ServletException, IOException {        

              String name=request.getParameter("uname");   
              String pass=request.getParameter("pass");
              String fstname=request.getParameter("fstname");
              String lstname=request.getParameter("lstname");
              String dob=request.getParameter("dob");
              String contact=request.getParameter("contact");

              try{

                     Class.forName("com.mysql.jdbc.Driver");

                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","manager");               

                     PreparedStatement ps=con.prepareStatement("insert into Devansh_Dwivedee_111915031_details values(?,?,?,?,?,?)");

                     ps.setString(1,name);    
                     ps.setString(2,pass);
                     ps.setString(3,fstname);
                     ps.setString(4,lstname);
                     ps.setString(5,dob);
                     ps.setString(6,contact);
                     
                     ps.executeUpdate();
                     
                 
                     ps.close();
                     con.close();
                     response.sendRedirect("login.jsp");


              }catch (Exception e2)

                {

                    e2.printStackTrace();

                }

       }


}