import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bi1 = new BigInteger(num1);
        BigInteger bi2 = new BigInteger(num2);
        return bi1.add(bi2).toString();       
    }
}
