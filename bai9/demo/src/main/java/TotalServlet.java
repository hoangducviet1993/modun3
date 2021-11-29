import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TotalServlet", value = "/login")
public class TotalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int strA = Integer.parseInt(request.getParameter("strA"));
//        int strB = Integer.parseInt(request.getParameter("strB"));
//        int total = strA+ strB;
//        PrintWriter printWriter = response.getWriter();
//        printWriter.println("So a: "+ strA);
//        printWriter.println("So b: "+ strB);
//        printWriter.println("Tong:"+total);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter printWriter = response.getWriter();
        if("hoangviet".equals(username)&& "reixinhdep".equals(password)){
            printWriter.println("xin chao "+password);
        }else {
            printWriter.println("sai roi");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
