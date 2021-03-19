///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tp2dpbo2021;
//
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author sudir
// */
//@Entity
//@Table(name = "data_mobil")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "DataMobil.findAll", query = "SELECT d FROM DataMobil d")
//    , @NamedQuery(name = "DataMobil.findById", query = "SELECT d FROM DataMobil d WHERE d.id = :id")
//    , @NamedQuery(name = "DataMobil.findByMerk", query = "SELECT d FROM DataMobil d WHERE d.merk = :merk")
//    , @NamedQuery(name = "DataMobil.findByPlat", query = "SELECT d FROM DataMobil d WHERE d.plat = :plat")
//    , @NamedQuery(name = "DataMobil.findByWarna", query = "SELECT d FROM DataMobil d WHERE d.warna = :warna")
//    , @NamedQuery(name = "DataMobil.findByJenis", query = "SELECT d FROM DataMobil d WHERE d.jenis = :jenis")})
//public class DataMobil implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "id")
//    private Integer id;
//    @Basic(optional = false)
//    @Column(name = "merk")
//    private String merk;
//    @Basic(optional = false)
//    @Column(name = "plat")
//    private String plat;
//    @Basic(optional = false)
//    @Column(name = "warna")
//    private String warna;
//    @Basic(optional = false)
//    @Column(name = "jenis")
//    private String jenis;
//
//    public DataMobil() {
//    }
//
//    public DataMobil(Integer id) {
//        this.id = id;
//    }
//
//    public DataMobil(Integer id, String merk, String plat, String warna, String jenis) {
//        this.id = id;
//        this.merk = merk;
//        this.plat = plat;
//        this.warna = warna;
//        this.jenis = jenis;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getMerk() {
//        return merk;
//    }
//
//    public void setMerk(String merk) {
//        this.merk = merk;
//    }
//
//    public String getPlat() {
//        return plat;
//    }
//
//    public void setPlat(String plat) {
//        this.plat = plat;
//    }
//
//    public String getWarna() {
//        return warna;
//    }
//
//    public void setWarna(String warna) {
//        this.warna = warna;
//    }
//
//    public String getJenis() {
//        return jenis;
//    }
//
//    public void setJenis(String jenis) {
//        this.jenis = jenis;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof DataMobil)) {
//            return false;
//        }
//        DataMobil other = (DataMobil) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "tp2dpbo2021.DataMobil[ id=" + id + " ]";
//    }
//    
//}
