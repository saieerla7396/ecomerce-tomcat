package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {
    private static final List<Product> products = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setAttribute("products", products);
        req.getRequestDispatcher("products.jsp").forward(req, res);
    }

    public static void addProduct(Product p) {
        products.add(p);
    }
}
