package pe.edu.cibertec.APP_DOCKER_GRUPO24.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/test")
public class TestController {
    @GetMapping
    public String mensaje(){
        log.info("API REST testeo");
        return "GRUPO OSORIO, MANCHAY Y CASTILLO";
    }
}
