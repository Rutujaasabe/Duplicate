class DuplicateNumber {
    public static void main(String ar[]) {
        boolean temp = false;
        String arr[] = { "apple", "banana", "papaya", "Npple" };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate");
                    temp = true;
                }
            }
        }
        if (temp == false) {
            System.out.println("duplicate not found");
        }
    }
}