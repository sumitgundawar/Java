import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
class ServletDemo extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        int n1=Integer.parseInt(req.getParameter("t1"));
        int n2=Integer.parseInt(req.getParameter("t2"));
        int sum=n1+n2;
        out.write(sum);
    }
}