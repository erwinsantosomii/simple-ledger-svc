package com.mii.poc.ledger.exception;

/**
 *
 * @author ErwinSn
 */
public class DataNotFoundException extends RuntimeException {
    
    public DataNotFoundException(Long id) {
        super("Data with id '" + id + "' not found");
    }
    
    public DataNotFoundException(String accountNumber) {
        super("Data with account number '" + accountNumber + "' not found");
    }
    
}
