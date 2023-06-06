//the warning name suppresses the warning of the usage of the @deprecated method.
public class SuppressWaningAnnotation1 {

    public static void main(String[] args) {

        suppressDeprecatedWarning();

    }
@SuppressWarnings("deprecation")
    static void suppressDeprecatedWarning() {
        SuppressWaningAnnotation1 cls = new SuppressWaningAnnotation1();
        cls.deprecatedMethod(); // no warning here
    }

    @Deprecated
    String deprecatedMethod() {
        return "deprecated method";
    }
}
