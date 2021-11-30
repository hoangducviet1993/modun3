package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/students")
public class StudentServlet extends HttpServlet {
    StudentServiceImpl studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            default:
                showListPage(request, response);
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
        }

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.delete(id);
        response.sendRedirect("/students");
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/delete.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Student student= studentService.findById(id);
        request.setAttribute("hsCanXoa",student);
        requestDispatcher.forward(request, response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        double mathScore = Double.parseDouble(request.getParameter("mathScore"));
        double physicsScore = Double.parseDouble(request.getParameter("physicsScore"));
        double chemistryScore = Double.parseDouble(request.getParameter("chemistryScore"));
        String name = request.getParameter("name");
//        int id1 = studentService.findIndexOfById(id);
        studentService.update(id, new Student(id, name, mathScore, physicsScore, chemistryScore));
        response.sendRedirect("/students");

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.findById(id);
        request.setAttribute("hsCanSua", student);
        requestDispatcher.forward(request, response);
    }


    private void showListPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("student/list.jsp");
        List<Student> student = studentService.findAll();
        request.setAttribute("danhSach", student);
        requestDispatcher.forward(request, response);
    }
}
