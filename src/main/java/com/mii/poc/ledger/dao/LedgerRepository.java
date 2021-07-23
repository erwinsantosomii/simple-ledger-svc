package com.mii.poc.ledger.dao;

import com.mii.poc.ledger.domain.Ledger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ErwinSn
 */
@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Long> {
    
    List<Ledger> findByAccountId(Long id);
    
}
