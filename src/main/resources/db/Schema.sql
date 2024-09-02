CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
DROP EXTENSION
CREATE TABLE IF NOT EXISTS address
(
    id                  uuid        NOT NULL PRIMARY KEY,
    apartment_number    INTEGER     NOT NULL,
    building_number     INTEGER     NOT NULL,
    street              VARCHAR     NOT NULL,
    city                VARCHAR     NOT NULL,
    state               VARCHAR     NOT NULL
);
DROP TABLE address;

ALTER TABLE employee
    ADD COLUMN address_id UUID REFERENCES address (id);
