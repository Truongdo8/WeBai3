package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import murach.business.User;
import murach.data.UserBD;

@WebServlet(name="EmailListServlet", urlPatterns={"/emailList"})
public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";
        String action = request.getParameter("action");
        if (action == null) action = "join";

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            // Lấy dữ liệu từ form
            String firstName  = request.getParameter("firstName");
            String lastName   = request.getParameter("lastName");
            String email      = request.getParameter("email");
            String dayOfBirth = request.getParameter("dayofbirth");
            String source     = request.getParameter("source");
            String announce1  = request.getParameter("announce1");
            String announce2  = request.getParameter("announce2");
            String contact    = request.getParameter("contact");

            // Tạo đối tượng User (cần sửa User.java để có đủ các trường này)
            User user = new User(firstName, lastName, email, dayOfBirth,
                                 source, announce1, announce2, contact);

            // Giả lập insert vào DB
            UserBD.insert(user);

            // Gửi user sang thanks.jsp
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
