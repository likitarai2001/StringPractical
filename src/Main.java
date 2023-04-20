public class Main {
    public static void main(String[] args) {
        String str1 = " Simform ";

        StringBuilder str2 = new StringBuilder(" The quick");
        str2.append(" brown")
                .append(" fox jumps")
                .append(" over the")
                .append(" lazy dog. ");

        StringBuffer str3 = new StringBuffer(" Sphinx");
        str3.append(" of black quartz,")
                .append(" judge")
                .append(" my ")
                .append("vow.");

        System.out.println(str1.toUpperCase().trim());
        System.out.println(str2.toString().toUpperCase().trim());
        System.out.println(str3.toString().toUpperCase().trim());
    }
}