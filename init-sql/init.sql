-- Drop database if it exists
DROP DATABASE IF EXISTS registration_db;

-- Create database
CREATE DATABASE registration_db;

-- Drop table if it exists within the context of the target database
DROP TABLE IF EXISTS users;

-- Create table users
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    dob DATE NOT NULL,
    gender VARCHAR(10) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(15) NOT NULL,
    terms BOOLEAN NOT NULL
);