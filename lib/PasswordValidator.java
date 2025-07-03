package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * @param password string ที่ต้องการตรวจสอบ
     * @return ระดับความแข็งแรงของรหัสผ่าน (INVAID,WEAK, MEDIUM, STRONG)
     * @throws illegalArgumentException if the input array is null or empty.
     */
    public static PasswordStrength validate(String password) 
    { 
        if (password == null || password.length() <8) {
            
            return PasswordStrength.INVALID;

        }
            

        int Upper = 0;
        int lower = 0;
        int digit = 0;
        for(char c : password.toCharArray())   
        {

            if(Character.isLowerCase(c))
            {
                lower++;
            }
            if(Character.isUpperCase(c))
            {
                Upper++;
            }  
            if(Character.isDigit(c)){
                digit++;
            }
        }
        if(lower == password.length())
        {
            return PasswordStrength.WEAK; 
        }
        if(Upper == 1)
        {
            return PasswordStrength.MEDIUM; 
        }
        if((password.length()> 8 )&&(Upper > 1 )&&(digit >=1))
        {
            return PasswordStrength.STRONG;
        }
        return null;
    }

}
