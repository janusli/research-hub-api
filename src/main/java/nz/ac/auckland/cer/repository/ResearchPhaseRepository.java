package nz.ac.auckland.cer.repository;

import nz.ac.auckland.cer.model.ResearchPhase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchPhaseRepository extends JpaRepository<ResearchPhase, Integer> {
}
