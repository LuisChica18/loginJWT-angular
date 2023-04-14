INSERT INTO usuario(id_usuario, nombre, clave, estado) values (1, 'admin', '$2a$10$ju20i95JTDkRa7Sua63JWOChSBc0MNFtG/6Sps2ahFFqN.HCCUMW.', '1');
INSERT INTO usuario(id_usuario, nombre, clave, estado) values (2, 'Luis', '$2a$10$ju20i95JTDkRa7Sua63JWOChSBc0MNFtG/6Sps2ahFFqN.HCCUMW.', '1');

INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (1, 'ADMIN', 'Administrador');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (2, 'USER', 'Usuario');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (3, 'DBA', 'Admin de bd');

INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 3);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (2, 2);
