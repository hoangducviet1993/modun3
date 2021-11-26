import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/convert")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        int listPrice = Integer.parseInt(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description:  " + productDescription + "</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + (listPrice - discountAmount) + "</h1>");

        writer.println("</html>");
    }
}
