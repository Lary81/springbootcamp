DROP TABLE IF EXISTS product;

CREATE TABLE product (
  ID    BIGSERIAL NOT NULL PRIMARY KEY,
  NAME  TEXT      NOT NULL,
  PRICE DECIMAL   NOT NULL
);

INSERT INTO product (NAME, PRICE) VALUES ('konewka', 10);
INSERT INTO product (NAME, PRICE) VALUES ('szpadel', 100);
INSERT INTO product (NAME, PRICE) VALUES ('taczki', 150);
INSERT INTO product (NAME, PRICE) VALUES ('kosiarka', 1500);