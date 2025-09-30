package com.easyjob.easyjob.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreNosotrosController {
    @GetMapping("/sobre")
    public String mostrarLogin() {
        return "sobre_nosotros"; // la vista sobre_nosotros.html
    }
    
}
