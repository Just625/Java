import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertServlet", value = "/convert")
public class ConvertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Neu thay method o form  = "get"
//        float rate = Float.parseFloat(request.getParameter("rate"));
//        float usd = Float.parseFloat(request.getParameter("usd"));
//        PrintWriter printWriter = response.getWriter();
//        float vnd = usd * rate;
//        printWriter.println("<html>");
//        printWriter.println("<h1>Rate: "+rate+"</h1>");
//        printWriter.println("<h1>USD: "+usd+"</h1>");
//        printWriter.println("<h1>VND: "+vnd+"</h1>");
//        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        PrintWriter printWriter = response.getWriter();
        float vnd = usd * rate;
        printWriter.println("<html>");
        printWriter.println("<h1>Rate: "+rate+"</h1>");
        printWriter.println("<h1>USD: "+usd+"</h1>");
        printWriter.println("<h1>VND: "+vnd+"</h1>");
        printWriter.println("</html>");
    }
}
