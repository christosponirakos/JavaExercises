/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdateexercise;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class BootCamp {

    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;

    public BootCamp() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.startingDate);
        hash = 37 * hash + Objects.hashCode(this.endingDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BootCamp other = (BootCamp) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.startingDate, other.startingDate)) {
            return false;
        }
        if (!Objects.equals(this.endingDate, other.endingDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BootCamp{" + "name=" + name + ", startingDate=" + startingDate + ", endingDate=" + endingDate + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public BootCamp(String name, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }
}
