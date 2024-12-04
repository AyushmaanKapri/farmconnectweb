<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Farmer Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        body {
            font-family: 'Arial', sans-serif;
        }

        .sidebar {
            height: 100vh;background-color: #103cbe;color: white;padding-top: 20px;}

        .sidebar a {
            color: white;padding: 10px;text-decoration: none;display: block;margin: 10px 0;}

        .sidebar a:hover {background-color: #575757;border-radius: 5px;}

        .top-bar {
            background-color: #103cbe;color: white;padding: 15px 20px;text-align: right;}

        .dashboard-content {
            margin-top: 20px;
        }

        .profile-card {
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 20px;
            background-color: #f9f9f9;
        }

        .profile-card h4 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

<div class="d-flex">
    <div class="sidebar col-3">
        <h3 class="text-center">Farmer Dashboard</h3>
        <a href="farmerdashboard.html">Home</a>
        <a href="viewProducts.html">View Products</a>
        <a href="addProducts.html">Add Products</a>
        <a href="orders.html">Orders</a>
        <a href="profile.jsp">Profile</a>
        <a href="logout.html">Logout</a>
    </div>

    <!-- Main Content -->
    <div class="col-9">
        <!-- Top Bar -->
        <div class="top-bar">
            <span>Welcome, Farmer!</span>
        </div>

        <!-- Profile Section -->
        <div class="dashboard-content container-fluid">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="profile-card">
                        <h4>Farmer Profile</h4>
                        <form action="UpdateProfileServlet" method="post">
                            <!-- Name Field -->
                            <div class="mb-3">
                                <label for="name" class="form-label">Name</label>
                                <input type="text" class="form-control" id="name" name="name" value="${name}" readonly>
                            </div>

                            <!-- Phone Field -->
                            <div class="mb-3">
                                <label for="phone" class="form-label">Mobile Number</label>
                                <input type="text" class="form-control" id="phone" name="phone" value="${phone}" readonly>
                            </div>

                            <!-- Address Field -->
                            <div class="mb-3">
                                <label for="address" class="form-label">Address</label>
                                <textarea class="form-control" id="address" name="address" rows="3" readonly>${address}</textarea>
                            </div>

                            <!-- Edit Button -->
                            <button type="button" id="edit-btn" class="btn btn-primary">Edit Profile</button>

                            <!-- Save Changes Button (Hidden Initially) -->
                            <button type="submit" id="save-btn" class="btn btn-success d-none">Save Changes</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    document.getElementById('edit-btn').addEventListener('click', function () {
        // Make fields editable
        document.getElementById('name').removeAttribute('readonly');
        document.getElementById('phone').removeAttribute('readonly');
        document.getElementById('address').removeAttribute('readonly');
        
        // Show save button, hide edit button
        document.getElementById('save-btn').classList.remove('d-none');
        this.classList.add('d-none');
    });
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
