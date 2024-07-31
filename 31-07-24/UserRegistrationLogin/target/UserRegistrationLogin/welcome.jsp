<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="java.sql.*" %>
<%
    
    String username = (String) session.getAttribute("user");
    if (username == null) {
        response.sendRedirect("login.html");
    } else {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/userdb", "root", "1234");
            PreparedStatement ps = con.prepareStatement(
                "select * from users where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome, <%= rs.getString("username") %>!</h1>
    <p>Your email: <%= rs.getString("email") %></p>
    <p>Your country: <%= rs.getString("country") %></p>
    <a href="login.html">Logout</a>
</body>
</html>
<%
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
