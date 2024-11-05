package net.hatim.customerjpa2.service;

import lombok.AllArgsConstructor;
import net.hatim.customerjpa2.entities.Utilisateur;
import net.hatim.customerjpa2.repository.UtilisateurRepository;
import net.hatim.customerjpa2.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public ResponseEntity<?> inscription(Utilisateur utilisateur){
        utilisateur = this.utilisateurRepository.save(utilisateur);

        return ResponseEntity.ok(new MessageResponse("Compte utilisateur crée avec succés!"));

    }
}
