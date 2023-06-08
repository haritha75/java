@Priority(rating = 5,star = "jock")
class Crane {

    String name;
    Crane(String name) {
        this.name = name;
    }
    Crane() {

    }
    void printLn() {
        System.out.println(name.toUpperCase());
    }
    void print() {
        System.out.print("*");
    }
}
