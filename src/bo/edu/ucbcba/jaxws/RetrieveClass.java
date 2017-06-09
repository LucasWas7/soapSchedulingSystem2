
package bo.edu.ucbcba.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrieveClass", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveClass", namespace = "http://ws.ucbcba.edu.bo/")
public class RetrieveClass {

    @XmlElement(name = "code", namespace = "")
    private String code;

    public String getCode() {
        return this.code;
    }


    public void setCode(String code) {
        this.code = code;
    }

}
