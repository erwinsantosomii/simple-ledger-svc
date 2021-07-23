package com.mii.poc.ledger.controller;

import com.mii.poc.ledger.RestResponse;
import com.mii.poc.ledger.dao.LedgerRepository;
import com.mii.poc.ledger.domain.Ledger;
import com.mii.poc.ledger.exception.DataNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ErwinSn
 */
@RestController
@RequestMapping("/api/ledger")
public class LedgerController {

    @Autowired
    private LedgerRepository ledgerRepository;

    @GetMapping(path = {"/account/{id}", ""}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<List<Ledger>>> getAllByAccount(@PathVariable Long id) {
        List<Ledger> ledgers = ledgerRepository.findByAccountId(id);
        return ResponseEntity.ok().body(RestResponse.success(ledgers));
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse<Ledger>> get(@PathVariable Long id) {
        Ledger l = ledgerRepository.findById(id)
                .map(ledger -> {
                    return ledger;
                })
                .orElseThrow(() -> new DataNotFoundException(id));
        return ResponseEntity.ok().body(RestResponse.success(l));
    }

    @PostMapping(path = "/overbooking", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestResponse> save(@RequestBody List<Ledger> ledgers) {
        ledgerRepository.saveAll(ledgers);
        return ResponseEntity.ok().body(RestResponse.success("Overbooking Success"));
    }

}
