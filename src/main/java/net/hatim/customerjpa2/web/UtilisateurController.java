package net.hatim.customerjpa2.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hatim.customerjpa2.entities.Utilisateur;
import net.hatim.customerjpa2.repository.UtilisateurRepository;
import net.hatim.customerjpa2.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
public class UtilisateurController {

private UtilisateurRepository utilisateurRepository;
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping(path = "/customers")
    public List<Utilisateur> customerList(){
        return utilisateurRepository.findAll();
    }

    @PostMapping(path = "/inscription")
    public void inscription(@RequestBody Utilisateur utilisateur){
        log.info("inscription");
        this.utilisateurService.inscription(utilisateur);
    }

    @GetMapping(path = "/test")
    public ResponseEntity<?> test(){
        return new ResponseEntity<>("Test", HttpStatus.OK);

    }

    public class PingController {
        @GetMapping({"/", "/ping", "/healthz"})
        public String ping() { return "OK"; }
    }

}
