let toDoData = [];

let editIndex = NaN;
let tableBody = document.getElementById("table-body");
let addButton = document.getElementById("add-button");
let inputField = document.getElementById("to-do-input");
function renderTable() {
    document.getElementById("table-body").innerHTML = "";
    for (let index = 0; index < toDoData.length; index++) {

        const wapper = document.createElement("div");
        wapper.classList.add("row", "row-cols-2", "w-100", "my-4");

        const textDisplay = document.createElement("div");
        textDisplay.classList.add(
            "col-11",
            "p-0",
            "d-flex",
            "align-items-center",
            "justify-content-start",
            "ps-2"
        );
        wapper.appendChild(textDisplay);

        const todoText = document.createElement("span");
        todoText.style.fontWeight = "bold";
        todoText.style.fontSize = "x-large";
        todoText.id = "to-do-entry";
        todoText.className = "to-do-text";
        todoText.textContent = toDoData[index];
        textDisplay.appendChild(todoText);

        const buttonCol = document.createElement("div");
        buttonCol.classList.add("col-1", "p-0");
        wapper.appendChild(buttonCol);

        const buttonArea = document.createElement("div");
        buttonArea.classList.add("custom-button", "ps-3", "d-flex");
        buttonCol.appendChild(buttonArea);

        const editButton = document.createElement("button");
        editButton.classList.add("btn");
        editButton.type = "button";
        editButton.id = "edit-button";
        editButton.addEventListener("click", () => editEntry(index));
        buttonArea.appendChild(editButton);

        const iconElementEdit = document.createElement("i");
        iconElementEdit.classList.add("fa-solid", "fa-pencil");
        iconElementEdit.style.color = "#22b8e4";
        editButton.appendChild(iconElementEdit);

        const deleteButton = document.createElement("button");
        deleteButton.classList.add("btn");
        deleteButton.type = "button";
        deleteButton.id = "delete-button";
        deleteButton.addEventListener("click", () => deleteEntry(index));
        buttonArea.appendChild(deleteButton);

        const iconElementDelete = document.createElement("i");
        iconElementDelete.classList.add("fa-regular", "fa-circle-xmark");
        iconElementDelete.style.color = "#d93a1a";
        deleteButton.appendChild(iconElementDelete);

        tableBody.appendChild(wapper);

    }
}

function editEntry(index) {
    editIndex = index
    const entrytext = document.getElementById("to-do-entry").textContent

    inputField.value = toDoData[editIndex]

    document.getElementById("add-button").textContent = "Update";

}

function addEntry(event) {
    var errorMess = document.getElementById("errorMesssage")
    if (inputField.value == "") {
        if (errorMess) {
            errorMess.textContent = "This field cannot be empty";
            return;
        } else {
            var element = '<div class="col-12 text-start" ><span class="text-danger" id="errorMesssage">This field cannot be empty</span></div>';
            document.getElementById("edit-box").insertAdjacentHTML("afterend", element);
            errorMess = document.getElementById("errorMesssage")
            errorMess.text("");
            return;
        }
    }
    event.preventDefault();
    if (isNaN(editIndex)) {
        toDoData.push(inputField.value);
    } else {
        toDoData[editIndex] = inputField.value;
        editIndex = NaN;
    }
    //Get input values

    renderTable(toDoData);
    inputField.value = "";
    addButton.textContent = "Add"

}


function deleteEntry(index) {

    toDoData.splice(index, 1);
    renderTable();
}
addButton.addEventListener("click", addEntry);
addButton.addEventListener("keydown", (event) => {
    console.log("enter");
    if (event.key == "Enter") {
        addEntry(event)
    }
});


//adding event for clear all item
document.getElementById("clear-all-btn").onclick = () => {
    toDoData.length = 0
    renderTable();
}