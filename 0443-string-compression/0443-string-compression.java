class Solution {
    public int compress(char[] chars) {         
        int i=0;
        int j=0;
        boolean a=false;
        ArrayList<Character> list = new ArrayList<>();
        int count=0;
        if(chars.length==1){
            return 1;
        }
        else{
        while(j<chars.length){
            if(chars[i]==chars[j]){
                count++;
                j++;
            }
            else{
                if(count==1){
                    list.add(chars[i]);
                    i=j;
                    count=1;
                    j++;
                }
                else if(count<=10){
                    list.add(chars[i]);
String s = String.valueOf(count);
for (char c : s.toCharArray()) {
    list.add(c);
}
                    count=1;
                    i=j;
                    j++;
                }
else {
    list.add(chars[i]);

    String s = String.valueOf(count);
    for (char c : s.toCharArray()) {
        list.add(c);
    }

    count = 1;
    i = j;
    j++;
}

            }
        }
        if(count!=1){
        list.add(chars[i]);
String s = String.valueOf(count);
for (char c : s.toCharArray()) {
    list.add(c);
}}
else{
    list.add(chars[i]);
}

    i=0;
    if(a==false){
        while(i<list.size()){
            chars[i]=list.get(i);
            i++;
        }}
        else{
        
        }}
        return list.size();
    }
}