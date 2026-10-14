public class Assignment1 {
    public static void main(String[] args) {

        String name = "Sejan";
        int age = 20;
        boolean isEmployed = true;
        String[] skills = { "HTML", "CSS", "JavaScript" };

        System.out.println("Name: " + name + " (Type: String)");
        System.out.println("Age: " + age + " (Type: int)");
        System.out.println("Is Employed: " + isEmployed
                + " (Type: boolean)");

        System.out.print("Skills: [");
        for (int i = 0; i < skills.length; i++) {
            System.out.print("\"" + skills[i] + "\"");
            if (i < skills.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] (Type: String[])");
    }
}