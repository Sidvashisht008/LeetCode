class Solution {
    public String addBinary(String a, String b) {
        String str = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        LinkedList<Character> res = new LinkedList<>();
        int sum = 0;
        while(i>=0 && j>=0){
            sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
            if(sum == 3){
                res.addFirst('1');
                carry = 1;
            }else if(sum == 2){
                res.addFirst('0');
                carry = 1;
            }else if(sum == 1){
                res.addFirst('1');
                carry = 0;
            }else if(sum == 0){
                res.addFirst('0');
                carry = 0;
            }
            i--;
            j--;
        }
        while(i>=0){
            sum = Character.getNumericValue(a.charAt(i)) + carry;
            if(sum == 2){
                res.addFirst('0');
                carry = 1;
            }else if(sum == 1){
                res.addFirst('1');
                carry = 0;
            }else if(sum == 0){
                res.addFirst('0');
                carry = 0;
            }
            i--;
        }
        while(j>=0){
            sum = Character.getNumericValue(b.charAt(j)) + carry;
            if(sum == 2){
                res.addFirst('0');
                carry = 1;
            }else if(sum == 1){
                res.addFirst('1');
                carry = 0;
            }else if(sum == 0){
                res.addFirst('0');
                carry = 0;
            }
            j--;
        }
        if(carry!=0){
            res.addFirst('1');
        }
        for(char ch:res){
            str+=ch;
        }
        return str;
    }
}
