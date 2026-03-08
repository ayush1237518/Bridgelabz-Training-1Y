
package com.gla.interfaces-abstraction;

interface SensitiveData {}

class CreditCardInfo implements SensitiveData {
    String cardNumber = "1234-5678-9012";
}

class EncryptionService {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Normal processing");
        }
    }

}
