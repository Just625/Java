import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SearchServlet", value = "/translate")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dream", "giấc mơ");
        dictionary.put("steps", "các bước");
        dictionary.put("book", "sách");
        dictionary.put("pen", "bút");
        dictionary.put("Dota2", "Thượng cổ phòng thủ trận 2");
        String word = request.getParameter("wordSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(word);
        if(result!=null){
            writer.println("<h1>Word: "+word+"</h1>");
            writer.println("<h1>Translate to: "+result+"</h1>");
        }else{
            writer.println("<h1>Can not translate "+word+"</h1>");
        }
        writer.println("</html>");
    }
}
