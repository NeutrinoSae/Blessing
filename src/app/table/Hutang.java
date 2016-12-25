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
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SEED
 */
@Entity
@Table(name = "HUTANG", catalog = "", schema = "BLESSING")
@XmlRootElement
@app.ListUrutan({
    "nama"
        ,"alamat"
        ,"nomorhp"
        ,"nomorktp"
        ,"jumlahpinjaman"
        ,"sisapinjaman"
        ,"keterangan"
        ,"tanggalpinjam" 
        ,"tanggallunas"
})
@NamedQueries({
    @NamedQuery(name = "Hutang.findAll", query = "SELECT h FROM Hutang h")
    , @NamedQuery(name = "Hutang.findByHutangid", query = "SELECT h FROM Hutang h WHERE h.hutangid = :hutangid")
    , @NamedQuery(name = "Hutang.findByAlamat", query = "SELECT h FROM Hutang h WHERE h.alamat = :alamat")
    , @NamedQuery(name = "Hutang.findByJumlahpinjaman", query = "SELECT h FROM Hutang h WHERE h.jumlahpinjaman = :jumlahpinjaman")
    , @NamedQuery(name = "Hutang.findByNama", query = "SELECT h FROM Hutang h WHERE h.nama = :nama")
    , @NamedQuery(name = "Hutang.findByNomorhp", query = "SELECT h FROM Hutang h WHERE h.nomorhp = :nomorhp")
    , @NamedQuery(name = "Hutang.findByNomorktp", query = "SELECT h FROM Hutang h WHERE h.nomorktp = :nomorktp")
    , @NamedQuery(name = "Hutang.findBySisapinjaman", query = "SELECT h FROM Hutang h WHERE h.sisapinjaman = :sisapinjaman")
    , @NamedQuery(name = "Hutang.findByTanggallunas", query = "SELECT h FROM Hutang h WHERE h.tanggallunas = :tanggallunas")
    , @NamedQuery(name = "Hutang.findByTanggalpinjam", query = "SELECT h FROM Hutang h WHERE h.tanggalpinjam = :tanggalpinjam")})
public class Hutang implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false) @GeneratedValue
    @Column(name = "HUTANGID", nullable = false)
    private Integer hutangid;
    @Column(name = "ALAMAT", length = 255)
    private String alamat = "input";
    @Column(name = "JUMLAHPINJAMAN")
    private BigInteger jumlahpinjaman = new BigInteger("0");
    @Lob
    @Column(name = "KETERANGAN")
    private String keterangan ="input" ;
    @Column(name = "NAMA", length = 255)
    private String nama = "input";
    @Column(name = "NOMORHP", length = 255)
    private String nomorhp = "input";
    @Column(name = "NOMORKTP", length = 255)
    private String nomorktp = "input";
    @Column(name = "SISAPINJAMAN")
    private BigInteger sisapinjaman = new BigInteger("0");
    @Column(name = "TANGGALLUNAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggallunas = new Date();
    @Column(name = "TANGGALPINJAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalpinjam = new Date();
    @OneToMany(mappedBy = "hutangid",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Bayarhutang> bayarhutangs;
    @Column(name = "BUNGA")
    private BigInteger bunga;

    public static final String PROP_BUNGA = "bunga";

    /**
     * Get the value of bunga
     *
     * @return the value of bunga
     */
    public BigInteger getBunga() {
        return bunga;
    }

    /**
     * Set the value of bunga
     *
     * @param bunga new value of bunga
     */
    public void setBunga(BigInteger bunga) {
        BigInteger oldBunga = this.bunga;
        this.bunga = bunga;
        changeSupport.firePropertyChange(PROP_BUNGA, oldBunga, bunga);
    }

    public List<Bayarhutang> getBayarhutangs() {
        return bayarhutangs;
    }

    public void setBayarhutangs(List<Bayarhutang> bayarhutangs) {
        this.bayarhutangs = bayarhutangs;
    }

    public Hutang() {
    }

    public Hutang(Integer hutangid) {
        this.hutangid = hutangid;
    }

    public Integer getHutangid() {
        return hutangid;
    }

    public void setHutangid(Integer hutangid) {
        this.hutangid = hutangid;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public BigInteger getJumlahpinjaman() {
        return jumlahpinjaman;
    }

    public void setJumlahpinjaman(BigInteger jumlahpinjaman) {
        BigInteger oldJumlahpinjaman = this.jumlahpinjaman;
        this.jumlahpinjaman = jumlahpinjaman;
        changeSupport.firePropertyChange("jumlahpinjaman", oldJumlahpinjaman, jumlahpinjaman);
    }

    public String getKeterangan() {
        return keterangan;
    }
    public String getLunas()
    {
        if (sisapinjaman != null) {
        int res = this.sisapinjaman.compareTo(BigInteger.ZERO);                
        String temp =  (res <= 0)?"[Lunas]":"[Belum Lunas]";
        return temp;
        }
        return "Null";
    }
    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        String oldNomorhp = this.nomorhp;
        this.nomorhp = nomorhp;
        changeSupport.firePropertyChange("nomorhp", oldNomorhp, nomorhp);
    }

    public String getNomorktp() {
        return nomorktp;
    }

    public void setNomorktp(String nomorktp) {
        String oldNomorktp = this.nomorktp;
        this.nomorktp = nomorktp;
        changeSupport.firePropertyChange("nomorktp", oldNomorktp, nomorktp);
    }

    public BigInteger getSisapinjaman() {
        return sisapinjaman;
    }

    public void setSisapinjaman(BigInteger sisapinjaman) {
        BigInteger oldSisapinjaman = this.sisapinjaman;
        this.sisapinjaman = sisapinjaman;
        changeSupport.firePropertyChange("sisapinjaman", oldSisapinjaman, sisapinjaman);
//        changeSupport.fi
    }
    @PostPersist    @PostUpdate
    public void Hitung()
    {
        BigInteger temp = BigInteger.ZERO;
        for (Bayarhutang bayars : bayarhutangs) {
            temp = temp.add(bayars.getPengeluaran());
            temp = temp.subtract(bayars.getPemasukan());            
        }
        temp = temp.add(bunga);
        setSisapinjaman(temp);
    }

    public Date getTanggallunas() {
        return tanggallunas;
    }

    public void setTanggallunas(Date tanggallunas) {
        this.tanggallunas = tanggallunas;
    }

    public Date getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(Date tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hutangid != null ? hutangid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hutang)) {
            return false;
        }
        Hutang other = (Hutang) object;
        if ((this.hutangid == null && other.hutangid != null) || (this.hutangid != null && !this.hutangid.equals(other.hutangid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.table.Hutang[ hutangid=" + hutangid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
}
}
