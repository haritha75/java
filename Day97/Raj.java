@Cock(rating = 11, star = "scorpio")
@Cock(rating = 72, star = "cancer") //if you want to use same annotation then mention in annotaion repeatable.
class Raj {

        String name;
        Raj(String name) {
            this.name = name;
        }
        Raj() {

        }
        void print() {
            System.out.print(name.toUpperCase());
        }
        void printLn() {
            System.out.print("*");
        }
    }


