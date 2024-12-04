
function displaySuccessMessage() {
   
    const container = document.getElementById("message-container");

   
    const alertDiv = document.createElement("div");
    alertDiv.className = "alert alert-success text-center";
    alertDiv.setAttribute("role", "alert");
    alertDiv.textContent = "Product added successfully!";


    const buttonDiv = document.createElement("div");
    buttonDiv.className = "text-center";

    const backButton = document.createElement("a");
    backButton.className = "btn btn-primary";
    backButton.href = "farmerdashboard.html";
    backButton.textContent = "Back to Dashboard";


    buttonDiv.appendChild(backButton);

    container.appendChild(alertDiv);
    container.appendChild(buttonDiv);
}


document.addEventListener("DOMContentLoaded", displaySuccessMessage);
