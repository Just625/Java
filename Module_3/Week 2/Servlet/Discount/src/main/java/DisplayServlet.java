import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayServlet", value = "/display-discount")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        Float listPrice =  Float.parseFloat(request.getParameter("listPrice"));
        Float discountPercent =  Float.parseFloat(request.getParameter("discountPercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product description: "+productDescription+"</h1>");
        writer.println("<h1>List Price: "+listPrice+"</h1>");
        writer.println("<h1>Discount Percent: " +discountPercent+"%</h1>");
        writer.println("<h1>Discount Amount: "+discountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+discountPrice+"</h1>");
        writer.println("</html>");
    }
}
