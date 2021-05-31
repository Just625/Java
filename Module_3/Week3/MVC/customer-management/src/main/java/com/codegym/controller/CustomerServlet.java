package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();

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
                break;
            }
            case "delete": {
                showDeleteForm(request,response);
                break;
            }
            default: {
                listCustomers(request, response);
                break;
            }
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =  Integer.parseInt(request.getParameter("id"));
        int index  = this.customerService.findByID(id);
        RequestDispatcher dispatcher;
        if(index==-1){
            dispatcher = request.getRequestDispatcher("error-404.jp");
        }else{
            Customer customer = this.customerService.findAll().get(index);
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/delete.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int index = this.customerService.findByID(id);
        RequestDispatcher dispatcher;
        if (index == -1) {
            dispatcher = request.getRequestDispatcher("customer/error-404.jsp");
        } else {
            Customer customer = this.customerService.findAll().get(index);
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        }
        dispatcher.forward(request,response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
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
                createCustomer(request, response);
                break;
            }
            case "edit": {
                editCustomer(request, response);
                break;
            }
            case "delete": {
                deleteCustomer(request,response);
                break;
            }
            default: {
                break;
            }
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int index = customerService.findByID(id);
        RequestDispatcher dispatcher;
        if(index==-1){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            customerService.deleteCustomer(id);
            response.sendRedirect("/customers");
        }

    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =request.getParameter("name");
        String email =request.getParameter("email");
        String address =request.getParameter("address");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer(id, name,email,address);
        RequestDispatcher requestDispatcher;
        if(!this.customerService.editCustomer(id, customer)){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            request.setAttribute("customer", customer);
            request.setAttribute("message","Customer information was updated");
            requestDispatcher= request.getRequestDispatcher("customer/edit.jsp");
        }
        requestDispatcher.forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = (int) (Math.random() * 100000);
        Customer customer = new Customer(id, name, email, address);
        this.customerService.addCustomer(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("message", "New customer created");
        dispatcher.forward(request, response);
    }
}
