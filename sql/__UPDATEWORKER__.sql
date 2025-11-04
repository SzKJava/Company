UPDATE workers 
SET name = ?, salary = ?, birth_date = ?, hire_date = ?, address = ?, 
city_id = (SELECT id from cities WHERE city = ? ),
role_id = (SELECT id from roles WHERE role = ? ),
WHERE name = ?;
