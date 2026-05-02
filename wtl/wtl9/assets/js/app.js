var app = angular.module('authApp', []);

app.controller('authController', function($scope, $timeout) {
    // Initial State
    $scope.view = 'login'; // login, register, dashboard
    $scope.message = {
        text: '',
        type: '' // error, success
    };

    // User Data Initialization
    if (!localStorage.getItem('users')) {
        localStorage.setItem('users', JSON.stringify([]));
    }

    $scope.getUsers = function() {
        return JSON.parse(localStorage.getItem('users'));
    };

    // Form Models
    $scope.regData = {};
    $scope.loginData = {};
    $scope.currentUser = null;

    // View Toggling
    $scope.setView = function(view) {
        $scope.message.text = '';
        $scope.view = view;
    };

    // Registration Logic
    $scope.register = function() {
        var users = $scope.getUsers();
        
        // Check if username exists
        var exists = users.find(u => u.username === $scope.regData.username);
        if (exists) {
            $scope.showMessage('Username already exists!', 'error');
            return;
        }

        // Add user
        users.push(angular.copy($scope.regData));
        localStorage.setItem('users', JSON.stringify(users));

        $scope.showMessage('Registration successful! Please login.', 'success');
        $timeout(function() {
            $scope.setView('login');
            $scope.regData = {};
        }, 1500);
    };

    // Login Logic
    $scope.login = function() {
        var users = $scope.getUsers();
        var user = users.find(u => u.username === $scope.loginData.username && u.password === $scope.loginData.password);

        if (user) {
            $scope.currentUser = user;
            $scope.showMessage('Login successful!', 'success');
            $timeout(function() {
                $scope.setView('dashboard');
                $scope.loginData = {};
            }, 1000);
        } else {
            $scope.showMessage('Invalid username or password.', 'error');
        }
    };

    // Logout
    $scope.logout = function() {
        $scope.currentUser = null;
        $scope.setView('login');
    };

    // Helpers
    $scope.showMessage = function(text, type) {
        $scope.message.text = text;
        $scope.message.type = type;
        $timeout(function() {
            $scope.message.text = '';
        }, 3000);
    };
});
