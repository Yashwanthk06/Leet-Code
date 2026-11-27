class Solution {
    public int[] decrypt(int[] code, int k) {
        int [] a=new int[code.length+code.length];
        for(int i=0;i<code.length;i++){
            a[i]=code[i];
        }
        int b=0;
        for(int i=code.length;i<a.length;i++){
            a[i]=code[b];
            b++;
        }
        b=0;
        if(k==0){
            for(int i=0;i<code.length;i++){
                code[i]=0;
            }
        }
        else{
            int c=0;
            if(k>0){
                for(int i=0;i<code.length;i++){
                    code[i]=0;
                    c=i+1;
                    while(b<k){
                        code[i]=a[c]+code[i];
                        b++;
                        c++;
                    }
                    b=0;
                }
            }
            else{
                for(int i=0;i<code.length;i++){
                    code[i]=0;
                    c=(a.length/2)-1+i;
                    while(b>k){
                        code[i]=a[c]+code[i];
                        b--;
                        c--;
                    }
                    b=0;
                }                
            }
        }
        return code;
    }
}