package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        return "Browsing: ";
    }

    @Override
    public String call() {
        return "Calling... ";
    }

    public void callAll() {
        for (String number : this.numbers) {
            if (isValidPhoneNumber(number)) {
                System.out.println(call() + number);
            } else {
                System.out.println("Invalid number!");
            }
        }
    }

    public void browseAll() {
        for (String url : this.urls) {
            if (isValidUrl(url)) {
                System.out.println(browse() + url + "!");
            } else {
                System.out.println("Invalid URL!");
            }
        }
    }

    private boolean isValidUrl(String url) {
        boolean isValid = true;
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        boolean isValid = true;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
