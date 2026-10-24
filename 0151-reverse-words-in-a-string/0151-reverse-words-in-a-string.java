class Solution {
    public String reverseWords(String s) {
        String arr[]=new String[s.length()];
        String a ="";
        int j=0;
        int i=0;
        int p=0;
        for( i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                
            }
            else{
                break;
            }
        }
        for(p=s.length()-1;p>=0;p--){
            if(s.charAt(p)==' '){

            }
            else{
                break;
            }
        }
        while(i<=p){
            if(s.charAt(i)!= ' '){
                if(arr[j]== null){
                arr[j]="" +s.charAt(i);
                i++;}
                else{
                arr[j]=arr[j]+s.charAt(i);
                i++;
                }
            }
            else{
                j++;

                while(i<=p){
                    if(s.charAt(i)==' '){
                        i++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        a=arr[j];
        j--;
        while(j>=0){
            a= a + " "+arr[j];
            j--;
        }
        return a;
    }
}