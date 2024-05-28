package com.viscaya.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="SERVICIOS")
public class Servicios implements Serializable {

    private static final long serialVersionUID = 856364927702777747L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false, precision=19)
    private long id;
    @Column(name="ID_APP", nullable=false, precision=19)
    private long idApp;
    @Column(name="NOMBRE", nullable=false, length=200)
    private String nombre;
    @Column(name="DESCRIPCION", nullable=false, length=1500)
    private String descripcion;
    @Column(name="IMG", nullable=true, length=220)
    private String img;
    @Column(name="ESTADO", nullable=false, precision=1)
    private short estado;
    @Column(name="FECHA_CREACION", nullable=false)
    private LocalDateTime fechaCreacion;
    @Column(name="FECHA_MODIFICACION", nullable=true)
    private LocalDateTime fechaModificacion;

    /** Default constructor. */
    public Servicios() {
        super();
    }

    /**
     * Access method for idAplicacion.
     *
     * @return the current value of idAplicacion
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for idAplicacion.
     *
     * @param aIdAplicacion the new value for idAplicacion
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Access method for idRepresentante.
     *
     * @return the current value of idRepresentante
     */
    public long getIdApp() {
        return idApp;
    }

    /**
     * Setter method for idRepresentante.
     *
     * @param aIdRepresentante the new value for idRepresentante
     */
    public void setIdApp(long idApp) {
    	this.idApp = idApp;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for pais.
     *
     * @return the current value of pais
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for pais.
     *
     * @param aPais the new value for pais
     */
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion;
    }

  
    public String getImg() {
        return img;
    }

 
    public void setImg(String img) {
    	this.img = img;
    }

    public short getEstado() {
    	return estado;
    }
    /**
     * Setter method for estad0.
     *
     * @param aEstad0 the new value for estad0
     */
    public void setEstado(short estado) {
    	this.estado = estado;
    }

    /**
     * Access method for fechaCreacion.
     *
     * @return the current value of fechaCreacion
     */
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Setter method for fechaCreacion.
     *
     * @param aFechaCreacion the new value for fechaCreacion
     */
    public void setFechaCreacion(LocalDateTime aFechaCreacion) {
        fechaCreacion = aFechaCreacion;
    }
    
    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }
    
    public void setFechaModificacion(LocalDateTime fechaModificacion) {
    	this.fechaModificacion = fechaModificacion;
    }
    
    
    /**
     * Compares the key for this instance with another Aplicaciones.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Aplicaciones and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Servicios)) {
            return false;
        }
        Servicios that = (Servicios) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Aplicaciones.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Servicios)) return false;
        return this.equalKeys(other) && ((Servicios)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = (int)(getId() ^ (getId()>>>32));
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Aplicaciones |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idAplicacion", Long.valueOf(getId()));
        return ret;
    }

	

}
