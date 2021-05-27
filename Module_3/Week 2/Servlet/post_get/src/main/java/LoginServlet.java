import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(userName.equals("admin") && passWord.equals("admin")){
            writer.println("<h1>Welcome "+ userName+" to website</h1>");
        }else{
            writer.println("<h1>Login error</h1>");
        }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(userName.equals("admin") && passWord.equals("admin")){
            writer.println("<h1>Welcome "+ userName+" to website</h1>");
        }else{
            writer.println("<h1>Login error</h1>");
        }
        writer.println("</html>");
    }
}
