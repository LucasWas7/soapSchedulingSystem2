
package bo.edu.ucbcba.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "showStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showStudent", namespace = "http://ws.ucbcba.edu.bo/")
public class ShowStudent {

    @XmlElement(name = "studentId", namespace = "")
    private String studentId;

    /**
     * 
     * @return
     *     returns int
     */
    public String getStudentId() {
        return this.studentId;
    }

    /**
     * 
     * @param studentId
     *     the value for the studentId property
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
