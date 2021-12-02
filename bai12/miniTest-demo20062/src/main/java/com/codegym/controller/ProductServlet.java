package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductDAO;
import com.codegym.service.ProductDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    IProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("act");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request,response);
                break;
            case "orderByQuantity":
                showProductOrder(request, response);
                break;
            default:
                showListProduct(request, response);
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
    }
    private void showProductOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        List<Product> products = productDAO.findAllOderByQuantity();
        request.setAttribute("dsSP", products);
        requestDispatcher.forward(request, response);
    }
    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        String key = request.getParameter("key");
        List<Product> products = new ArrayList<>();
        if (key == null) {
            products = productDAO.findAll();
        } else {
            products = productDAO.findByName(key);
        }
        request.setAttribute("dsSP", products);
        requestDispatcher.forward(request, response);
    }

}
