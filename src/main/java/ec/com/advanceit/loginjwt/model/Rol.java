package ec.com.advanceit.loginjwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @Id
    private Integer idRol;

    @Column(length = 15, nullable = false)
    private String nombre;

    @Column(length = 150, nullable = true)
    private String descripcion;
}
