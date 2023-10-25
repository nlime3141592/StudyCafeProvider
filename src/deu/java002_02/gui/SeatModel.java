package deu.java002_02.gui;

public final class SeatModel extends Model {
    private boolean[] seatReservations;

    public SeatModel() {
        seatReservations = new boolean[60];
    }

    public void updateSeat(int seatIndex, boolean isReserved) {
        if (seatIndex >= 0 && seatIndex < seatReservations.length) {
            seatReservations[seatIndex] = isReserved;
        }
    }

    public boolean isSeatReserved(int seatIndex) {
        if (seatIndex >= 0 && seatIndex < seatReservations.length) {
            return seatReservations[seatIndex];
        }
        return false;
    }
}