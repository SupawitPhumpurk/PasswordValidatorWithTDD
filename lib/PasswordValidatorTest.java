package lib;

public class PasswordValidatorTest{
    
    public static void run() {
       System.out.println("--- Running Password Validator Tests ---");
        String pw = "123";


        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate(pw);

        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1: "+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1: "+pw+"FAILED: Expected INVALID but got " + result1);
        }

          
          // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กควรจะ WEAK
          pw = "supawitstar";
           PasswordStrength result2 = PasswordValidator.validate(pw);
if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2:"+pw+"  Passed:All lowercase password is WEAK");
        } else {
            System.out.println("Test Case 2: "+pw+" FAILED: Expected WEAK but got " + result2);
        }
        // Test Case 3: รหัสผ่านปลานกลางควรจะ MEDIUM
        pw = "Supawitstar";
        PasswordStrength result3 = PasswordValidator.validate(pw);
       if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3:"+pw+" Passed: password just have1 Uppercase password is MEDIUM");
        } else {
            System.out.println("Test Case 3:"+pw+" FAILED: Expected MEDIUM but got " + result3);
        }
         pw = "SupawitStar123";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4:"+pw+" Passed: password is STORNG");
        } else {
            System.out.println("Test Case 4:"+pw+" FAILED: Expected STORNG but got " + result4);
        }
        System.out.println("--------------------------------");
    }
}

