
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        String n = request.getParameter("first_name");
        String p = request.getParameter("password");
        String e = request.getParameter("email");
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/servlet", "root", "mukesh");
 
            PreparedStatement ps = con
                    .prepareStatement("insert into USERDETAILS values(?,?,?)");
 
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }
 
}