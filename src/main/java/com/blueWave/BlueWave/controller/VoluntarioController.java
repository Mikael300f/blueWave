package com.blueWave.BlueWave.controller;

import com.blueWave.BlueWave.model.Voluntario;
import com.blueWave.BlueWave.repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class VoluntarioController {

    @Autowired
    private VoluntarioRepository vr;


    @PostMapping("/submitForm")
    public  String submitForm(@ModelAttribute Voluntario voluntario){


        vr.save(voluntario);

        return "redirect:/login";
    }


    @PostMapping("/login")
    public String loginForm(@RequestParam("email") String email,
                            @RequestParam("senha") String senha){

        Voluntario voluntario = vr.findByEmail(email);

        if (voluntario != null && voluntario.getSenha().equals(senha)){
            return "redirect:/sucesso";
        }else {
            return "login";
        }

    }



}
