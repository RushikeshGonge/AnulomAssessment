<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>SumCalculator</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
    rel="stylesheet"
  />

</head>
<body>
  <h1>SumCalculator</h1>

  <div class="input-section">
    <input
      type="number"
      id="numberInput"
      class="form-control mb-2"
      placeholder="Enter a number"
    />
     <div id="currentList" class="current-list"></div>
  </div>
<div class="btn-group">
  <button class="btn btn-outline-warning me-2" onclick="newList()">New List</button>
  <button class="btn btn-outline-info me-2" onclick="addToList()">Add to List</button>
  <button class="btn btn-outline-success" onclick="getSum()">Get Sum</button>
</div>
  </div>

  <div class="data-table container-fluid">
    <table class="table table-dark table-striped table-bordered">
      <thead class="table-light">
        <tr>
          <th>Sr. No.</th>
          <th>List</th>
          <th>Sum</th>
        </tr>
      </thead>
      <tbody id="resultTable"></tbody>
    </table>
  </div>

  <script src="script.js"></script>
</body>
</html>
