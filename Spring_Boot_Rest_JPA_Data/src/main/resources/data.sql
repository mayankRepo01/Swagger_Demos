DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  role VARCHAR(250) DEFAULT NULL
);

INSERT INTO employee (name, role) VALUES
  ('Aliko', 'Software Engineer'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'SE'),
  ('Mayank','SE');
  
 commit;
