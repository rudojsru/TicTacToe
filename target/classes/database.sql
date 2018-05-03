-- Table: users
CREATE TABLE users (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- Table: roles
CREATE TABLE roles(
  id int NOT NULL AUTO_INCREMENT primary key ,
  name VARCHAR(100) not null
)
  ENGINE =InnoDB;

-- Table for mapping user and roles: user_roles
CREATE TABLE user_roles(
  user_id int NOT NULL ,
  role_id int NOT NULL ,

  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (role_id) REFERENCES roles(id),

  UNIQUE (user_id,role_id)
)
  ENGINE =InnoDB;

-- Insert data

INSERT INTO users VALUES (1, 'Sasza','12345678');

INSERT  INTO roles VALUES (1,'ROLE_USER');
INSERT  INTO roles VALUES (2,'ROLE_ADMIN');

INSERT  INTO user_roles VALUES (1,2)