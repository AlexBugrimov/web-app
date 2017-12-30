package pro.bugrim;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) {

        response.setContentType("text/html");
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h2>");
            printWriter.println("Если вы читаете это, то Ваш сервер приложений работает нормально!");
            printWriter.println("</h2>");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
