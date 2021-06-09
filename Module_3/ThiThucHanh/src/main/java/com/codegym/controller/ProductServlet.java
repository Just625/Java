package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch(action){
            case "create":{
                showCreateForm(request,response);
                break;
            }
            case "edit":{
                showEditForm(request,response);
                break;
            }
            case "delete":{
                deleteBook(request,response);
                break;
            }
            default:{
                showList(request,response);
                break;
            }
        }
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.deleteProduct(id);
        response.sendRedirect("/products");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =  Integer.parseInt(request.getParameter("id"));
        Map<Integer, String> categoryList = productService.getCategoryName();
        Product product = productService.findByID(id);
        RequestDispatcher requestDispatcher;
        if(product==null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            requestDispatcher = request.getRequestDispatcher("/product/edit.jsp");
            request.setAttribute("product", product);
            request.setAttribute("categories", categoryList);
        }
        requestDispatcher.forward(request,response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/create.jsp");
        Map<Integer,String> categories = productService.getCategoryName();
        request.setAttribute("categories",categories);
        requestDispatcher.forward(request,response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.selectAllProducts();
        Map<Integer,String> categories = productService.getCategoryName();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/list.jsp");
        request.setAttribute("categories",categories);
        request.setAttribute("products", productList);
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch(action){
            case "create":{
                createProduct(request,response);
                break;
            }
            case "edit":{
                editProduct(request,response);
                break;
            }
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Double  price =Double.parseDouble(request.getParameter("price"));
        int quantity  =Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int category_id = Integer.parseInt(request.getParameter("category_id"));
        String description = request.getParameter("description");
        Product product = new Product(name,price,quantity,color,category_id,description);
        RequestDispatcher requestDispatcher;
        if (!productService.editProduct(id,product)) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("message", "Product was updated");
            requestDispatcher = request.getRequestDispatcher("/product/edit.jsp");
        }
        requestDispatcher.forward(request, response);
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double  price =Double.parseDouble(request.getParameter("price"));
        int quantity  =Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int category_id = Integer.parseInt(request.getParameter("category_id"));
        String description = request.getParameter("description");
        Product product = new Product(name,price,quantity,color,category_id,description);
        RequestDispatcher requestDispatcher;
        if (!productService.insertProduct(product)) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("message", "New product added");
            requestDispatcher = request.getRequestDispatcher("/product/create.jsp");
        }
        requestDispatcher.forward(request, response);
    }
}
