CREATE TABLE users (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    create_time TIMESTAMP(3) NOT NULL,
    role VARCHAR(20) NOT NULL
);

CREATE TABLE devices (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    create_time TIMESTAMP(3) NOT NULL,
    device_type VARCHAR(20) NOT NULL
);

CREATE TABLE purchases (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    device_id BIGINT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    color VARCHAR(20) NOT NULL,
    purchase_time TIMESTAMP(3) NOT NULL
);

ALTER TABLE purchases ADD CONSTRAINT purchase_user_id_fk
FOREIGN KEY(user_id) REFERENCES users(id);

ALTER TABLE purchases ADD CONSTRAINT purchase_device_id_fk
FOREIGN KEY(device_id) REFERENCES devices(id);