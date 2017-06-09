
package bo.edu.ucbcba.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class")
public class Clase {
    
    @XmlElement(name = "code")
    String code;
    @XmlElement(name = "title")
    String title;
    @XmlElement(name = "description")
    String description;

    public Clase(String code, String title, String description) {
        this.code = code;
        this.title = title;
        this.description = description;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
     public void show() {
        System.out.println(code + " title:" + title + " Description: " +description );
    }

    
}
