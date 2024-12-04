// Function to handle the product deletion
function deleteProduct(event) {
    // Confirm if the user really wants to delete the product
    if (confirm("Are you sure you want to delete this product?")) {
        // Get the row to be deleted
        const row = event.target.closest('tr');
        row.remove();  // Remove the row from the table
    }
}
