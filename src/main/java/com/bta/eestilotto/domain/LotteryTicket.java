package com.bta.eestilotto.domain;

public class LotteryTicket extends BaseEntity {
    private Long resultId;
    private Long userAccountId;
    private int ticketNum1;
    private int ticketNum2;
    private int ticketNum3;
    private int ticketNum4;
    private int ticketNum5;
    private int ticketNum6;

    public LotteryTicket(Long id, Long resultId, Long userAccountId, int ticketNum1, int ticketNum2, int ticketNum3, int ticketNum4, int ticketNum5, int ticketNum6) {
        super(id);
        this.resultId = resultId;
        this.userAccountId = userAccountId;
        this.ticketNum1 = ticketNum1;
        this.ticketNum2 = ticketNum2;
        this.ticketNum3 = ticketNum3;
        this.ticketNum4 = ticketNum4;
        this.ticketNum5 = ticketNum5;
        this.ticketNum6 = ticketNum6;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public int getTicketNum1() {
        return ticketNum1;
    }

    public void setTicketNum1(int ticketNum1) {
        this.ticketNum1 = ticketNum1;
    }

    public int getTicketNum2() {
        return ticketNum2;
    }

    public void setTicketNum2(int ticketNum2) {
        this.ticketNum2 = ticketNum2;
    }

    public int getTicketNum3() {
        return ticketNum3;
    }

    public void setTicketNum3(int ticketNum3) {
        this.ticketNum3 = ticketNum3;
    }

    public int getTicketNum4() {
        return ticketNum4;
    }

    public void setTicketNum4(int ticketNum4) {
        this.ticketNum4 = ticketNum4;
    }

    public int getTicketNum5() {
        return ticketNum5;
    }

    public void setTicketNum5(int ticketNum5) {
        this.ticketNum5 = ticketNum5;
    }

    public int getTicketNum6() {
        return ticketNum6;
    }

    public void setTicketNum6(int ticketNum6) {
        this.ticketNum6 = ticketNum6;
    }
}
