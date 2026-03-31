public class SmartShelf {
    public static void main(String[] args) {
        String[] b = {"Java","C","Python"};
        for(int i=1;i<b.length;i++){
            String key=b[i]; int j=i-1;
            while(j>=0 && b[j].compareTo(key)>0){
                b[j+1]=b[j]; j--;
            }
            b[j+1]=key;
        }
        for(String s:b) System.out.println(s);
    }
}
