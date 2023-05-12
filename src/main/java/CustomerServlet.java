import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/list")
public class CustomerServlet extends HttpServlet {
    final String tzuyu = "https://i.pinimg.com/originals/76/57/d5/7657d5beddbffb617c79f491a6899dd1.jpg";
    final String bailu = "https://m.media-amazon.com/images/M/MV5BYTdhZTYwNDAtYTJjYy00Nzc5LTgzNGEtZDlmNDIwOTA4ZmVhXkEyXkFqcGdeQXVyMjg0MTI5NzQ@._V1_.jpg";
    final String yoona = "https://i.pinimg.com/474x/f4/2d/89/f42d89401962db1843f17e556064962c.jpg";
    final String gil = "https://kenh14cdn.com/203336854389633024/2021/8/23/1810497693374981010588312922710636317275661n-16296998635121854785414.jpg";
    final String lisa = "https://e1.pxfuel.com/desktop-wallpaper/44/149/desktop-wallpaper-lisa-lalisa-lisa.jpg";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Chou Tzuyu", LocalDate.of(1999, 6, 14), "Taiwan", tzuyu));
        customers.add(new Customer("Bai Mengyan", LocalDate.of(1994, 9, 23), "China", bailu));
        customers.add(new Customer("Im Yoona", LocalDate.of(1990, 5, 30), "Korea", yoona));
        customers.add(new Customer("Gil Le", LocalDate.of(1991, 7, 8), "Vietnam", gil));
        customers.add(new Customer("Lalisa Manobal", LocalDate.of(1997, 3, 27), "Thailand", lisa));
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("customer/customer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
