class Solution {
    public String interpret(String command) {
        String res ="";
        for(int i = 0;i<command.length();i++){
            if(i!=command.length()-1 && command.charAt(i) == '(' && command.charAt(i+1)==')'){
                res+='o';
            }else if(command.charAt(i) == '(' || command.charAt(i)==')'){
            }else{
                res+=command.charAt(i);
            }
        }
        return res;
    }
}
