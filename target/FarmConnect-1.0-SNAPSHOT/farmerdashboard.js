
function updateDashboard() {
    const dashboardData = {
        totalProducts: 50,    
        totalSales: 120,
        pendingOrders: 5,
        farmerName: "Raghuvar Dutt" 
    };

    document.querySelector(".dashboard-card:nth-child(1) p").textContent = dashboardData.totalProducts;
    document.querySelector(".dashboard-card:nth-child(2) p").textContent = dashboardData.totalSales;
    document.querySelector(".dashboard-card:nth-child(3) p").textContent = dashboardData.pendingOrders;

    
    document.querySelector(".top-bar .font-weight-bold").textContent = dashboardData.farmerName;
}

document.addEventListener("DOMContentLoaded", updateDashboard);
