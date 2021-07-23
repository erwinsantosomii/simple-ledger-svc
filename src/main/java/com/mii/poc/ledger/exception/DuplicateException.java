package com.mii.poc.ledger.exception;

/**
 *
 * @author ErwinSn
 */
public class DuplicateException extends RuntimeException {
    
    public DuplicateException(String accountNumber) {
        super("Account Number '" + accountNumber + "' already exist");
    }
    
}
