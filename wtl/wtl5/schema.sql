-- E-bookshop Database Schema

CREATE DATABASE IF NOT EXISTS ebookshop_db;
USE ebookshop_db;

-- Users Table
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('user', 'admin') DEFAULT 'user',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Books Table
CREATE TABLE IF NOT EXISTS books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    image_url VARCHAR(255),
    category VARCHAR(50),
    stock INT DEFAULT 0
);

-- Orders Table
CREATE TABLE IF NOT EXISTS orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_price DECIMAL(10, 2) NOT NULL,
    status VARCHAR(20) DEFAULT 'Pending',
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- Order Items Table
CREATE TABLE IF NOT EXISTS order_items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    book_id INT,
    quantity INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (book_id) REFERENCES books(id)
);

-- Seed Initial Data
INSERT INTO books (title, author, description, price, image_url, category, stock) VALUES
('The Great Gatsby', 'F. Scott Fitzgerald', 'A story of wealth, love, and the American Dream.', 12.99, 'https://images-na.ssl-images-amazon.com/images/I/81af+MCATTL.jpg', 'Classic', 50),
('1984', 'George Orwell', 'A dystopian social science fiction novel.', 15.50, 'https://images-na.ssl-images-amazon.com/images/I/71kpw99BcDL.jpg', 'Dystopian', 30),
('Clean Code', 'Robert C. Martin', 'A Handbook of Agile Software Craftsmanship.', 45.00, 'https://images-na.ssl-images-amazon.com/images/I/41xShlnTZTL._SX376_BO1,204,203,200_.jpg', 'Programming', 20),
('The Hobbit', 'J.R.R. Tolkien', 'A fantasy novel and children''s book.', 18.95, 'https://images-na.ssl-images-amazon.com/images/I/91b0C2YNSNL.jpg', 'Fantasy', 40),
('Becoming', 'Michelle Obama', 'A deeply personal reckoning of the first African American First Lady.', 24.99, 'https://images-na.ssl-images-amazon.com/images/I/81h2gWFE7LL.jpg', 'Biography', 15);

-- Default Admin User (password: admin123)
-- In a real app, passwords should be hashed.
INSERT INTO users (username, email, password, role) VALUES ('admin', 'admin@ebookshop.com', 'admin123', 'admin');
