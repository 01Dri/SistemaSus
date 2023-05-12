package me.dri.sistemasus.repositories;

import me.dri.sistemasus.entities.SenhaItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenhaItemRepository extends JpaRepository<SenhaItem, Integer> {
}
