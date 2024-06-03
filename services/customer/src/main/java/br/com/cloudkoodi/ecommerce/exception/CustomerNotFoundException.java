package br.com.cloudkoodi.ecommerce.exception;

public class CustomerNotFoundException extends RuntimeException {

    private final String msg;

    public CustomerNotFoundException(String message) {
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
