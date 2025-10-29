INSERT INTO workers ( name, salary, birth_date, hire_date, address, city_id, role_id ) VALUES
( ?, ?, ?, ?, ?,
(SELECT id from cities WHERE city = ? ),
(SELECT id from roles WHERE role = ? ));

