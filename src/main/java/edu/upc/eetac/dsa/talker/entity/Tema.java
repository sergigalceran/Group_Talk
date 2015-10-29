package edu.upc.eetac.dsa.talker.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by Sergi1 on 26/10/2015.
 */
public class Tema {
    @InjectLinks({})
    private List<Link> links;
    private String tema_id;
    private String grup_id;
    private String tema_subject;
    private long creationTimestamp;
    private long lastModified;

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getTema_id() {
        return tema_id;
    }

    public void setTema_id(String tema_id) {
        this.tema_id = tema_id;
    }

    public String getTema_subject() {
        return tema_subject;
    }

    public void setTema_subject(String tema_subject) {
        this.tema_subject = tema_subject;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public String getGrup_id() {
        return grup_id;
    }

    public void setGrup_id(String grup_id) {
        this.grup_id = grup_id;
    }
}
