document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("addProductForm");

    form.addEventListener("submit", (event) => {
        event.preventDefault(); 

        const productName = document.getElementById("productName").value.trim();
        const productPrice = document.getElementById("productPrice").value.trim();
        const productQuantity = document.getElementById("productQuantity").value.trim();
        const productDescription = document.getElementById("productDescription").value.trim();
        const productCategory = document.getElementById("productCategory").value;

        // Validate the form data
        if (!productName || !productPrice || !productQuantity || !productCategory) {
            alert("All fields except description are mandatory!");
            return;
        }

        if (isNaN(productPrice) || productPrice <= 0) {
            alert("Please enter a valid price.");
            return;
        }

        if (isNaN(productQuantity) || productQuantity <= 0) {
            alert("Please enter a valid quantity.");
            return;
        }

        const productData = {
            name: productName,
            price: parseFloat(productPrice),
            quantity: parseFloat(productQuantity),
            description: productDescription,
            category: productCategory,
        };

        console.log("Product added:", productData);
        alert("Product added successfully!");

        form.reset();
    });
});
