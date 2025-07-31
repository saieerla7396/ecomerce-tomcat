<%@ page import="java.util.*, com.example.Product" %>
<html>
<head><title>Product List</title></head>
<body>
<h1>Product List</h1>
<ul>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
    for (Product p : products) {
%>
    <li><%= p.getName() %> - $<%= p.getPrice() %></li>
<%
    }
%>
</ul>
<a href="addProduct.jsp">Add New Product</a>
</body>
</html>
