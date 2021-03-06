package nz.ac.auckland.cer.repository;

import nz.ac.auckland.cer.model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleTypeRepository extends JpaRepository<RoleType, Integer> {
}
