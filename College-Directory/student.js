document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('login-form');

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission

        // Fetch form inputs
        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
        const role = document.getElementById('role').value;

        // Basic client-side validation (you should also validate on server-side)
        if (!username || !password || !role) {
            alert('Please enter username, password, and select a role.');
            return;
        }

        // Simulate API call (replace with actual fetch or axios request)
        // Example assumes backend API endpoint '/login' returns a JWT token or session cookie
        // Adjust endpoint and payload structure as per your backend implementation
        const loginPayload = {
            username: username,
            password: password,
            role: role
        };

        // Simulated API response (replace with actual fetch or axios request)
        console.log('Sending login request...', loginPayload);

        // Simulate successful login (replace with actual success/error handling)
        setTimeout(() => {
            alert(`Logged in successfully as ${role} with username: ${username}`);
            // Redirect or perform actions based on user role
            redirectToDashboard(role);
        }, 1000); // Simulated delay for API call

        // Function to redirect based on user role (example)
        function redirectToDashboard(role) {
            switch (role) {
                case 'STUDENT':
                    window.location.href = '/student-dashboard.html';
                    break;
                case 'FACULTY_MEMBER':
                    window.location.href = '/faculty-dashboard.html';
                    break;
                case 'ADMINISTRATOR':
                    window.location.href = '/admin-dashboard.html';
                    break;
                default:
                    break;
            }
        }
    });
});
