CREATE DATABASE 'psmsdb';
USE psmsdb;
CREATE TABLE `stuff` (
    `stuff_id` int(11) NOT NULL,
    `name` varchar (200) DEFAULT NULL,
    `description` text,
    `quantity` int(11) DEFAULT NULL,
    `location` varchar(145) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;