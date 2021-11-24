package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book greatgatsby = new Book("Great Gatsby", 220);
        Book terror = new Book("Terror", 830);
        Book it = new Book("It", 1300);
        Book cleancode = new Book("Clean code", 666);
        Book[] stack = new Book[4];
        stack[0] = greatgatsby;
        stack[1] = terror;
        stack[2] = it;
        stack[3] = cleancode;
        printAll(stack);
        System.out.println("Replace Great Gatsby to Clean code.");
        printReplaced(stack, 0, 3);
        System.out.println("Show only Clean code");
        printOnlyOne(stack, "Clean code");
    }

        public static void printAll(Book[] stack) {
            for (Book st : stack) {
                System.out.println(st.getTitle() + " - " + st.getNumberofpages());
            }
        }

        public static void printReplaced(Book[] stack, int first, int second) {
            Book temp = stack[first];
            stack[first] = stack[second];
            stack[second] = temp;
            for (Book st : stack) {
                System.out.println(st.getTitle() + " - " + st.getNumberofpages());
            }
        }

        public static void printOnlyOne(Book[] stack, String title) {
            for (Book st : stack) {
                if (st.getTitle().equals(title)) {
                    System.out.println(st.getTitle() + " - " + st.getNumberofpages());
                }
            }
        }
}