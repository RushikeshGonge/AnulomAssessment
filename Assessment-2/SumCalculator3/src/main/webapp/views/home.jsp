<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sum Calculator - Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-dark text-light">
<div class="container text-center mt-5">
    <h1 class="mb-4">SumCalculator</h1>

    <form action="/add" method="post" class="mb-3">
        <input type="number" name="number" class="form-control w-50 mx-auto" placeholder="Enter a number" required />
        <div class="d-flex justify-content-center gap-2 mt-3">
            <a href="/new" class="btn btn-warning">New List</a>
            <button type="submit" class="btn btn-primary">Add to List</button>
            <a href="/sum" class="btn btn-success">Get Sum</a>
        </div>
    </form>
</div>
</body>
</html>
