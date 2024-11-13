-- Create customers table
CREATE TABLE customers (
                           customer_id INT PRIMARY KEY AUTO_INCREMENT,
                           first_name VARCHAR(50) NOT NULL,
                           last_name VARCHAR(50) NOT NULL,
                           email VARCHAR(100) UNIQUE NOT NULL,
                           phone_number VARCHAR(20) NOT NULL
);

-- Create rooms table
CREATE TABLE rooms (
                       room_id INT PRIMARY KEY AUTO_INCREMENT,
                       room_type VARCHAR(50) NOT NULL,
                       price DECIMAL(10, 2) NOT NULL,
                       status VARCHAR(20) NOT NULL,
                       floor INT NOT NULL
);

-- Create reservations table
CREATE TABLE reservations (
                              reservation_id INT PRIMARY KEY AUTO_INCREMENT,
                              customer_id INT,
                              room_id INT,
                              check_in DATE NOT NULL,
                              check_out DATE NOT NULL,
                              reservation_date DATE NOT NULL,
                              FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE CASCADE,
                              FOREIGN KEY (room_id) REFERENCES rooms(room_id) ON DELETE CASCADE
);

-- Create payments table
CREATE TABLE payments (
                          payment_id INT PRIMARY KEY AUTO_INCREMENT,
                          reservation_id INT,
                          amount DECIMAL(10, 2) NOT NULL,
                          payment_date DATE NOT NULL,
                          payment_method VARCHAR(50) NOT NULL,
                          FOREIGN KEY (reservation_id) REFERENCES reservations(reservation_id) ON DELETE CASCADE
);

-- Create staff table
CREATE TABLE staff (
                       staff_id INT PRIMARY KEY AUTO_INCREMENT,
                       staff_name VARCHAR(100) NOT NULL,
                       role VARCHAR(50) NOT NULL
);

-- Create room assignments table
CREATE TABLE room_assignments (
                                  assignment_id INT PRIMARY KEY AUTO_INCREMENT,
                                  staff_id INT,
                                  room_id INT,
                                  task_description VARCHAR(100),
                                  assignment_date DATE NOT NULL,
                                  FOREIGN KEY (staff_id) REFERENCES staff(staff_id) ON DELETE CASCADE,
                                  FOREIGN KEY (room_id) REFERENCES rooms(room_id) ON DELETE CASCADE
);
-- Insert sample records into customers table
INSERT INTO customers (first_name, last_name, email, phone_number) VALUES
('john', 'doe', 'john.doe@example.com', '1234567890'),
('jane', 'smith', 'jane.smith@example.com', '2345678901'),
('robert', 'brown', 'robert.brown@example.com', '3456789012'),
('alice', 'davis', 'alice.davis@example.com', '4567890123'),
('charlie', 'wilson', 'charlie.wilson@example.com', '5678901234');

-- Insert sample records into rooms table
INSERT INTO rooms (room_type, price, status, floor) VALUES
('single', 100.00, 'available', 1),
('double', 150.00, 'available', 1),
('suite', 300.00, 'occupied', 2),
('single', 100.00, 'maintenance', 2),
('double', 150.00, 'available', 3);

-- Insert sample records into reservations table
INSERT INTO reservations (customer_id, room_id, check_in, check_out, reservation_date) VALUES
(1, 1, '2024-11-01', '2024-11-05', '2024-10-25'),
(2, 2, '2024-11-10', '2024-11-15', '2024-10-26'),
(3, 3, '2024-11-15', '2024-11-20', '2024-11-01'),
(4, 5, '2024-11-20', '2024-11-25', '2024-11-05'),
(5, 4, '2024-11-05', '2024-11-10', '2024-10-30');

-- Insert sample records into payments table
INSERT INTO payments (reservation_id, amount, payment_date, payment_method) VALUES
(1, 500.00, '2024-10-26', 'credit_card'),
(2, 750.00, '2024-10-27', 'cash'),
(3, 1500.00, '2024-11-01', 'paypal'),
(4, 750.00, '2024-11-05', 'credit_card'),
(5, 500.00, '2024-10-31', 'credit_card');

-- Insert sample records into staff table
INSERT INTO staff (staff_name, role) VALUES
('james walker', 'cleaner'),
('susan green', 'maintenance'),
('tom harris', 'manager'),
('emily clark', 'cleaner'),
('david miller', 'maintenance');

-- Insert sample records into room_assignments table
INSERT INTO room_assignments (staff_id, room_id, task_description, assignment_date) VALUES
(1, 1, 'cleaning', '2024-11-01'),
(2, 3, 'maintenance', '2024-11-05'),
(3, 2, 'managing reservation', '2024-10-30'),
(4, 5, 'cleaning', '2024-11-20'),
(5, 4, 'maintenance', '2024-11-10');

SELECT * FROM rooms
WHERE floor = 1 AND status = 'available';

SELECT r.reservation_id, c.first_name, c.last_name, c.email, r.check_in, r.check_out
FROM reservations r
JOIN customers c ON r.customer_id = c.customer_id
ORDER BY r.check_in ASC;

SELECT c.first_name, c.last_name, c.email, DATEDIFF(r.check_out, r.check_in) AS nights
FROM reservations r
JOIN customers c ON r.customer_id = c.customer_id
WHERE DATEDIFF(r.check_out, r.check_in) > 5;

SELECT r.reservation_id, SUM(p.amount) AS total_paid
FROM payments p
JOIN reservations r ON p.reservation_id = r.reservation_id
GROUP BY r.reservation_id;

SELECT room_type, AVG(price) AS average_price
FROM rooms
GROUP BY room_type;

SELECT SUM(p.amount) AS total_revenue
FROM payments p
JOIN reservations r ON p.reservation_id = r.reservation_id
WHERE r.reservation_date >= CURDATE() - INTERVAL 1 MONTH;


SELECT s.staff_name, COUNT(ra.assignment_id) AS assignments
FROM staff s
JOIN room_assignments ra ON s.staff_id = ra.staff_id
WHERE ra.task_description IN ('cleaning', 'maintenance') AND ra.assignment_date >= CURDATE() - INTERVAL 1 MONTH
GROUP BY s.staff_name
ORDER BY assignments DESC
    LIMIT 1;

SELECT c.first_name, c.last_name, c.email, MAX(r.reservation_date) AS latest_reservation
FROM reservations r
JOIN customers c ON r.customer_id = c.customer_id
GROUP BY c.customer_id
ORDER BY latest_reservation DESC;

SELECT * FROM rooms r
WHERE NOT EXISTS (
    SELECT 1
    FROM reservations res
    WHERE res.room_id = r.room_id
      AND res.check_in <= '2024-11-10' AND res.check_out >= '2024-11-05'
);

DELETE FROM reservations WHERE reservation_id = 1; 