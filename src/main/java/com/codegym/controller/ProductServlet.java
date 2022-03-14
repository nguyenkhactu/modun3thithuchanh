package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.model.dao.category.CategoryDAO;
import com.codegym.model.dao.product.ProductDAO;
import com.codegym.model.vervice.category.CategoryService;
import com.codegym.model.vervice.category.ICategoryservice;
import com.codegym.model.vervice.product.IProductService;
import com.codegym.model.vervice.product.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "")
public class ProductServlet extends HttpServlet {
    private IProductService productService;
    private ICategoryservice categoryservice;

    public ProductServlet() {
        this.productService = new ProductService(new ProductDAO());
        this.categoryservice = new CategoryService(new CategoryDAO());
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                List<Category> categories =categoryservice.findAll();
                request.setAttribute("categories",categories);
                RequestDispatcher dispatcher2 = request.getRequestDispatcher("/create.jsp");
                dispatcher2.forward(request, response);
                break;
            case "edit":
                int id2 = Integer.parseInt(request.getParameter("id"));
                Product product2 = productService.findById(id2);
                request.setAttribute("product", product2);
                RequestDispatcher dispatcher4 = request.getRequestDispatcher("/edit.jsp");
                dispatcher4.forward(request,response);
                break;
            case "delete":
                int id = Integer.parseInt(request.getParameter("id"));
                Product product = productService.findById(id);
                request.setAttribute("product", product);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/delete.jsp");
                dispatcher.forward(request, response);
                break;
            case "view":
                break;
            default:
                List<Product> products = productService.findAll();
                String q = request.getParameter("q");
                if (q !=null){
                    products = productService.findAllProductByName(q);
                }
                request.setAttribute("product",products);
                RequestDispatcher dispatcher1 = request.getRequestDispatcher("/list.jsp");
                dispatcher1.forward(request,response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String name = request.getParameter("name");
                Double price = Double.valueOf(request.getParameter("price"));
                int quantily = Integer.parseInt(request.getParameter("quantily"));
                String color = request.getParameter("color");
                String description = request.getParameter("description");
                int categoryId = Integer.parseInt(request.getParameter("category"));
                Product product = new Product(name, price,quantily,color, description,categoryId);
                productService.create(product);
                response.sendRedirect("/");
                break;
            case "edit":
                int id2 = Integer.parseInt(request.getParameter("id"));
                String name2 = request.getParameter("name");
                Double price2= Double.valueOf(request.getParameter("price"));
                int quantily2 = Integer.parseInt(request.getParameter("quantily"));
                String color2 = request.getParameter("color");
                String description2 = request.getParameter("description");
                Product product1 = new Product(id2,name2,price2,quantily2,color2,description2);
                productService.updateById(id2,product1);
//                String message = "";
//                if (isUpdate){
//                    message = "cập nhật thành công";
//                } else {
//                    message = "Xảy ra lỗi";
//                }
//                request.setAttribute("message",message);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
//                dispatcher.forward(request,response);
                response.sendRedirect("/");
                break;
            case "delete":
                int id1 = Integer.parseInt(request.getParameter("id"));
                productService.deleteById(id1);
                response.sendRedirect("/");
                break;
        }

    }
}
