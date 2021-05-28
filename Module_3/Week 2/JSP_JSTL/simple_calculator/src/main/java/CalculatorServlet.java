import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        int firstNumb = Integer.parseInt(request.getParameter("firstNumb"));
        int secondNumb = Integer.parseInt(request.getParameter("secondNumb"));
        String operand = request.getParameter("operands");
        Calculator calculator = new Calculator(firstNumb, secondNumb, operand);
        writer.println("<html>");
        writer.println("<h3>Result: </h3>");
        if (operand.equals("Addition")) {
            operand = "+";
        } else if (operand.equals("Subtraction")) {
            operand = "-";
        } else if (operand.equals("Multiplication")) {
            operand = "*";
        } else {
            operand = "/";
        }
        try {
            int result = calculator.calculate();
            writer.println(firstNumb + " " + operand + " " + secondNumb + " = " + result);
        } catch (Exception e) {
            writer.println("Error: " + e.getMessage());
        }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
