package com.login;

import java.io.*;

import java.sql.*;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;

public class Input extends HttpServlet {

       public void doPost(HttpServletRequest request, HttpServletResponse response)

                     throws ServletException, IOException {        

              String name=request.getParameter("uname");   
              String job=request.getParameter("job");
              String salary=request.getParameter("salary");
              String bonus=request.getParameter("bonus");
              

              try{

                     Class.forName("com.mysql.jdbc.Driver");

                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","manager");               

                     PreparedStatement ps=con.prepareStatement("insert into Devansh_Dwivedee_111915031_salary values(?,?,?,?)");

                     ps.setString(1,name);    
                     ps.setString(2,job);
                     ps.setString(3,salary);
                     ps.setString(4,bonus);
                     
                     
                     ps.executeUpdate();
           
                     ps.close();
                     
               
                     con.close();
                     response.sendRedirect("success.jsp");


              }catch (Exception e2)

                {

                    e2.printStackTrace();

                }

       }


}