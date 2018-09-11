package org.endurance.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@Table(name="producto")
@NamedQuery(name="Productos.findAll", query="SELECT p FROM Productos p")
public class Productos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PRODUCTO")
	private int idProducto;

	private double alerta;

	private String barrcode;

	@Column(name="BARRCODE_CREADO")
	private String barrcodeCreado;

	private String color;

	@Lob
	@Column(name="DESCRIPCION_PRODUCTO")
	private String descripcionProducto;

	private String estilo;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ELABORACION_PRODUCTO")
	private Date fechaElaboracionProducto;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENCIMIENTO_PRODUCTO")
	private Date fechaVencimientoProducto;

	@Column(name="ID_TIPO_PRODUCTO")
	private int idTipoProducto;

	@Column(name="idsub_categoria")
	private int idsubCategoria;

	@Lob
	@Column(name="IMG_PRODUCTO")
	private byte[] imgProducto;

	private String marca;

	private String modelo;

	@Column(name="NOMBRE_PRODUCTO")
	private String nombreProducto;

	private double peso;

	@Column(name="PRECIO_COMPRA")
	private float precioCompra;

	@Column(name="PRECIO_VENTA")
	private float precioVenta;

	private String presentacion;

	private String serie;

	private String stage;

	private int stock;

	private double talla;

	private String version;

	public Productos() {
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getAlerta() {
		return this.alerta;
	}

	public void setAlerta(double alerta) {
		this.alerta = alerta;
	}

	public String getBarrcode() {
		return this.barrcode;
	}

	public void setBarrcode(String barrcode) {
		this.barrcode = barrcode;
	}

	public String getBarrcodeCreado() {
		return this.barrcodeCreado;
	}

	public void setBarrcodeCreado(String barrcodeCreado) {
		this.barrcodeCreado = barrcodeCreado;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcionProducto() {
		return this.descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public String getEstilo() {
		return this.estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Date getFechaElaboracionProducto() {
		return this.fechaElaboracionProducto;
	}

	public void setFechaElaboracionProducto(Date fechaElaboracionProducto) {
		this.fechaElaboracionProducto = fechaElaboracionProducto;
	}

	public Date getFechaVencimientoProducto() {
		return this.fechaVencimientoProducto;
	}

	public void setFechaVencimientoProducto(Date fechaVencimientoProducto) {
		this.fechaVencimientoProducto = fechaVencimientoProducto;
	}

	public int getIdTipoProducto() {
		return this.idTipoProducto;
	}

	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public int getIdsubCategoria() {
		return this.idsubCategoria;
	}

	public void setIdsubCategoria(int idsubCategoria) {
		this.idsubCategoria = idsubCategoria;
	}

	public byte[] getImgProducto() {
		return this.imgProducto;
	}

	public void setImgProducto(byte[] imgProducto) {
		this.imgProducto = imgProducto;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public float getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getPresentacion() {
		return this.presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getTalla() {
		return this.talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String mama() {
		 String a ="abc";
		 return a;
	}

}