package com.smcsolutions.smcsolutions.modelo;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="Enterprises")
public class Enterprise {
    //Atributos
    @Id
    private Long idEnterprise;
    @Column
    private String nameEnterprise;
    @Column
    private String nitEnterprise;
    @Column
    private String phoneEnterprise;
    @Column
    private String addressEnterprise;

    @OneToMany(mappedBy = "enterpriseTransaction")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "enterpriseEmployee")
    private List<Employee> employees;

    @Column
    private Date createAtEnterprise;
    @Column
    private Date updateAtEnterprise;

    @Column
    private  java.sql.Date createdAtEnterprise;

    //Generamos el constructor


    public Enterprise(Long idEnterprise, String nameEnterprise, String nitEnterprise, String phoneEnterprise, String addressEnterprise, Date createAtEnterprise, Date updateAtEnterprise) {
        this.idEnterprise = idEnterprise;
        this.nameEnterprise = nameEnterprise;
        this.nitEnterprise = nitEnterprise;
        this.phoneEnterprise = phoneEnterprise;
        this.addressEnterprise = addressEnterprise;

    }

    //generamos el constructor vacio

    public Enterprise() {

    }

    //Generamos los setter and getters


    public Long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    public void setNameEnterprise(String nameEnterprise) {
        this.nameEnterprise = nameEnterprise;
    }

    public String getNitEnterprise() {
        return nitEnterprise;
    }

    public void setNitEnterprise(String nitEnterprise) {
        this.nitEnterprise = nitEnterprise;
    }

    public String getPhoneEnterprise() {
        return phoneEnterprise;
    }

    public void setPhoneEnterprise(String phoneEnterprise) {
        this.phoneEnterprise = phoneEnterprise;
    }

    public String getAddressEnterprise() {
        return addressEnterprise;
    }

    public void setAddressEnterprise(String addressEnterprise) {
        this.addressEnterprise = addressEnterprise;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Date getCreateAtEnterprise() {
        return createAtEnterprise;
    }

    public void setCreateAtEnterprise(Date createAtEnterprise) {
        this.createAtEnterprise = createAtEnterprise;
    }

    public Date getUpdateAtEnterprise() {
        return updateAtEnterprise;
    }

    public void setUpdateAtEnterprise(Date updateAtEnterprise) {
        this.updateAtEnterprise = updateAtEnterprise;
    }

}
