package linearSearch;

public class searchInString {
    public static void main(String[] args) {
        String name="akhil";
        System.out.println(func(name,'z'));
    }

    static boolean func(String name, char target) {
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
