package org.big.wy.repository;

import org.big.wy.entity.ATest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATestRepository extends JpaRepository<ATest, Integer> {

}
