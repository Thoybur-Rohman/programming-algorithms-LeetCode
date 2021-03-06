public class addBinary {

    public static void main(String[] args) {
        String a = "1111000111";
        String b = "11111";

        addBinary(a,b);
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        System.out.print(i);
        int carry=0;
        while(i>=0 || j>=0){
            int sum = carry;

            if (i>=0){
                sum += a.charAt(i--)-'0';
            }
            if(j>=0){
                sum += b.charAt(j--)-'0';
            }
            sb.insert(0,sum % 2);
            carry = sum/2;

        }
        if (carry>0){
            sb.insert(0,1);
        }

        return sb.toString();
    }

}
