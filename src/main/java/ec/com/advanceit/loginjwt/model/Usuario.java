package ec.com.advanceit.loginjwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Integer idUsuario;

    @Column(name = "nombre", nullable = false, unique = true)
    private String username;

    @Column(name = "clave", nullable = false)
    private String password;

    @Column(name = "estado", nullable = false)
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol",
        joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"),
        inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol"))
    private List<Rol> roles;

}
