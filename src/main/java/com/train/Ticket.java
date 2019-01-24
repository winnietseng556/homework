package com.train;

public class Ticket {
    private int price = 1000;
    private float discount = 0.9f;
    private int tickets;
    private int returns;

    public Ticket(int tickets, int returns) {
        this.tickets = tickets;
        this.returns = returns;
    }

    public int getTotal() {
        int single = ticketsCheck() ? tickets - returns : 0;

        if (ticketsCheck()) {
            return (int) ((price * single) + (price * 2 * returns * discount));
        }
        return 0;
    }

    public void printReceipt() {
        if(ticketsCheck()) {
            System.out.println("Total tickets: " + tickets);
            System.out.println("Round-trip: " + returns);
            System.out.println("Total: " + getTotal());
        }else{
            System.out.println("數量錯誤，請重新輸入");
        }
    }

    public boolean ticketsCheck() {
        return tickets - returns >= 0;
    }
}
