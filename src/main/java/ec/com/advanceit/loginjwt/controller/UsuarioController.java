package ec.com.advanceit.loginjwt.controller;

import ec.com.advanceit.loginjwt.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl userService;

    @GetMapping("/listar-usuarios")
    public ResponseEntity<?> listarUsuarios(){
        return ResponseEntity.ok(userService.listarUsuarios());
    }

}
