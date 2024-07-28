public class rev{
    public static void main(String args[]){
        String original="Anitha";
        String reversed="";
System.out.println("Original String:"+original);
for(int i=0;i<original.length();i++){
    reversed=original.charAt(i)+reversed;

}
System.out.println("Reversed String:"+reversed);

    }
}