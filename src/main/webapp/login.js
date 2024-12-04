document.getElementById('loginForm').addEventListener('submit', function(event) {
    let mobile = document.getElementsByName('mobile')[0].value;
    let password = document.getElementById('password').value;
    
    const mobilePattern = /^[0-9]{10}$/;
    if (!mobilePattern.test(mobile)) {
        alert("Please enter a valid 10-digit mobile number.");
        event.preventDefault(); // Prevent form submission
        return;
    }

    if (password.length < 8) {
        alert("Password must be at least 8 characters long.");
        event.preventDefault(); // Prevent form submission
        return;
    }

    alert("Login successful!");
});
