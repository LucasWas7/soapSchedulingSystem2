
package bo.edu.ucbcba.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editStudentResponse", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editStudentResponse", namespace = "http://ws.ucbcba.edu.bo/")
public class EditStudentResponse {

    @XmlElement(name = "return", namespace = "")
    private bo.edu.ucbcba.model.Student _return;

    /**
     * 
     * @return
     *     returns Student
     */
    public bo.edu.ucbcba.model.Student getReturn() {
        return this._return;
    }

 
    public void setReturn(bo.edu.ucbcba.model.Student _return) {
        this._return = _return;
    }

}
