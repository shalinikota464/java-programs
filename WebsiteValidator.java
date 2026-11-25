public class WebsiteValidator {
    String url = "https://www.google.com";
    public static void main(String[] args) {
        WebsiteValidator obj = new WebsiteValidator();
        if (obj.url.startsWith("https://")) {
            System.out.println("Secure Website URL");
        } else {
            System.out.println("Invalid Website Protocol");
        }
        obj.url = "http://www.google.com";
        if (obj.url.startsWith("https://")) {
            System.out.println("Secure Website URL");
        } else {
            System.out.println("Invalid Website Protocol");
        }
    }
}
