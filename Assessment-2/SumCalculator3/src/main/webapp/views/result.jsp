<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sum Calculator - Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-dark text-light">
<div class="container mt-5">
    <h1 class="text-center mb-4">Sum Result</h1>

    <table class="table table-bordered table-striped text-light">
        <thead class="table-dark">
            <tr>
                <th>Sr. No.</th>
                <th>List</th>
                <th>Sum</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>${numbers}</td>
                <td>${sum}</td>
            </tr>
        </tbody>
    </table>

    <div class="text-center">
        <a href="/" class="btn btn-outline-light mt-3">Back to Home</a>
    </div>
</div>
</body>
</html>
