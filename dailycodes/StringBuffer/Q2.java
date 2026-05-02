class SBDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println("Initial capacity: " + sb.capacity()); // 16

        sb.append("ShashinBagal");
        System.out.println("After 1st append: " + sb.capacity()); // 16

        sb.append("Incubators");
        System.out.println("After 2nd append: " + sb.capacity()); // 34
    }
}
