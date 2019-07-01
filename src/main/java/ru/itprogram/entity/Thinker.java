package ru.itprogram.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "thinker")
public class Thinker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "time_of_creation")
    private LocalDateTime timeOfCreation;

    public Thinker() {
    }

    public Thinker(long id, String title, String text, LocalDateTime timeOfCreation) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.timeOfCreation = timeOfCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(LocalDateTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thinker thinker = (Thinker) o;
        return id == thinker.id &&
                Objects.equals(title, thinker.title) &&
                Objects.equals(text, thinker.text) &&
                Objects.equals(timeOfCreation, thinker.timeOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, timeOfCreation);
    }

    @Override
    public String toString() {
        return "Thinker{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", timeOfCreation=" + timeOfCreation +
                '}';
    }
}
