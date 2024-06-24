package exceptions;

public class SeatNumberException extends Exception {
        private String message;
        public SeatNumberException(String message) {
            super(message);
        }
}
