
package bo.edu.ucbcba.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrieveStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveStudent", namespace = "http://ws.ucbcba.edu.bo/")
public class RetrieveStudent {

    @XmlElement(name = "studentId", namespace = "")
    private String studentId;


    public String getStudentId() {
        return this.studentId;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
