
package bo.edu.ucbcba.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteClass", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteClass", namespace = "http://ws.ucbcba.edu.bo/")
public class DeleteClass {

    @XmlElement(name = "code", namespace = "")
    private String code;

    /**
     * 
     * @return
     *     returns int
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 
     * @param code
     *     the value for the code property
     */
    public void setCode(String code) {
        this.code = code;
    }

}
