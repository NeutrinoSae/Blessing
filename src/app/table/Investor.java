/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.table;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SEED
 */
@Entity
@Table(name = "INVESTOR", catalog = "", schema = "BLESSING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Investor.findAll", query = "SELECT i FROM Investor i"),
    @NamedQuery(name = "Investor.findById", query = "SELECT i FROM Investor i WHERE i.id = :id"),
    @NamedQuery(name = "Investor.findByAlamat", query = "SELECT i FROM Investor i WHERE i.alamat = :alamat"),
    @NamedQuery(name = "Investor.findByKontak", query = "SELECT i FROM Investor i WHERE i.kontak = :kontak"),
    @NamedQuery(name = "Investor.findByModal", query = "SELECT i FROM Investor i WHERE i.modal = :modal"),
    @NamedQuery(name = "Investor.findByNama", query = "SELECT i FROM Investor i WHERE i.nama = :nama"),
    @NamedQuery(name = "Investor.findByPrive", query = "SELECT i FROM Investor i WHERE i.prive = :prive")})
@app.ListUrutan({
    "nama"
    ,"alamat"
    ,"kontak"
//        ,"modal"
})
public class Investor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @javax.persistence.GeneratedValue
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "ALAMAT", length = 255)
    private String alamat = "";
    @Column(name = "KONTAK", length = 255)
    private String kontak = "";
    @Column(name = "Modal")
    private BigInteger modal = BigInteger.ZERO;
    @Column(name = "NAMA", length = 255)
    private String nama = "TOTAL";
    @Column(name = "PRIVE")
    private BigInteger prive = BigInteger.ZERO;
    @OneToMany(mappedBy = "investorId",cascade = {CascadeType.MERGE,CascadeType.REMOVE})
    private List<Saham> sahamList = new ArrayList<>();
    @Column(name = "PERSENTASE")
    private Short persentase = 100;
    @Transient
    private String per = "0%";
    @Transient
    private BigInteger Laba = BigInteger.ZERO;
    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }
    
    public Short getPersentase() {
        return persentase;
    }

    public void setPersentase(Short persentase) {
        this.persentase = persentase;
    }

    public Investor() {
    }

    public Investor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        String oldKontak = this.kontak;
        this.kontak = kontak;
        changeSupport.firePropertyChange("kontak", oldKontak, kontak);
    }

    public BigInteger getModal() {
        return modal;
    }
    public BigInteger getTotalModal()
    {
        BigInteger temp = BigInteger.ZERO;
        for (Saham saham : sahamList) {
            temp = temp.add(saham.getModal() == null? BigInteger.ZERO : saham.getModal().getJumlah());
        }
        return temp;
    }
    
    public BigInteger getTotalPrive()
    {
        BigInteger temp = BigInteger.ZERO;
        for (Saham saham : sahamList) {
            temp = temp.add(saham.getPrive()== null? BigInteger.ZERO : saham.getPrive().getJumlah());                    
        }
        return temp;
    }
    public BigInteger getTotalPembagianLaba()
    {
        BigInteger temp = BigInteger.ZERO;
        for (Saham saham : sahamList) {
            temp = temp.add(saham.getLaba() == null? BigInteger.ZERO : saham.getLaba().getJumlah());
        }
        return temp;
    }
    
    public void setModal(BigInteger modal) {
        BigInteger oldModal = this.modal;
        this.modal = modal;
        changeSupport.firePropertyChange("modal", oldModal, modal);
    }

    public String getNama() {
        return nama;
    }
    public BigInteger getjumlahPembagaian()
    {
//    Laba = BigInteger.ZERO;
    if (1 <= sahamList.size())
        for (Saham saham : sahamList) {
            Laba = Laba.add(saham.getLaba()==null?BigInteger.ZERO:saham.getLaba().getJumlah());
        }
    return Laba;
    }

    public void setLaba(BigInteger Laba) {
        this.Laba = Laba;
    }

    public BigInteger getLaba() {
        return Laba;
    }

    public void setjumlahPembagaian(BigInteger Laba) {
        this.Laba = Laba;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public BigInteger getPrive() {
        return prive;
    }

    public void setPrive(BigInteger prive) {
        BigInteger oldPrive = this.prive;
        this.prive = prive;
        changeSupport.firePropertyChange("prive", oldPrive, prive);
    }

    @XmlTransient
    public List<Saham> getSahamList() {
        return sahamList;
    }

    public void setSahamList(List<Saham> sahamList) {
        this.sahamList = sahamList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Investor)) {
            return false;
        }
        Investor other = (Investor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nama + " [ REF=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
