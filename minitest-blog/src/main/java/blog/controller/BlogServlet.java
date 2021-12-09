package blog.controller;

import blog.model.Blog;
import blog.model.Category;
import blog.service.BlogService;
import blog.service.CategoryService;
import blog.service.Impl.BlogServiceImpl;
import blog.service.Impl.CategoryServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BlogServlet", value = "/blogs")
public class BlogServlet extends HttpServlet {
    BlogService blogService = new BlogServiceImpl();
    CategoryService categoryService = new CategoryServiceImpl();
    RequestDispatcher requestDispatcher = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            default:
                try {
                    showListProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        requestDispatcher = request.getRequestDispatcher("blog/list.jsp");
        List<Blog> blogs = blogService.findAll();
        List<Category> categories = findALlCategory(blogs);
        request.setAttribute("blog", blogs);
        request.setAttribute("category", categories);
        requestDispatcher.forward(request, response);
    }

    List<Category> findALlCategory(List<Blog> blogs) throws SQLException {
        List<Category> list = new ArrayList<>();
        for (int i = 0; i < blogs.size(); i++) {
            Category category = categoryService.findById(blogs.get(i).getCategoryId());
            list.add(category);
        }
        return  list;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
