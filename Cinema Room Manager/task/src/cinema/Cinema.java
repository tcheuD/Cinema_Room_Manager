package cinema;

public class Cinema {
    public static void main(String[] args) {
        Room room = new Room(InputUtils.inputRows(), InputUtils.inputSeats());
        while (true) {
            switch (InputUtils.inputMenuOption()) {
                case 1:
                    room.printRoom();
                    break;
                case 2:
                    while (!room.buyTicket(InputUtils.inputRow(), InputUtils.inputSeat())) ;
                    break;
                case 3:
                    room.caclAndPrintStatistics();
                    break;
                case 0:
                    return;
            }
        }
    }
}