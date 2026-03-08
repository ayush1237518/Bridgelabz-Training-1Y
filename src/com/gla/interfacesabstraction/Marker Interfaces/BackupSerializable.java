
package com.gla.interfaces-abstraction;

interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name = "Prashant";
}

class BackupProcessor {

    public static void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Object backed up successfully");
        } else {
            System.out.println("Object not eligible for backup");
        }
    }
}
