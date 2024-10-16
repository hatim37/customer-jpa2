package net.hatim.customerjpa2.repository;

import net.hatim.customerjpa2.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
