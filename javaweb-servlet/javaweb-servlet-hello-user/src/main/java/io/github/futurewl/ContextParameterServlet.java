package io.github.futurewl;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 功能描述：上下文参数 Servlet
 *
 * @author weilai
 */
@WebServlet(
        name = "contextParameterServlet",
        urlPatterns = {"/contextParameters"}
)
public class ContextParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext c = this.getServletContext();
        PrintWriter writer = response.getWriter();

        writer.append("settingOne: ").append(c.getInitParameter("settingOne"))
                .append(", settingTwo: ").append(c.getInitParameter("settingTwo"));
    }
}
