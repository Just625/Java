package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                showCreateForm(request, response);
                break;
            }
            case "edit": {
                showEditForm(request, response);
            }
            case "delete":{
                showDeleteForm(request,response);
                break;
            }
            case "view":{
                showViewForm(request,response);
                break;
            }
            default: {
                listProducts(request, response);
                break;
            }
        }
    }


    private void showViewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int index = productService.findById(id);
        RequestDispatcher dispatcher;
        if(index==-1){
            dispatcher= request.getRequestDispatcher("product/error-404.jsp");
        }else{
            Product product = productService.showAll().get(index);
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/view.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int index = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(index==-1){
            dispatcher = request.getRequestDispatcher("product/error-404.jsp");
        }else{
            Product product = this.productService.showAll().get(index);
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/delete.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int index = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (index == -1) {
            dispatcher = request.getRequestDispatcher("product/error-404.jsp");
        } else {
            Product product = this.productService.showAll().get(index);
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        dispatcher.forward(request, response);
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productService.showAll();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                createNewProduct(request, response);
                break;
            }
            case "edit": {
                editProduct(request, response);
                break;
            }
            case "delete":{
                deleteProduct(request,response);
                break;
            }
            case "search":{
                searchProduct(request,response);
                break;
            }
            default: {
                break;
            }
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nameSearch");
        List<Product> searchList = productService.searchByName(name);
        RequestDispatcher dispatcher;
        if(searchList==null){
            dispatcher = request.getRequestDispatcher("product/error-404.jsp");
        }else{
            request.setAttribute("products", searchList);
            dispatcher = request.getRequestDispatcher("product/view_search.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        if(!this.productService.deleteProduct(id)){
            dispatcher=  request.getRequestDispatcher("product/error-404.jsp");
        }else{
            response.sendRedirect("/products");
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        int id =Integer.parseInt(request.getParameter("id"));
        Product product = new Product(id, name,price, description);
        RequestDispatcher dispatcher;
        if(!this.productService.editProduct(id,product)){
            dispatcher = request.getRequestDispatcher("product/error-404.jsp");
        }else{
            request.setAttribute("product", product);
            request.setAttribute("message", "Product information was updated");
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        List<Product> productList = productService.showAll();
        int id = productList.get(productList.size()-1).getId()+1;
        Product product = new Product(id, name, price, description);
        this.productService.addProduct(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message", "New product created");
        dispatcher.forward(request, response);
    }
}
