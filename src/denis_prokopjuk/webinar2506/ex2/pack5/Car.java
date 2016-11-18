package denis_prokopjuk.webinar2506.ex2.pack5;


public class Car {

    public void processData(String data) {
        boolean isValid = validate(data);
    }

    private boolean validate(String text) {
        return text != null && !text.trim().isEmpty();

    }

    private void drive() {

    }
}
