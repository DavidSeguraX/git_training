
public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int jump = scanner.nextInt();

        for(int i = 1; i <= max; i += jump){
            System.out.print(i+" ");
        }
    }
}
