package nz.ac.auckland.cer.repository;

import nz.ac.auckland.cer.model.LifeCycleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LifeCycleCategoryRepository extends JpaRepository<LifeCycleCategory, Integer> {
}