//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.12.10 at 12:34:23 AM GMT 
//


package ie.gmit.sw.Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HireDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderID",
    "custID",
    "hireDate",
    "returnDate",
    "carID"
})
@XmlRootElement(name = "Order")
public class Order implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "CustID")
    protected int custID;
    @XmlElement(name = "HireDate", required = true)
    protected String hireDate;
    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "CarID")
    protected int carID;
    

    public Order(int orderID, int custID, String hireDate, String returnDate, int CarID) {
		this.orderID = orderID;
		this.custID = custID;
		this.hireDate = hireDate;
		this.returnDate = returnDate;
		this.carID = CarID;
	}
    
	public Order(int orderID) {
		this.orderID = orderID;
	}
	
	public Order(int custID,int carID, String hireDate, String returnDate) {
		this.carID = carID;
		this.custID = custID;
		this.hireDate = hireDate;
		this.returnDate = returnDate;
	}

	public Order() {
		super();
	}

	/**
     * Gets the value of the orderID property.
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     */
    public int getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     */
    public void setCustID(int value) {
        this.custID = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHireDate(String value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the carID property.
     * 
     */
    public int getCarID() {
        return carID;
    }

    /**
     * Sets the value of the carID property.
     * 
     */
    public void setCarID(int value) {
        this.carID = value;
    }

}
