let currentList = [];
let results = [];
let currentListArr = [];

function updateCurrentListDisplay() {
  const currentListDiv = document.getElementById('currentList');
  if (currentListArr.length === 0) {
    currentListDiv.textContent = '';
  } else {
    currentListDiv.textContent = 'Current List: ' + currentListArr.join(', ');
  }
}
function newList() {
  currentListArr = [];
  updateCurrentListDisplay();
  // ...other logic for new list if needed...
}

function addToList() {
  const input = document.getElementById('numberInput');
  const value = input.value.trim();
  if (value !== '') {
    currentListArr.push(Number(value));
    updateCurrentListDisplay();
    input.value = '';
    input.focus();
  }
}

function getSum() {
  // ...your existing sum logic...
  if (currentListArr.length === 0) {
    alert("Add some numbers to the list first.");
    return;
  }
  const sum = currentListArr.reduce((a, b) => a + b, 0);
  results.push({ list: [...currentListArr], sum: sum });
  updateTable();
  currentListArr = [];
  updateCurrentListDisplay();
  // ...other logic for displaying sum...
}

// Initial display
updateCurrentListDisplay();


// function newList() {
//   currentList = [];
//   document.getElementById("numberInput").value = "";
//   alert("New list started.");
// }

// function addToList() {
//   const input = document.getElementById("numberInput");
//   const value = parseFloat(input.value);
//   if (!isNaN(value)) {
//     currentList.push(value);
//     input.value = "";
//   } else {
//     alert("Please enter a valid number.");
//   }
// }

// function getSum() {
//   if (currentList.length === 0) {
//     alert("Add some numbers to the list first.");
//     return;
//   }

//   const sum = currentList.reduce((a, b) => a + b, 0);
//   results.push({ list: [...currentList], sum: sum });
//   updateTable();
//   currentList = [];
// }

function updateTable() {
  const table = document.getElementById("resultTable");
  table.innerHTML = "";
  results.forEach((result, index) => {
    const row = `
      <tr>
        <td>${index + 1}</td>
        <td>[${result.list.join(", ")}]</td>
        <td>${result.sum.toFixed(2)}</td>
      </tr>`;
    table.innerHTML += row;
  });
}
