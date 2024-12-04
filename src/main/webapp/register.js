document.getElementById('registerForm').addEventListener('submit', function(event) {
    let name = document.getElementsByName('name')[0].value;
    let mobile = document.getElementsByName('mobile')[0].value;
    let password = document.getElementById('password').value;
    
    // Validate Name (can't be empty)
    if (name.trim() === "") {
        alert("Please enter your name.");
        event.preventDefault(); // Prevent form submission
        return;
    }

    // Validate Mobile (must be exactly 10 digits)
    const mobilePattern = /^[0-9]{10}$/;
    if (!mobilePattern.test(mobile)) {
        alert("Please enter a valid 10-digit mobile number.");
        event.preventDefault(); // Prevent form submission
        return;
    }

    // Validate Password (must be at least 8 characters)
    if (password.length < 8) {
        alert("Password must be at least 8 characters long.");
        event.preventDefault(); // Prevent form submission
        return;
    }

    // If all validations pass, show success message
    alert("Registration successful!");
});