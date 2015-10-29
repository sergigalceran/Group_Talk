package edu.upc.eetac.dsa.talker.entity;

/**
 * Created by Sergi1 on 26/10/2015.
 */
public class TalkerError {
    private int status;
    private String reason;
    public TalkerError(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
