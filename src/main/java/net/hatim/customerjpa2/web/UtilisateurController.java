package net.hatim.customerjpa2.web;

import lombok.AllArgsConstructor;
import net.hatim.customerjpa2.entities.Utilisateur;
import net.hatim.customerjpa2.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
public class UtilisateurController {

private UtilisateurRepository utilisateurRepository;

    @GetMapping(path = "/customers")
    public List<Utilisateur> customerList(){
        return utilisateurRepository.findAll();
    }

}
