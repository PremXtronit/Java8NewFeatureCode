package java8.optional;

import java.util.Optional;

public class OptionalInDepth {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");

        System.out.println(gender);
        System.out.println(gender.get());
        System.out.println(Optional.empty());

        String answer1 = "Yes";
        String answer2 = null;

        System.out.println(Optional.ofNullable(answer1));
        System.out.println(Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println(Optional.of(answer2));

        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

        System.out.println(gender.orElse("not available")); //MALE
        System.out.println(emptyGender.orElse("not available"));

        System.out.println(gender.orElseGet(() -> "not available")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "not available"));
    }

}
