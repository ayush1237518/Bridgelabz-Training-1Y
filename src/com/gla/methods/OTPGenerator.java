
package com.gla.methods;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areAllUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.print("Generated OTPs: ");
        for (int i = 0; i < otps.length; i++) {
            System.out.print(otps[i] + " ");
        }
        System.out.println();

        if (areAllUnique(otps)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Duplicate OTP found");
        }

    }
    
}
