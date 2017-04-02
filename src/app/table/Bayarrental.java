/**
 * This file was generated by the JPA Modeler
 */
package app.table;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author SEED
 */
@Entity
@XmlRootElement
public class Bayarrental extends Laporan implements Serializable {

    @ManyToOne(targetEntity = Rental.class)
    @JoinColumn(name = "RENTAL_ID", referencedColumnName = "RENTALID")
    private Rental rentalId;

    public Rental getRentalId() {
        return this.rentalId;
    }

    public void setRentalId(Rental rentalId) {
        this.rentalId = rentalId;
    }
        @Override
    public String getJenis()
    {
        return "Table "+ getRentalId();
    }

}
