function viewOrder(orderId) {
    alert(`Viewing details for Order ID: ${orderId}`);
}

function cancelOrder(orderId) {
    let confirmation = confirm(`Are you sure you want to cancel Order ID: ${orderId}?`);
    
    if (confirmation) {
        alert(`Order ID: ${orderId} has been canceled.`);
        document.getElementById(`status-${orderId}`).innerText = 'Canceled';
        document.getElementById(`status-${orderId}`).classList.remove('bg-warning');
        document.getElementById(`status-${orderId}`).classList.add('bg-danger');
    }
}


document.addEventListener('DOMContentLoaded', () => {
  
    const viewButtons = document.querySelectorAll('.btn-view');
    viewButtons.forEach(button => {
        button.addEventListener('click', () => {
            const orderId = button.getAttribute('data-order-id');
            viewOrder(orderId);
        });
    });

 
    const cancelButtons = document.querySelectorAll('.btn-cancel');
    cancelButtons.forEach(button => {
        button.addEventListener('click', () => {
            const orderId = button.getAttribute('data-order-id');
            cancelOrder(orderId);
        });
    });
});
