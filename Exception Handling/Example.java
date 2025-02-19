class Example {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    static int m1() {
        try {
            System.out.println("In outer try");
            try {
                System.out.println("In Inner try");
            } 
            catch (NullPointerException e) {
                System.out.println("In inner catch");
            } 
            finally {
                System.out.println("In Inner finally");
                return 10;
            }
        } 
        catch (NullPointerException e) {
            System.out.println("In outer catch");
        } 
        finally {
            System.out.println("In outer finally");
        }

        System.out.println("After outer try/catch/finally");
        return 30;
    }
}
